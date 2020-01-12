---
title: 'Eclipse Plugins: Submission Plugin: Assignment Definitions'
---
The Web-CAT electronic submission plug-in for Eclipse uses an XML configuration file to describe the assignments that are displayed to the user, and how they will be submitted.

## Structural Overview of the Definition File 

The two primary constructs in the XML file are the _assignment_ and the _assignment group_.

An _assignment group_ is a container for other assignment groups and for assignments -- this allows arbitrary nesting of assignments, so that settings that are common to a group of assignments can be inherited automatically, rather than copying the same properties across several assignments.

An _assignment_ is a submission target to which the user can submit a project.  It cannot contain other assignments or assignment groups.

Among the properties that can be specified in an assignment or assignment group are:

* the files that are to be **included** in the submission,
* the files that are to be **excluded** from the submission,
* files that are **required** to exist before submission can take place,
* the **packager** used to collect the files into an archive for submission, and
* the **transport** method used to submit the archive.

Additionally, there is an _import group_ construct which allows assignment definitions to be stored in external files and included an assignment group when they are required.

A more detailed description of the syntax of the definition file follows.

## Syntax of the Definition File 

The assignment definition file is an XML file whose root element is `<submission-targets>`.  The plug-in submission engine validates this file against its internal schema, so users generating this file by hand should use a root element such as the following:

```
<nowiki><submission-targets xmlns="http://web-cat.cs.vt.edu/submissionTargets"></nowiki>
```

The root can contain the following elements:

* Settings elements:
  * `<include>`: a file pattern that specifies which files are to be included in the submitted archive
  * `<exclude>`: a file pattern that specifies which files are to be excluded from the submitted archive
  * `<required>`: a file pattern that specifies which files must be in the project before it can be submitted
  * `<packager>`: the identifier of a packager that is registered with the plug-in, which will be used to create the archive
  * `<transport>`: the URL to which the project will be submitted
* Structural elements:
  * `<assignment-group>`: a container for inherited settings and assignments
  * `<import-group>`: a container for inherited settings and assignments, loaded from an external definitions file
  * `<assignment>`: A submission target

The settings in the first five tags listed above are inherited by all the assignments and assignment groups in the document, except where these global settings conflict with settings in child elements.  In those cases, the child's settings take precedence.

### Inclusion, Exclusion, and Required Files 

The `<include>`, `<exclude>`, and `<required>` elements each have a single attribute, `pattern`, which specifies the DOS[/ Unix](../..//Unix.html)-style wildcard pattern that matches files that are affected by the tag.  Specifically, the asterisk (`*`) matches zero or more characters, and the question mark (`?`) matches exactly one character.

Each of the three file pattern tags can appear as many times as necessary to specify multiple patterns, or they may not appear at all.  The behavior of the `include`/`exclude` tags depends on whether either, both, or none are used:

* If neither the `include` nor `exclude` tags are used, then every file in the project is included in the submitted archive.
* If `include` tags are used but no `exclude` tags are, then only those files that match the `include`d patterns are submitted.
* If no `include` tags are used but some `exclude` tags are, then all files except those that match `exclude`d patterns are submitted.
* If both `include` and `exclude` tags are used, then only those files that match the `include`d patterns and simultaneously do not match any `exclude`d patterns are submitted.  In the event that a file is matched by an `include` and an `exclude`, then the `exclude` takes priority, and the file is _not_ submitted.

An example of the usage of the inclusion/exclusion tags follows:

```
<nowiki>    <include pattern="*.java"/>
    <include pattern="*.txt"/>
    <exclude pattern="*.class"/>
    <required pattern="Account.java"/></nowiki>
```

In the above example, the submission engine first verifies that the user has a file named `Account.java` in his or her project, and will stop with an error message if the file does not exist.  Otherwise, if the requirements are met, then only the Java source files and text files are packaged in the submission -- any compiled class files are not included.

The `<exclude>` tag above is actually redundant, because the `<include>` tags dictate that only `.java` and `.txt` files will be included in the submission.  However, using `<include>` and `<exclude>` tags in tandem can be useful for adding additional restrictions that cannot be stated with standard wildcard patterns.  Consider the following:

```
<nowiki>    <include pattern="*.java"/>
    <exclude pattern="TestHarness.java"/></nowiki>
```

This pattern set indicates that all `.java` files _except_ `[Test Harness](../../TestHarness.html).java` will be submitted.  Even though the file `[Test Harness](../../TestHarness.html).java` matches both patterns, the exclusion takes precedence.

Furthermore, there is no requirement that a `require`d file also be `include`d.  A potential use for this would be to enforce a policy that the students use a particular file during their own development but do not actually include it with the rest of their project during submission.

### Packagers 

The `<packager>` tag lets the instructor choose how the student's project is archived before submission.  The tag requires an `id` attribute that names the packager to be used, as well as a sequence of optional `<param>` child attributes that specify parameters that are passed to the packager.

The Web-CAT submission plug-in includes two pre-written packagers:

* `edu.vt.cs.submitter.packagers.zip`: Archives the project files into a zip archive.  Parameters are ignored.
* `edu.vt.cs.submitter.packagers.jar`: Archives the project files into a Java JAR archive.  If any parameters are specified, they are added to the JAR manifest.

The default behavior when no custom packager is specified is to use the zip packager, `edu.vt.cs.submitter.packagers.zip`.

If the built-in packagers are not sufficient, instructors can add their own packagers by writing an Eclipse plug-in that extends the submitter plug-in, distributing their extensions to their students, and then using the ID of their packager in the definition file.  For more information on extending the submitter, see [Plugin Extensions](../../PluginExtensions.html). 

A simple example of the usage of the `<packager>` tag:

```
<nowiki>    <packager id="edu.vt.cs.submitter.packagers.jar">
        <param name="studentID" value="${user}"/>
    </packager></nowiki>
```

(The `${user}` tag above substitutes the submitter's username--it is described in more detail later.)

### Transport Protocols 

The `<transport>` tag is at the core of the submitter--this tag indicates where the project archive is to be sent.  It accepts a required `uri` attribute which specifies the URI to which the archive is submitted, as well as a sequence of `param` and `file-param` child elements whose meaning depends on the protocol used in the URL.

The Web-CAT submission plug-in includes support for five standard protocols built-in:

* `http`: Sends the archive as a multi-part HTTP POST request, as if it had been submitted through a form in a web browser.
  * Any `<param>` tags are sent as parts in the request, similarly to `<input>` tags in an HTML form.
  * To include the actual archived file as a part of the request, use the `<file-param>` tag.  The `name` attribute specifies the parameter name (analogous to the `name` attribute in an HTML `<input type="file">` form element), and the `value` attribute specifies the file name that the server will see for the submitted archive.  **Note:** If the `<file-param>` element is not used, the actual project archive will _not_ be sent in the request!
  * **Important:** If ampersand characters (`&`) are used in the URL (common in HTTP requests), they must be converted to XML entities (i.e., `&amp;`) when entered into the XML definition file.  Otherwise, a parsing error is likely to occur when the submission wizard is opened.
* `https`: Sends the archive as a multi-part HTTP POST request over SSL, as if it had been submitted through a form in a web browser.  This protocol has all the same behaviors described for `http` above.
* `ftp`: Sends the archive to an FTP server.  The URL should include a full path on the server, including the destination file name.  You will likely want to use the `${user}` and `${assignment.name}` substitution variables in this path -- see below for more information.
  * All `<param>` or `<file-param>` tags are ignored for this transport protocol.
  * If a username and password is required to log into the FTP server, this can be accomplished using the standard URL syntax, e.g. `ftp://username:password@the.server.com/`
* `mailto`: Sends the archive via e-mail.  The destination address is included in the URL, e.g. `mailto:submissions@cs.foo.edu`
  * The following `<param>` tags are recognized:
    * `name="subject"`: the value of this parameter is used as the subject of the e-mail.
    * `name="auth"`: if the value of this parameter is `"true"`, the username and password entered by the user will be used for authentication by the SMTP server. If this parameter is not `"true"`, the username and password will be ignored.
  * To attach the archived project to the e-mail, use the `<file-param>` tag.  The name of this parameter must be `submission`, and the value is the file name that will be assigned to the attachment.
* `file`: Copies the archive to a location on the local file system, or more usefully, to a mapped network share.
  * The URL should specify a complete path to the file, including the destination file name.
  * All `<param>` and `<file-param>` tags are ignored for this transport protocol.

There is no default transport -- every project _must_ have one specified, if not in the assignment directly, then somewhere up the document tree.

If the built-in protocols are not sufficient, instructors can add their own protocols by writing an Eclipse plug-in that extends the submitter plug-in, distributing their extensions to their students, and then using their custom URI scheme in the definition file.  For more information on extending the submitter, see [Plugin Extensions](../../PluginExtensions.html). 

### Assignment Groups 

The `<assignment-group>` tag is used to collect assignments together, both visually for the user and to share common settings.  An `<assignment-group>` can contain the same child elements as the root `<submission-targets>` element; that is, it can contain `<include>`, `<exclude>`, `<required>`, `<packager>`, `<transport>`, `<assignment-group>`, `<import-group>`, and `<assignment>`.

All assignment groups and assignments in a particular group inherit the settings from their containing group as well as from all its ancestors.  Settings in an assignment group supplement, or in some cases override, settings in its ancestor elements.  In the event that settings in an assignment group and one of its ancestors conflict, the deepest setting takes precedence.  This allows a group to override, for example, the `<transport>` for a particular group of assignments, while leaving the rest of the assignments outside the group unaffected.

An assignment group can be given a name, using the optional `name` attribute.  If a name is specified, then the group will be displayed to the user as a "folder" of assignments.  If the name is omitted, then the group is treated as a transparent collection that is not displayed as nested down another level.  The following example illustrates this:

```
<nowiki>    <assignment name="Assignment 1">...</assignment>
    <assignment-group name="Group">
        <assignment name="Assignment 2">...</assignment>
        <assignment-group>
            <assignment name="Assignment 3">...</assignment>
            <assignment name="Assignment 4">...</assignment>
        </assignment-group>
    </assignment-group></nowiki>
```

The fragment above would be displayed to the user as:

```
<nowiki>    Assignment 1
    Group
      |- Assignment 2
      |- Assignment 3
      \- Assignment 4</nowiki>
```

Notice that Assignments 3 and 4 are displayed at the same nesting level as Assignment 2, even though they are at a deeper level in the actual document.

Assignment groups can also contain an optional `hidden` attribute, with allowable values being `true` or `false`.  If set to `true`, then the group -- and its children -- will be hidden from the user in the submission wizard.

### Assignments 

An `<assignment>` is an actual submission target -- a leaf element that the user can select in the interface and to which he or she can submit a project.  The `<assignment>` tag can contain the five settings elements (`<include>`, `<exclude>`, `<required>`, `<packager>`, and `<transport>`) but cannot contain other `<assignment>`, `<assignment-group>`, or `<import-group>` elements.

The `<assignment>` tag has a required `name` attribute that specifies the name of the assignment displayed to the user.  An optional `hidden` attribute, with allowable values being `true` or `false`, allows the assignment to be hidden from the user in the submission wizard.

### Imported Groups 

An `<import-group>` is a reference to an external assignment definitions file.  This external file is a set of self-contained definitions in its own right -- it has the same `<submission-targets>` root element, and the structure is like any other definitions file.

Like an `<assignment-group>`, an `<import-group>` has a `name` attribute and a `hidden` attribute.  Unlike an `<assignment-group>`, the `name` is required for an `<import-group>` -- all `<import-group>` elements appear in a nested folder of their own.

The `<import-group>` element has an additional attribute -- `href`.  This attribute specifies the absolute URL to the external file from which the definitions should be loaded.  The elements from the external file are then loaded and placed in a folder with the specified `name`, as if they had been placed directly in the main file.  _(TODO: A future version of this should consider allowing relative URLs, so that submission target files can be easily moved without requiring that their contents be changed.)_

`<import-group>` elements are delay-loaded -- that is, the external URL will not be contacted until the imported group is required.  In the standard plug-in, this occurs when the user expands the folder in the submission wizard.  This makes loading the definitions as efficient as possible if there are several imported groups being used.

### Substitution Variables 

In certain locations in the definition file, substitution variables can be used to insert the student's username, password, or the name of the selected assignment into a string.  In the current version of the submission plug-in, the following variables are recognized:

* `${user}` is replaced by the student's username
* `${pw}` is replaced by the student's password
* `${assignment.name}` is replaced by the name of the assignment that the student has selected to submit

These variables may be used in the `uri` attribute of a `<transport>` element, or in the `value` attribute of a `<param>` or `<file-param>` element.  They are ignored elsewhere.

As a simple example, consider the following transport:

```
<nowiki>    <transport uri="ftp://ftp.cs.foo.edu/submissions/${assignment.name}/${user}.zip"/></nowiki>
```

If a student with username "johndoe2" chooses an assignment named "Phonebill", then the project will be uploaded to `ftp://ftp.cs.foo.edu/submissions/Phonebill/johndoe2.zip`.

## A Complete Submission Definition File Example 

The following three example fragments comprise a complete set of submission targets.  The first file, **default.xml** imports definitions from the other two files, **cs1706.xml** and **cs2704.xml**.

**default.xml:**

```
<nowiki><?xml version="1.0" encoding="utf-8"?>
<submission-targets xmlns="http://web-cat.cs.vt.edu/submissionTargets">
    <import-group name="CS 1706" href="http://www.cs.foo.edu/submitter/cs1706.xml"/>
    <import-group name="CS 2704" href="http://www.cs.foo.edu/submitter/cs2704.xml"/>
</submission-targets></nowiki>
```

**cs1706.xml:**

```
<nowiki><?xml version="1.0" encoding="utf-8"?>
<submission-targets xmlns="http://web-cat.cs.vt.edu/submissionTargets">
    <include pattern="*.java"/>
    <exclude pattern="*.class"/>

    <assignment name="Lab 01">
        <required pattern="Gradebook.java"/>
        <transport uri="http://web-cat.cs.vt.edu:9000/cgi-bin/WebObjects.exe/Main.woa/wa/submit">
            <param name="u" value="${user}"/>
            <param name="p" value="${pw}"/>
            <param name="a" value="Lab 01"/>
            <param name="d" value="VTEdAuth"/>
            <file-param name="file1" value="${user}.jar"/>
        </transport>
    </assignment>
</submission-targets></nowiki>
```

**cs2704.xml:**

```
<nowiki><?xml version="1.0" encoding="utf-8"?>
<submission-targets xmlns="http://web-cat.cs.vt.edu/submissionTargets">
    <include pattern="*.cpp"/>
    <include pattern="*.h"/>

    <assignment-group name="Overdue Assignments">
        <assignment name="Basic I/O Streams">
            <transport uri="http://web-cat.cs.vt.edu:9000/cgi-bin/WebObjects.exe/Main.woa/wa/submit">
                <param name="u" value="${user}"/>
                <param name="p" value="${pw}"/>
                <param name="a" value="BasicIOStreams"/>
                <param name="d" value="VTEdAuth"/>
                <file-param name="file1" value="${user}.zip"/>
            </transport>
        </assignment>
    </assignment-group>

    <assignment name="Eco-Simulator">
        <required pattern="test-cases/*.h"/>

        <transport uri="http://web-cat.cs.vt.edu:9000/cgi-bin/WebObjects.exe/Main.woa/wa/submit">
            <param name="u" value="${user}"/>
            <param name="p" value="${pw}"/>
            <param name="a" value="EcoSimulator"/>
            <param name="d" value="VTEdAuth"/>
            <file-param name="file1" value="${user}.zip"/>
        </transport>
    </assignment>
</submission-targets></nowiki>
```

If the electronic submission wizard was loaded from the **default.xml** file, then the fully-expanded tree would look similar to the following:

```
<nowiki>    CS 1706
      \- Lab 01
    CS 2704
      |- Overdue Assignments
      |    \- Basic I/O Streams
      \- Eco-Simulator</nowiki>
```
