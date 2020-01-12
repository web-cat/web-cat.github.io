---
title: Role Based Permissions
---
Web-CAT's security model uses a hybrid approach.  It employs both global permission levels (which can differ for each user account), and role-based permissions.

## Global Permission Levels 

Global permissions determine the visibility of certain features within the user interface that are not based on single classes.  There are four broad categories among the permission levels supported internally.

First, **students** are at the lowest level.  Student features are color-coded using green and peach tabs.

Second, teaching assistants or graders can see all student features, plus a blue tab for grading tasks.

Third, teaching staff are at the next level.  Staff features are color-coded blue, and include capabilities for managing course offerings, assignments, grading, and plug-ins.

Fourth, administrative accounts are at the highest level.  Administrative tabs are color-coded purple, and include features for configuring Web-CAT's parameters, installing new features, inspecting system properties, and managing the underlying database.

## Role-based Permissions 

While global permissions determine visibility of certain features at a coarse level, most specific tasks are only available to accounts that are members of defined **roles**.  There are three principal roles associated with each course offering:

1. **Students** are those user accounts that are enrolled in a course offering.  If a user is enrolled, then they can see assignments for a course, make submissions to those assignments, and view their own results.  Other users will not be able to access these features for that course offering.
1. **TAs** are those user accounts that are listed as teaching assistants (or graders) for a specific course offering.  Instructors can change this list at any time.  If a user is the TA for a course, then they can grade submissions for any assignment offering in that course offering.  TAs can also make submissions to assignments to try them out or diagnose problems, they can make late submissions on behalf of students, they can regrade student assignments, and they can download scores for the entire class.
1. **Instructors** are those user accounts that are listed as teachers for a specific course offering.  There may be one or many.  Instructors have all the capabilities of TAs, plus the ability to create or modify assignments, add or drop students from the roster, add or drop TAs or other instructors, and create new course offerings.

Accounts with global administrative permissions have full access to all features for all course offerings, whether or not they are instructors for a given offering.
