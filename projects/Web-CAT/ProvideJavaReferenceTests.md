---
title: Provide Java Reference Tests
---
## Problem 

You want to provide some hidden reference tests that will be used
to assess the completeness and correctness of student work on a Java
assignment.

## Solution 

This recipe assumes that you have already created an assignment (see
[Create An Assignment](CreateAnAssignment.html)) that uses the [JavaTddPlugin](JavaTddPlugin/).

It also assumes that you have written one or more
[JUnit](http://junit.org/) test case classes that you want to compile
and run against student submissions.  You will need the Java source
file(s) for the test classes you wish to use.  If you don't know what TDD
is, first read [Test Driven Development](TestDrivenDevelopment.html) and learn about it.

Follow the instructions in [Configure Plugin Settings](ConfigurePluginSettings.html) to edit the
plug-in's settings.

Under the plug-in's **assignment-specific options**, look for the
**JUnit Reference Test Class(es)** option.

Click the **Browse...** button next to the parameter.

This will take you to a a page showing the file space for your plug-in
configuration files.  You have one personal folder where you can place
all of the files for all of your assignments.  Note that you can
create your own subfolders to organize your files.  It is a good idea
to use folders to group together and organize the files you upload.
Many instructors start off with one subfolder for each course they
teach, and with those, a separate subfolder for each assignment within
a course.

To create a subfolder, use the **new folder name:** field under
**Create a New Subfolder**.  Select the desired parent directory
from the drop-down list to the left.  Then click the "Create Folder"
button.

Once you have the folder where you want to place your test case(s), it
is time to upload a file.  Under **Upload a New File**, select the
destination folder in the drop-down list.  Then click the
**Browse...** button and locate the desired source file on your
local machine.  Then press the "Upload File" button.

If you just have one Java test class, you only need to upload one
file.  If you have multiple test classes, upload each one.
Alternatively, if you package your source files into a zip file, you
can select the zip for uploading and **check the unzip/expand box**
in the upload section.  Your zip file will be sent to the server and
then unpacked in the selected destination directory.

### Example 1: A Single Test Class 

Suppose you are teaching CS101, and have a test class in a file called
`MyTests.java` that you want to use for your Program 1 assignment.
Also, suppose that the `MyTests` class is in the default package.

You might create a subfolder in your personal space called `CS101` to
hold all of your resources for that course.  Within it, you might
create `CS101/Program1` to hold the resources for that assignment.

Now, select `CS101/Program1` from the drop-down list under "Upload a
New File".  Click the "Browse..." button and locate your
`MyTests.java` source file.  After selecting it, click the "Upload
File" button.

The page will refresh, and you should now see the
`CS101/Program1/MyTests.java` file in your folder view.  Click the
"Select" button to the left of this file in order to select it as the
test case you want to use.  Click "Next" to return to
[Configure Plugin Settings](ConfigurePluginSettings.html).  Remember that your options will not be saved
until you press "Apply All" or "Finish".

### Example 2: Two Test Classes in Packages 

Suppose that for the CS101 assignment Program 1, you actually have two
separate test classes in different Java packages:
`myschool.general.StudentTests` and `myschool.program1.InterfaceTest`.
Also, suppose that you had already created your `CS101/Program1`
folder.

Since your test classes are in packages, we want the folder structure
to reflect the Java package structure.  Create a new folder called
`myschool` in `CS101/Program1`.  Then create a new folder called
`general` in `CS101/Program1/myschool`.

Upload your `StudentTests.java` source file to the
`CS101/Program1/myschool/general` folder.

Create a `program1` subfolder in `CS101/Program1/myschool`.  Upload
your `InterfaceTest.java` source file into it.

Now you can click the "Select" button to the left of the
`CS101/Program1` folder, since it contains all of your test cases,
which are arranged within it in subfolders according to their Java
package structure.

If you had many test case classes, you might want to package them up
in a zip file.  When doing this, make sure that the zip file contains
a folder structure that mirrors what you want to unpack.  For example,
if a zip file contained `myschool/general/StudentTests.java` and
`myschool/program1/InterfaceTest.java`, then you could upload and
unpack that zip file into `CS101/Program1`.  You would end up with the
same file structure produced by uploading the files individually as
described above.

**Note:** it is a bad idea to unload your test case classes in the
root of your personal folder.  If you do this, you will be tempted to
"Select" your entire personal folder as the value for your plug-in's
test case option.  But if you do this, as you add new test classes for
later assignments, **all** of the test classes located _anywhere_
in your entire personal space will be treated as test cases for this
one assignment!  Instead, if you start using subfolders early, you
will avoid this problem.

After selecting the directory, click "Next" to return to
[Configure Plugin Settings](ConfigurePluginSettings.html).  Remember that your options will not be saved
until you press "Apply All" or "Finish".

## Discussion 

Remember that the [JavaTddPlugin](JavaTddPlugin/) requires you to provide Java source
files for reference tests.  All reference tests must have names that
end in "Test" or "Tests" (case-insensitive).  Sources are required in
order to double-check that the student's submission typechecks against
the reference tests correctly, and that appropriate and meaningful
diagnostics are generated if not.

## See Also 

[Create An Assignment](CreateAnAssignment.html) <br/>
[Choose Your Plugin](ChooseYourPlugin.html) <br/>
[Configure Plugin Settings](ConfigurePluginSettings.html) <br/>
[JavaTddPlugin](JavaTddPlugin/)

## Comments 

This page is editable on github. To make corrections or improve these
pages, login to github and use the edit icon/link at the end of the
page title for this page.
