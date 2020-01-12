---
title: Multiple Course Sections
---
## Problem 

You are teaching (alone or with others) multiple sections of one
course, and want to know how to set up your course offering(s) and
assignment(s).

## Solution 

There are two typical ways that instructors deal with multiple
sections on Web-CAT.  These two questions will help you decide which
is best for you:

1. Will separate sections use separate due dates/times for _any_ work graded by Web-CAT? Or will all students in all sections use the same due dates/times?
1. Is there any need to separate or subgroup students along course section boundaries for manual grading tasks?  For example, one grader might be responsible for sections A and B, while another is responsible for sections C and D, throughout the whole semester/term.

The answers here assume you are familiar with the distinctions between
[Courses And Course Offerings](CoursesAndCourseOfferings.html) and [Assignments And Assignment Offerings](AssignmentsAndAssignmentOfferings.html).

### Choice 1: A Single Web-CAT Course Offering 

This choice is the simplest to set up, but is only appropriate if
**all students in all sections use the same due dates/times**.
Also, it requires you to manage the logistics of how manual grading
tasks are allocated among course staff on your own.  However, it is
easy to set up.

The basic idea is to create just one course offering, and upload all
rosters for all sections to this same course offering.  From Web-CAT's
point of view, there is just one group of students, and it contains
everyone across all sections.

When you create assignments, you needn't do anything special--just
create one assignment for this one course offering, and set one due
date.  It is just as easy as managing a single course section with
only a few students, as far as Web-CAT is concerned.

If you have a large number of students and wish to split up the
grading work among multiple instructors or graders, you will have to
agree on a protocol that works for you.  For example, you may assign
one grader to work on all students with last names beginning with
letters A-M, and another to grade N-Z.  However, all graders will see
the entire list of student submissions, so they will have to be sure
they understand exactly which students out of the whole group they are
responsible for grading.

### Choice 2: One Course Offering Per Section 

This choice is a bit more complicated to set up, but is necessary if
**different sections use different due dates/times**.  It also
provides more compartmentalization of student rosters, which may make
it easier for course staff to see exactly which students they are
responsible for.

The basic idea is to create _multiple_ course offerings in Web-CAT,
each one of which corresponds to a separate section in your
institution's time table.

Now, when you create an assignment, you have a bit more work to do.
Suppose you are ready to post Lab 2, and have three separate sections
you are managing.  First, [Create An Assignment](CreateAnAssignment.html) for one of the
sections, say Section A.  Set up and configure the assignment as
you normally would.

Now, let's create a second offering of this same assignment for
Section B.  Walk through the steps to [Create An Assignment](CreateAnAssignment.html) again, but
selecting Section B in the first step.  In step 2, **Create or Reuse?**,
rather than selecting the first radio button to add another
assignment, instead look through the list in the lower half of the
page and select the radio button next to the assignment you just
created for Section A.  In other words--let's **reuse** the
assignment we already created, and offer it again.

When you proceed to edit the assignment properties, you'll see that
the top half of the assignment properties are already filled in, since
you set them the first time you created this one.  All you have to do
is complete the **properties unique to this course offering** on the
bottom half of the page.

Finally, repeat the whole process with Section C, again choosing to
**reuse** the same assignment, and editing the **properties unique
to this course offering**.

## Discussion 

These aren't the only solutions you can imagine, but they are
the most frequently used solutions for this situation.

Many instructors report that they use question 1--are due dates
the same or different--as the determining factor in deciding how to handle
multiple sections.

For users of Blackboard, WebCT, Moodle, Sakai, etc., remember that
whether you use a single course offering or multiple course
offerings on Web-CAT, that choice is completely independent of whether
or not you have a single course or multiple courses in your course
management system (as long as you can keep things straight in your
own head!).

## See Also 

[Createa Course Offering](CreateaCourseOffering.html) <br/>
[Create An Assignment](CreateAnAssignment.html)

## Comments 

This page is editable on github. To make corrections or improve these
pages, login to github and use the edit icon/link at the end of the
page title for this page.
