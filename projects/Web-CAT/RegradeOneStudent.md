---
title: Regrade One Student
---
## Problem 

You want to regrade one student's submission.  You might want to do this
because you have discovered and fixed a minor problem that this
student ran into, but that hasn't affected others in the class.

## Solution 

This recipe assumes that you have already created an assignment (see
[Create An Assignment](CreateAnAssignment.html)), and that the student in question has already made
at least one submission.

[Login To Web Cat](LoginToWebCat.html) if you are not already logged in.

Choose the **Grading** tab, where you will begin on the **Enter
Remarks** subtab:

<img href="img/grading-enter-remarks-tab.png"/>

**Note:** only users who have grader or instructor permissions can
perform grading actions.  If you don't have sufficient permissions,
you will not see the **Grading** tab at all.  If you are the grader
for a course, contact the course instructor so that he or she can add
you to the list of graders (see [Add Another Grader](AddAnotherGrader.html)).

**Step 1: Pick the course**.  Click the radio button next to the
course offering to which the assignment belongs.  Once you've
picked the course offering, click "Next".

**Step 2: Pick the assignment**.  You will see the list of
assignments for this course offering.
Select the assignment you wish to regrade.  Click "Next".

**Step 3: Pick the student**.  You will see a list of students
enrolled in this course offering who have made submissions to this
assignment.  Click the link in the **TA** column for the student you
are interested in.

**Step 4: Grade student's submission**.  You will see the results
for the latest submission by the selected student.  This is the same
page where you would [Manually Gradea Student Submission](ManuallyGradeaStudentSubmission.html).

If you want to regrade the _most recent_ submission by this student,
you are already in the correct place.  If you want to examine or
regrade a _previous_ submission that the student made earlier, then
click the **View Other Submissions** button just below the summary
table at the top of the page and select the submission number that you
are interested in.

Once you have located the submission you want to regrade, click the
**Regrade Submission** button, which is located just below the
summary table at the top of the page.

**Confirm regrade of this submission**.  You will receive a
confirmation page.  Click "Proceed" to delete current feedback for
this submission and re-queue the student's work for regrading.  Click
"Cancel" if this is not the action you want to take.

## Discussion 

This action will regrade the selected submission for the selected
student--just the single submission you are viewing.  All old
data about this submission (all grading results, scores, feedback,
etc.) will be deleted, and it will be re-queued and reprocessed using
the configured plug-ins for this assignment, just as if the assignment
was freshly submitted.

The timestamp on the submission will remain unchanged--that is, it
will still retain the original submission time, which will not change.
Only the scoring information and feedback will be thrown away and
regenerated.

Note that if any manual grading has been performed on this
submission--for example, if an instructor or grader has made manual
comments or point deductions using the "Grading" tab--all manual
grading information for this submission will also be deleted and must
be re-entered by hand.

## See Also 

[Create An Assignment](CreateAnAssignment.html) <br/>
[Set Late Policy](SetLatePolicy.html) <br/>
[Give Early Bonuses](GiveEarlyBonuses.html) <br/>
[Regrade All Students](RegradeAllStudents.html) <br/>
[Move Back Due Date](MoveBackDueDate.html)

## Comments 

This page is editable on github. To make corrections or improve these
pages, login to github and use the edit icon/link at the end of the
page title for this page.
