---
title: Upload Your Course Roll
---
## Problem 

You want to upload a list of students into your course offering from
an external file.

## Solution 

[Login To Web Cat](LoginToWebCat.html) if you are not already logged in.

Choose the **Courses** tab, and then click the **Properties** subtab:

<img href="img/courses-properties-tab.png"/>

**Note:** only users who have instructor permissions can edit
course offerings.  If you don't have instructor permissions, you will
not see the **Courses** tab at all.  If this is the case, contact your
Web-CAT administrator for assistance.

**Step 1: Pick the course**.  Click the radio button next to the
course offering you want to edit.  Once you've picked the course
offering, click "Next".

**Step 2: Edit course properties**.  You can use this page to
edit the URL associated with your course offering, or you can use the
**Add** buttons to [Add Another Instructor](AddAnotherInstructor.html) or [Add Another Grader](AddAnotherGrader.html).
Click "Next".

**Step 3: Edit student roster**.  This page allows you to enter or
modify the list of students enrolled in your course offering.  At the
top of the page, you will see a list of students who are currently
enrolled in your course offering.

Next, you'll see a box for uploading a student roster in CSV format:

<img href="img/upload-csv-roster.png"/>

Finally, you'll see a multi-paged list of all user accounts on
Web-CAT, with "Add" buttons so that you can individually add new
students.

Most instructors **upload a CSV file**.  Read the
[Web-CAT help on CSV student rosters](http://web-cat.cs.vt.edu/Web-CAT.help/Grader/CourseRosterPage.php?t1=3&t2=0&t3=2&ua=100)
for information on the format of the CSV file.

Unless you are at Virginia Tech, use the
[Generic CSV format](http://web-cat.cs.vt.edu/Web-CAT.help/Grader/CourseRosterPage.php?t1=3&t2=0&t3=2&ua=100).
Virginia Tech users can directly download electronic roster's from the
VT banner system and upload them using the alternate VT Banner CSV
format.  If you want to propose a different format, contact your
Web-CAT administrator.

    **To upload a roster:** First, make sure you have a CSV file in the
appropriate format.  Then, select the institution the new students
should belong to from the drop-down list (the default is for them to
belong to the same institution as the instructor performing the
upload).  Make sure your CSV format is selected in the second
drop-down list.  Click the "Browse" button to navigate to and select
your CSV file on your local hard disk, and then click "Upload".
    Any students in your uploaded CSV file who do not already exist in
Web-CAT's database will have an account created for them
automatically.  If you are using passwords stored locally in the
Web-CAT server, then new account owners will be automatically mailed
a welcome message containing login information and a randomly
generated password.
    Any students in your uploaded CSV file who are not already enrolled
in your course offering **will be added** to your roster.  Students
who are already enrolled are **not** removed (i.e., the upload is
"additive", and only enrolls more students).

If you visit your course's properties later, you can upload additional
CSV files.  You can also use this page for [Dropping Students](DroppingStudents.html).

**Click "Apply" or "Finish"** to save your changes.

## Discussion 

If you want to add a student who does not yet have a Web-CAT account,
the only way to do it is by uploading a CSV file (even if it has only
one entry).

You cannot use CSV files to remove (drop) students.

## See Also 

[Adding Students](AddingStudents.html) <br/>
[Dropping Students](DroppingStudents.html) <br/>
[Add Another Instructor](AddAnotherInstructor.html) <br/>
[Add Another Grader](AddAnotherGrader.html)

## Comments 

This page is editable on github. To make corrections or improve these
pages, login to github and use the edit icon/link at the end of the
page title for this page.
