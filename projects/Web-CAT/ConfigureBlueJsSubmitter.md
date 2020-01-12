---
title: Configure Blue Js Submitter
---
## Problem 

You want to set up [BlueJ](BlueJ.html) so that students can submit directly to Web-CAT from
within [BlueJ](BlueJ.html) using the [BlueJ submitter extension](http://www.bluej.org/extensions/submitter/submitter.html).

## Solution 

There are two parts to this recipe: you must configure your Web-CAT assignments
so they are published for [BlueJ](BlueJ.html) submission, and then you must tell [BlueJ](BlueJ.html) how to
find out what assignments are available.

### Configure Your Web-CAT Assignment 

Use the Assignments tab to edit your assignment's properties.

Under **Grading Scheme for All Instances**, look for the **submission rules** setting for your assignment and click the edit icon next to your selected set of submission rules.

Look for the **External Submission Engines[/ Plug](/Plug.html)-ins** section at the bottom of the submission rules page.  Select _List for [BlueJ](BlueJ.html) submitter_' in the dropdown list.  Then click "Apply All" to save your changes.

Now all assignments that share these specific submission rules will be available for [BlueJ](BlueJ.html) submission.  If you have other assignments that use different submission rules, and you want them to be available for [BlueJ](BlueJ.html) submission as well, repeat the process.

### Configure [BlueJ](BlueJ.html) 

The [BlueJ](BlueJ.html) submitter extension uses an external `submission.defs` file to specify which assignments are available and how they should be submitted.

Often, instructors provide one master file that will be used for all assignments, which is the easiest approach if you are using Web-CAT.  Ideally, the `submission.defs` file should be placed in the lib folder of the [BlueJ](BlueJ.html) installation (<BLUEJ_HOME>/lib), where it will affect all assignments for all users.  Alternatively, individual users can place their own `submission.defs` file in their own [BlueJ](BlueJ.html) configuration directory (<USER_HOME>/.bluej on Solaris[/ Linux](/Linux.html), <USER_HOME>\bluej on Windows, or ~[/ Library](/Library.html)[/ Preferences](/Preferences.html)/org.bluej on Mac OS X). Definitions found there will be used for all [BlueJ](BlueJ.html) projects opened by that user.

The `submission.defs` file should contain a single line like this one:

```
<nowiki>.insert = http://web-cat.cs.vt.edu/Web-CAT/WebObjects/Web-CAT.woa/wa/assignments/bluej;</nowiki>
```

This line works for the main Web-CAT server at Virginia Tech.  To customize this line for your own institution, replace the initial part of the url, "http...Web-CAT.woa" with the corresponding URL that your Web-CAT server uses for its pages.

## Discussion 

If you are sharing one of the VT Web-CAT servers with others, you can limit the assignments visible to your students by adding to the URL in the `submission.defs` file.  For example, adding "?institution=Dickinson" to the end of the URL (before the semicolon terminating the line) will limit the display to only assignments associated with Dickinson College (or use VT for Virginia Tech, etc).  For more details, [Contact Your Administrator](ContactYourAdministrator.html).

Other parameters can also be added to the URL to limit display to a single course or a single course offering, or to display staff-accessible assignments rather than just those visible to students.

## See Also 

[Create An Assignment](CreateAnAssignment.html) <br/>
[Create An Assignment Walkthrough](CreateAnAssignmentWalkthrough.html) (34Mb, 9min) <br/>
[Configure BlueJs Submitter](ConfigureBlueJsSubmitter.html)

## Comments 

This page is editable on github. To make corrections or improve these
pages, login to github and use the edit icon/link at the end of the
page title for this page.
