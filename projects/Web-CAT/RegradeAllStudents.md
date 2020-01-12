---
title: Regrade All Students
---
## Problem 

You want to regrade the assignments that have already been submitted
by students in your course offering.  You might want to do this
because you have discovered and fixed an error in instructor-provided
reference tests, data files, or the assignment configuration itself.

## Solution 

This recipe assumes that you have already created an assignment (see
[Create An Assignment](CreateAnAssignment.html)), and that  students have already begun making
submissions.

[Login To Web Cat](LoginToWebCat.html) if you are not already logged in.

Choose the **Assignments** tab:

<img href="img/assignments-properties-tab.png"/>

**Note:** only users who have instructor permissions can create new
assignments.  If you don't have instructor permissions, you will not see
the **Assignments** tab at all.  If this is the case,
[Contact Your Administrator](ContactYourAdministrator.html) for assistance.

**Step 1: Pick the course**.  Click the radio button next to the
course offering to which the assignment belongs.  Once you've
picked the course offering, click "Next".

**Step 2: Pick the assignment**.  You will see the list of
assignments that you have already created for this course offering.
Select the assignment you wish to regrade.  Click "Next".

**Step 3: Edit assignment properties**.  This page shows the
assignment's properties.

Under the **properties unique to this course offering**, click the
button labeled **Regrade Everyone**.  Click "Finish".

## Discussion 

This action will regrade the most recent submission for everyone in
this course offering that has made at least one submission.  All old
data about the submission (all grading results, scores, feedback,
etc.) will be deleted, and the original submission will be re-queued
and reprocessed using the configured plug-ins for this assignment,
just as if the assignment was freshly submitted.

The timestamp on the submission will remain unchanged--that is, it
will still retain the original submission time, which will not change.
Only the scoring information and feedback will be thrown away and
regenerated.

Note that if any manual grading has been performed on this
submission--for example, if an instructor or grader has made manual
comments or point deductions using the "Grading" tab--all manual
grading information for this submission will also be deleted and must
be re-entered by hand.

Also, this action only regrades the _most recent_ submission for
each student, not _all_ submissions the student has ever made for
this assignment.  Usually, only the most recent submission is
relevant.  If you wish to regrade an older submission for a given
student, you must do that by looking up the submission you are
interested in, and then follow the instructions to [Regrade One Student](RegradeOneStudent.html).

## See Also 

[Create An Assignment](CreateAnAssignment.html) <br/>
[Set Late Policy](SetLatePolicy.html) <br/>
[Give Early Bonuses](GiveEarlyBonuses.html) <br/>
[Regrade One Student](RegradeOneStudent.html) <br/>
[Move Back Due Date](MoveBackDueDate.html)

## Comments 

This page is editable on github. To make corrections or improve these
pages, login to github and use the edit icon/link at the end of the
page title for this page.
