---
title: Configure Eclipse Submitter
---
## Problem 

You want to set up Eclipse so that students can submit directly to Web-CAT from
within Eclipse using the [Eclipse Plugins / Submission Plugin](EclipsePlugins/SubmissionPlugin/)
.

## Solution 

There are two parts to this recipe: you must configure your Web-CAT assignments
so they are published for Eclipse submission, and then you must tell Eclipse how to
find out what assignments are available.

### Configure Your Web-CAT Assignment 

Use the Assignments tab to edit your assignment's properties.

Under **Grading Scheme for All Instances**, look for the **submission rules** setting for your assignment and click the edit icon next to your selected set of submission rules.

Look for the **External Submission Engines[/ Plug](/Plug.html)-ins** section at the bottom of the submission rules page.  Select _List for Eclipse submitter_' in the dropdown list.  Then click "Apply All" to save your changes.

Now all assignments that share these specific submission rules will be available for Eclipse submission.  If you have other assignments that use different submission rules, and you want them to be available for Eclipse submission as well, repeat the process.

### Configure Eclipse 

The Eclipse submission plug-in reads which assignments are available from a URL.  This URL can point to a hand-written text file managed by an instructor, or to a dynamically generated file (or even a dynamically generated file that includes hand-written content from multiple sources!).

Normally, however, instructors who are using Web-CAT just want Eclipse to read the assignment information directly from Web-CAT.  To configure Eclipse, use the Eclipse preferences dialog.

Within Eclipse, select the Window->Preferences... menu command.

Select **Electronic Submission** from the tree on the left.

Enter your Web-CAT server's URL in the **Assignment definition URL** box.  The URL will be similar to this one, from Virginia Tech's main Web-CAT server:

```
<nowiki>http://web-cat.cs.vt.edu/Web-CAT/WebObjects/Web-CAT.woa/wa/assignments/eclipse</nowiki>
```

To find the URL for your own institution, replace the initial part of the url, "http...Web-CAT.woa" with the corresponding URL that your Web-CAT server uses for its pages.

If desired, enter your Web-CAT user name in the **Default username** box.

Click "OK".

## Discussion 

If you are sharing one of the VT Web-CAT servers with others, you can limit the assignments visible to your students by adding a parameter to the URL.  For example, adding "?institution=Dickinson" to the end of the URL will limit the display to only assignments associated with Dickinson College (or use VT for Virginia Tech, etc).  For more details, [Contact Your Administrator](ContactYourAdministrator.html).

Other parameters can also be added to the URL to limit display to a single course or a single course offering, or to display staff-accessible assignments rather than just those visible to students.

## See Also 

[Create An Assignment](CreateAnAssignment.html) <br/>
[Create An Assignment Walkthrough](CreateAnAssignmentWalkthrough.html) (34Mb, 9min) <br/>
[Configure BlueJs Submitter](ConfigureBlueJsSubmitter.html)

## Comments 

This page is editable on github. To make corrections or improve these
pages, login to github and use the edit icon/link at the end of the
page title for this page.
