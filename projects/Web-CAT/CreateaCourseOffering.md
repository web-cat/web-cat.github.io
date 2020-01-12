---
title: Createa Course Offering
---
## Problem 

You want to create a new course offering for the current semester/term.

## Solution 

[Login To Web Cat](LoginToWebCat.html) if you are not already logged in.

Choose the **Courses** tab, and then click the **New** subtab:

<img href="img/courses-new-tab.png"/>

**Note:** only users who have instructor permissions can create new
courses.  If you don't have instructor permissions, you will not see
the **Courses** tab at all.  If this is the case,
[Contact Your Administrator](ContactYourAdministrator.html) for assistance.

**Step 1: Pick the course**.  Use the drop-down list to select the
course for which you want to create a new offering.  If the course you
want is not listed, [Contact Your Administrator](ContactYourAdministrator.html) for
assistance.  Once you've picked the course, click "Next".

**Step 2: Edit course properties**.  The course you have selected
should already appear in the drop-down list, but your new offering
has not been created yet.  Clicking "Apply" at any time will save
your new course to the database and allow you to continue.  Clicking
"Finish" at any time will commit your save your new course to the
database and complete the editing process.

* Fill in the **CRN** field, which should be a unique identifier for your course offering, distinguishing it from all others.  CRN stands for **course request number**, and many universities have such numbers, although they may use a different name for them.  If your university timetable has a unique ID number for course sections, we suggest you use that as the CRN value.  Some universities use alphanumeric codes instead of numbers: the CRN can be alphanumeric, but it **must not be blank** and it **must be unique**.
* Optionally, fill in the **URL** field with your course offering's home site on the web.  If you enter a value in this field, then references to the course offering on other pages will be hyperlinks to this destination.  If you leave it blank, those references will just be plain text, not hyperlinks.
* The **Moodle Id** and **Group Id** fields offer experimental support for instructors testing out the Moodle-to-Web-CAT gateway. Leave them blank.

At this point, you can use the **Add** buttons to
[Add Another Instructor](AddAnotherInstructor.html) or [Add Another Grader](AddAnotherGrader.html) at this time (or you can come
back and do that later).

Click "Next" to move to Step 3.

**Step 3: Edit student roster**.  This page allows you to enter or
modify the list of students enrolled in your course offering.  You can
use this page to [Upload Your Course Roll](UploadYourCourseRoll.html), for [Adding Students](AddingStudents.html), and for
[Dropping Students](DroppingStudents.html).

Click "Finish" when you are done in order to save your changes to the database.  If you move to a different tab before clicking "Apply" or "Finish", your changes will be cancelled rather than saved.

## Discussion 

At present, you cannot **rename** a course offering by changing the
CRN.  We're working on supporting this feature, but it does not yet
work.  If you change the CRN for a course offering, information about
past submissions and grades for assignments that have already been
processed may become inaccessible.  To fix the situation, edit your
course properties again and **change the CRN back** to what was
originally used to create the course offering.  If you have trouble,
[Contact Your Administrator](ContactYourAdministrator.html).

## See Also 

[Courses And Course Offerings](CoursesAndCourseOfferings.html) <br/>
[Upload Your Course Roll](UploadYourCourseRoll.html) <br/>
[Adding Students](AddingStudents.html) <br/>
[Dropping Students](DroppingStudents.html) <br/>
[Add Another Instructor](AddAnotherInstructor.html) <br/>
[Add Another Grader](AddAnotherGrader.html)

## Comments 

This page is editable on github. To make corrections or improve these
pages, login to github and use the edit icon/link at the end of the
page title for this page.
