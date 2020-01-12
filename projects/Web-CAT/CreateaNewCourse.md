---
title: Createa New Course
---
## Problem 

You want to add a completely new course, **not** just another course offering, to your Web-CAT
server.

## Solution 

Be sure you do not want to just [Createa Course Offering](CreateaCourseOffering.html)--check on the difference
between [Courses And Course Offerings](CoursesAndCourseOfferings.html) if you are not sure.

This task requires **administrator privileges**.

[Login To Web Cat](LoginToWebCat.html), then click on the **Administer** tab and then the
**Edit Database** subtab.

Select **Course** from the Entities list at the top of the page and then click
the **New** button.

Fill in the information for your course.  Select the department to which the
course belongs.  If your new course belongs to a department that does not
yet have any courses on your Web-CAT server, you may need to
[Createa New Department](CreateaNewDepartment.html).  The **name** of the course is
it's full name, like "Introduction to Java".  The number is the
course number (minus any department-specific alphanumeric prefix), like "101".  

Leave the Core Selections and Offerings entries alone.

Click **Save** when you are done.

## Discussion 

Normally, you create a course or two when you complete the Web-CAT
self-installation wizard.  You'll only need this recipe if you want to include
new courses that are not yet listed on your server.

In course listings, courses are identified by their department abbreviation
(say, "CS") and their course number (say, "101"), like this: **CS 101**.  The
abbreviation comes from the department to which the course belongs.

## See Also 

[Createa New Department](CreateaNewDepartment.html) <br/>
[Createa Course Offering](CreateaCourseOffering.html)

## Comments 

This page is editable on github. To make corrections or improve these
pages, login to github and use the edit icon/link at the end of the
page title for this page.
