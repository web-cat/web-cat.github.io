---
title: Courses And Course Offerings
---
Because Web-CAT is usually used in association with teaching, it is important to understand
how courses are managed within the system.

In Web-CAT's data model, there is a distinction between a **course** and a **course offering**.

## Course 

Throughout the Web-CAT user interface (and documentation), the term **course** is
used to refer to the name for an academic course that is offered at an institution, the
kind of thing that is normally associated with an academic catalog's course descriptions.

Courses belong to a department and have names and numbers.  For example, "CS 101: Introduction
to Programming", might be offered by the Department of Computer Science at Imaginary
University.

## Course Offering 

While a **course** defines the name, course number, and department, a **course offering**
is a specific offering of a given course during a specific semester/term, taught by a
specific instructor.  In other words, a course offering is a single instance of a course.  One
course, like "CS 101", might be offered once during the fall semester.  Or there could
be three separate sections that semester--three distinct course offerings.  Those offerings
might be taught be the same person, by different people, or even co-taught by a team.

The following semester, additional offerings of the same course may be given at a
particular institution.  So a **course** defines the **timeless** features that are shared
by all offerings.  A single **course offering** defines the specifics for one section/offering
of a course during a single semester/term--the instructor(s), the graders or TAs (if any),
the student roster, etc.

Course offerings also are frequently used to manage "lab sections" at larger universities.
Often, students in a single, large lecture course may be split into smaller groups for
recitation sections or laboratory periods.  If such a division is helpful in managing grading
tasks, or in managing data within course management systems like Blackboard or WebCT,
instructors often arrange multiple course offerings of the same course within Web-CAT as
well.
