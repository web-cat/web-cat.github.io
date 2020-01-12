---
title: Createa New User
---
## Problem 

You wish to create a new Web-CAT account for a user than does not have one.

## Solution 

If the account is for a student, the easiest way to create their account is to
create a CSV file containing their information and then [Upload Your Course Roll](UploadYourCourseRoll.html).
This will create their account if it does not already exist, and will also enroll
them in your course.

If you are creating an account for someone other than a student,
this task requires **administrator privileges**.

[Login To Web Cat](LoginToWebCat.html), then click on the **Administer** tab and then the
**Edit Database** subtab.

Select **User** from the Entities list at the top of the page and then click
the **New** button.

Fill in the information for the new user account.  Only three fields are required:

* The **user name** is the account name for the user.
* The **password**, if you are using built-in database authentication, stores the user's initial password (the user can change this at any time after logging in; see [Change Your Password](ChangeYourPassword.html)).
* The **authentication domain** is the user's institution affiliation, and must be set.

All other fields are optional.  Feel free to leave them blank or ignore them if you
do not know what they mean.

One useful field is the **access level**, which indicates the user's default
permissions level.  Normally, accounts have a permissions level of zero (0),
which is typical for student accounts.  Other meaningful values include:

* Administrators have a level of 90 or greater (typically 100).
* Instructors, who can create courses and create/edit assignments, have a level of 50-79 (typically 50).
* Grading assistants, who can view submissions, edit grades, and comment on student work, have a level of 40-49 (typically 40).
* Students have a level 0-30 (typically 0).

After entering the information, click **Save**.

## Discussion 

If your Web-CAT server is using LDAP authentication, student accounts are automatically created the first time they
login.  The student account won't be enrolled in any courses, and so they will not be able to do much other than
edit their account information, but there is no need for an administrator to be involved unless the person needs
instructor-level access.

One popular feature request is the ability to create new accounts using
a CSV file, just as when you [Upload Your Course Roll](UploadYourCourseRoll.html).  We're working on it!

## See Also 

[Upload Your Course Roll](UploadYourCourseRoll.html) <br/>
[Createa New Grader](CreateaNewGrader.html) <br/>
[Createa New Instructor](CreateaNewInstructor.html)

## Comments 

This page is editable on github. To make corrections or improve these
pages, login to github and use the edit icon/link at the end of the
page title for this page.
