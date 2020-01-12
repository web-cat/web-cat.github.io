---
title: Create An Assignment
---
## Problem 

You want to create a new assignment offering for your students.

## Solution 

This recipe assumes that you already have a course offering (see
[Createa Course Offering](CreateaCourseOffering.html)), and that your student roll has already
been set up (see [Upload Your Course Roll](UploadYourCourseRoll.html)).

[Login To Web Cat](LoginToWebCat.html) if you are not already logged in.

Choose the **Assignments** tab:

<img href="img/assignments-properties-tab.png"/>

**Note:** only users who have instructor permissions can create new
assignments.  If you don't have instructor permissions, you will not see
the **Assignments** tab at all.  If this is the case,
[Contact Your Administrator](ContactYourAdministrator.html) for assistance.

**Step 1: Pick the course**.  Click the radio button next to the
course offering for which you want to add an assignment.  Once you've
picked the course offering, click "Next".

**Step 2: Pick the assignment**.  You will see the list of
assignments that you have already created for this course offering.
By selecting an existing assignment, you can edit its properties.
To create a new assignment, select the radio button in the last
row of the table to **add another assignment**.  Click "Next".

* **Create or reuse?** When you add a new assignment, you have the choice of creating a completely new assignment, or simply creating another offering of an existing assignment you have created before.  Select the first radio button to **create a new assignment**.

    Alternatively, if you have multiple sections of a course, you can "share" one assignment among all of your sections by creating it once, and then adding it to each section (to each course offering) by selecting it from the list that Web-CAT offers.

Click "Next".

**Step 3: Edit assignment properties**.  This page shows both the
shared **properties for all instances of this assignment**, as well
as the **properties unique to this course offering**.

### Properties for All Instance of This Assignment 

This portion of the assignment properties page looks like this:

<img href="img/edit-assignment-properties1.png"/>

Enter data in the following fields:

* **Name:** Provide a short identifier that uniquely identifies this assignment from all others in this course offering.  For example, you can use "Program 1" or "P2" or "Project-3".  This name is used to create human-readable directory names in the file store (after stripping non-alphanumeric characters).  This name will be used as the "abbreviated" identifier when listing assignments.
* **Short Description:** Provide a brief, one-line title for your assignment. One- to four-word phrases are a good target, such as "Sudoku Solver".  This will be used in conjunction with the name when a longer assignment title is used, e.g., "Project 3: Sudoku Solver". The short description is optional.
* **URL:** Optionally, enter a URL for more information about the assignment--an assignment writeup or a program specification, for example.  If provided, occurrences of the assignment name in various places will also be hyperlinks to this destination.  If omitted, plain text instead of hyperlinks will be used instead.
* **Moodle Id:** This field offers experimental support for instructors testing out the Moodle-to-Web-CAT gateway. Leave it blank.
* **Upload Instructions:** Optionally, enter any assignment-specific instructions that you want students to see when they upload submissions through Web-CAT's web interface.  Any content you insert here will be included in the HTML page where users select files to upload and submit.  You can use full HTML markup in your instructions, which will be inserted unfiltered in the page students see.  Note that these instructions will only be available to students who submit using their web browser--they will not be seen by students who submit from an IDE, such as [BlueJ](BlueJ.html) or Eclipse.

#### Grading Scheme for All Instances 

The grading scheme is shared by all offerings of this assignment.  The
grading scheme consists of a policy defining the submission rules, and
a series of one or more plug-ins that specify how student submissions
are processed and scored.

##### Submission Rules 

The **submission rules** define the policy that governs acceptance
of student submissions, including the points available, limits on the
number or size of submissions, the applicable late policy, and any
penalties for late submissions (or bonuses for early submissions).

<img href="img/submission-rules.png"/>

If you have already created one or more submission rule profiles, you
can pick from among them using the drop-down list.  You can edit the
settings for the selected submission rules using the edit icon to the
right of the drop-down list.  You can create a completely new
submission rule profile using the "New" button.

You **must** select the submission rules to use before you can save
your work.  Either select an available set from the drop-down list, or
click "New" to create one now.

When you create a new submission rule profile, or edit an existing
one, you can set its **basic properties**, including the number of
points allocated for manual grading by course staff (such as a TA or
grader), for static analysis tools, and for correctness/testing.  The
total points for the assignment are the sum of the three categories.

You can specify the maximum number of submissions and the maximum
upload size in bytes (the normal default is 200,000).

You can specify when Web-CAT should begin accepting submissions for the
assignment--say, two hours before the due date for a closed lab, or
leave blank for unlimited.

You can specify when Web-CAT should begin **refusing submissions**
for an assignment--say, allowing submissions up to one week after the
due date.  Use this setting to permit lat submissions.  A value of
zero will deny all late submissions.

You can also specify that bonus points be awarded for early
submissions, or penalty points be deducted for late submissions--say,
a penalty of 10 points per day late, or a bonus of 10 points per day
early.

After editing the submission profile, click "Next" to continue.

##### Grading Steps 

The grading scheme for the assignment also includes a list of
**steps** used in processing each submission.  For a brand new assignment,
no steps will be listed:

<img href="img/plug-in-steps1.png"/>

Each submission is processed by a **pipeline** of one or more
grading plug-in(s) that are applied in order.

Use the **"Add"** button to add a new step (plug-in) to the
processing sequence.  Use the **Move** icons to change the order in
which the plug-ins are applied, if there is more than one.  Use the
**Action** icons to configure each plug-in, or remove it from the
sequence entirely.

Click the "Add" button to [Choose Your Plugin](ChooseYourPlugin.html), then click the Edit icon
to configure it.

<img href="img/plug-in-steps2.png"/>

### Properties Unique to This Course Offering 

This section of the assignment properties page lists those properties
that are unique to this offering of the assignment, as opposed to
those that are shared by all offerings of this assignment.

<img href="img/edit-assignment-properties2.png"/>

**Set the due date** by clicking the calendar icon next to the
due date box:

<img href="img/due-date-calendar.png"/>

Select the date in the pop-up calendar.  Change the
time at the bottom of the pop-up calendar by click-and-drag on the
hour, minute, or am/pm field.  Click on "show upcoming assignment
deadlines" to see when other instructors have scheduled due dates on
this server (to avoid bunching up or conflicts).

The **score summary** is a mini-histogram showing the distribution
of scores for students who have submitted so far (not including
the manually graded portion of scores).  You can clear the cached data
used to generate these histograms, if needed.

<img href="img/assignment-score-summary.png"/>

The **Moodle Id** allows you to override the Moodle Id that is set
for the assignment as a whole, and use different Moodle Ids for each
assignment offering, if desired.  This feature is part of our
experimental support for the Moodle-to-Web-CAT gateway, and should be
left blank by most users.

The check box labeled **Publish it** determines whether or not the
assignment is visible and available to students.  Normally,
instructors create, try out, and tweak their assignments before
publishing them for student access.  When this box is unchecked, only
course staff can access the assignment.

The **Suspend all grading** check box can be used to disable
processing of any further submissions for an assignment.  Any
submissions made will be accepted and queued up, but will not be
processed.  Instructors can use this feature if  they discover a
problem in their assignment specification, for example, and need some
time to correct their reference tests or the grading setup.  Turning
off grading in the mean time prevents students from receiving
incorrect or misleading scores.  When you uncheck this box and the
click "Apply All" or "Finish", all submissions that have been queued
up will be processed.

The **Regrade Everyone** button allows you to [Regrade All Students](RegradeAllStudents.html).

## Discussion 

This recipe covers basic assignment setup.  Note that most
configuration options governing how an assignment is processed belong
to the individual plug-ins that make up the grading step(s) you have
chosen for this assignment.

[Choose Your Plugin](ChooseYourPlugin.html) to explore configuration options for grading plug-ins.

## See Also 

[Choose Your Plugin](ChooseYourPlugin.html) <br/>
[Multiple Course Sections](MultipleCourseSections.html) <br/>
[Set Late Policy](SetLatePolicy.html) <br/>
[Give Early Bonuses](GiveEarlyBonuses.html) <br/>
[Hide An Assignment](HideAnAssignment.html) <br/>
[Regrade One Student](RegradeOneStudent.html) <br/>
[Regrade All Students](RegradeAllStudents.html) <br/>
[Move Back Due Date](MoveBackDueDate.html)

## Comments 

This page is editable on github. To make corrections or improve these
pages, login to github and use the edit icon/link at the end of the
page title for this page.
