---
title: Set Late Policy
---
## Problem 

You want to set the late policy for an assignment so that students are
still allowed to make submissions after the deadline has past (within
limits).

## Solution 

This recipe assumes that you have already created an assignment (see
[Create An Assignment](CreateAnAssignment.html)).

[Login To Web Cat](LoginToWebCat.html) if you are not already logged in.

Choose the **Assignments** tab:

<img href="img/assignments-properties-tab.png"/>

**Note:** only users who have instructor permissions can create new
assignments.  If you don't have instructor permissions, you will not see
the **Assignments** tab at all.  If this is the case,
[Contact Your Administrator](ContactYourAdministrator.html) for assistance.

**Step 1: Pick the course**.  Click the radio button next to the
course offering for which you want to edit an assignment.  Once you've
picked the course offering, click "Next".

**Step 2: Pick the assignment**.  You will see the list of
assignments that you have already created for this course offering.
Select the assignment you wish to edit.  Click "Next".

**Step 3: Edit assignment properties**.  This page shows both the
shared **properties for all instances of this assignment**, as well
as the **properties unique to this course offering**.

Under the properties for all instances of this assignment, the
grading scheme for all instances contains the selected **Submission
Rules**.  The submission rules determine the late policy.

Click the edit icon next to the selected submission rules to
edit them.

### Choose the Window for Late Submissions 

Decide how late you will permit submissions to be accepted.  Say
you want to allow students to turn in an assignment up to 5 days
late.

In the **Stop accepting** field, enter the number 5.  In the
time unit drop-down list next to the field, select "Days".

This setting determines how long after the specified due date Web-CAT
will continue to accept submissions from students.

### Assign a Penalty 

Decide how much penalty (if any) students will receive for late
submissions.  Suppose that students will receive a 10 point penalty
per day for late submissions, up to a maximum of 50 points for a
submission that is 5 days late.

Check the box next to **deduct penalty for late submissions**.

Fill in the blanks to read **"deduct at most 50 pts in increments of
10 for every 1 day(s) late"**.

As another example, suppose that students will receive a flat penalty
of 20 points for any late submission, no matter how late.  Fill in the
blanks to read **"deduct at most 20 points in increments of 20 for
every 1 min(s) late"**.

If you do not check the box next to "deduct penalty for late
submissions", then late submissions will not be subject to any
extra deductions.

## Discussion 

If you edit a submission rule profile, your changes will affect all
assignments that use this profile.

Submission rules can be reused from assignment to assignment to
assignment, from course to course to course.  As a result, it is
helpful to set up (and give a useful name to) one set of submission
rules for an entire course's worth of assignments that you intend to
treat the same way.

For example, in Virginia Tech's CS1, we have both out-of-class
programming assignments, and also closed-lab assignments.  So the CS1
instructor usually sets up two submission profiles: one governs
out-of-class assignments, which often have a more generous late
policy, and a second governs closed-lab work, which typically have no
late penalty but only allow assignments to be accepted up to 15
minutes after the lab session ends.

## See Also 

[Create An Assignment](CreateAnAssignment.html) <br/>
[Choose Your Plugin](ChooseYourPlugin.html) <br/>
[Multiple Course Sections](MultipleCourseSections.html) <br/>
[Give Early Bonuses](GiveEarlyBonuses.html) <br/>
[Hide An Assignment](HideAnAssignment.html) <br/>
[Regrade One Student](RegradeOneStudent.html) <br/>
[Regrade All Students](RegradeAllStudents.html) <br/>
[Move Back Due Date](MoveBackDueDate.html)

## Comments 

This page is editable on github. To make corrections or improve these
pages, login to github and use the edit icon/link at the end of the
page title for this page.
