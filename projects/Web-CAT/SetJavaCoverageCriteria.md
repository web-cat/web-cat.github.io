---
title: Set Java Coverage Criteria
---
## Problem 

You want to set the level of code coverage that students must
achieve when writing tests for your assignments.

## Solution 

This recipe assumes that you have already created an assignment (see
[Create An Assignment](CreateAnAssignment.html)) that uses the [JavaTddPlugin](JavaTddPlugin/).

This recipe also assumes that you know what code coverage analysis
is.  If not, read
[Code Coverage Analysis](http://www.bullseye.com/coverage.html),
or [A Buyer's Guide to Code Coverage Terminology](http://www.testing.com/writings/coverage-terminology.html),
or do some searching for yourself on the net.

### Background 

The [JavaTddPlugin](JavaTddPlugin/) uses
[Clover](http://www.cenqua.com/clover/) to instrument student code
and gather up information about how well student-written tests
exercise all aspects of the student's code. [Actually, the plugin has been
updated and now uses JaCoCo, which is an open-source bytecode-level coverage
instrumentation tool that provides Java coverage measurements for Eclipse, so
this information needs to be updated.]  You can control how much
or how little code coverage is required.  Regardless of the setting
you choose, students will always get the fullest feedback about places
in their code that have not been tested well enough--the code coverage
choice only affects how scoring is performed.

Clover measures three separate quantities that can be used in scoring
student code coverage:

* **Method coverage:** Clover counts all of the methods in all of the
student's classes, and whether or not each one has been entered
(called). This is the same as "function coverage" or "routine entry
coverage".
* **Statement coverage:** Clover also counts all of the statements
in all of the student's classes, and whether or not each one has
been entered.
* **Decision coverage:** Clover also counts all of the if-tests
and, while-tests, and switch-tests in all of the student's classes,
and whether during testing, each possible code branch associated
with that test has been executed.  For example, an `if` statement
can be executed so that its control expression is true, and so that
its control expression is false.  The same goes for loops.  For a
switch, each possible branch is counted separately (including
skipping the statement entirely, if there is no default branch).

These three measures assess different aspects of testing.  Method
coverage is a coarse measure of whether all methods have been called,
irregardless of their sizes.  Statement coverage measures coverage of
the actual statements written, but may "miss" certain things that
should be tested (see the two code coverage links above for info about
why).  Decision coverage forces better testing of control structures,
but does a poor job of measuring coverage when there are many methods
that contain only straight-line code, which includes many student
assignments.  The [JavaTddPlugin](JavaTddPlugin/) lets you use these measures alone or
in combination for scoring students.

### Procedure 

Follow the instructions in [Configure Plugin Settings](ConfigurePluginSettings.html) to edit the
plug-in's settings for your assignment.

Under the plug-in's **reusable configuration options**, if your
assignment is not yet using a reusable option set that you have
defined, create one now.  If your reusable option set says "(script
defaults only)", click the "New" button to create your own option set,
and then give your new profile a meaningful name.  If you've already
created a reusable option set, then you can click the "Edit" icon to
edit its properties instead of creating a new one.

While editing the reusable option set for the [JavaTddPlugin](JavaTddPlugin/), look in
the "Shared Options" section.  Select **"Scoring Settings"** from
the "Show:" drop-down list to view the options for assignment scoring.

Under **Test Coverage Metric**, choose the code coverage measure you
would like to use for student scoring:

* Methods executed
* Statements executed
* Methods + decisions executed
* Statements + decisions executed
* Methods + statements + decisions executed

For students in their first programming course, you may want to
choose something simple like "methods executed".  For students who
already know basic programming, "statements executed" is a reasonable
choice, since they will know and understand what it means.  For more
experienced students and when you are encouraging students to write
thorough tests, "methods + statements + decisions executed" is a good
choice.  Feel free to experiment, depending on the level of experience
of your students.

Click "Finish" to save your changes, or "Apply All" to save them and
continue editing.

## Discussion 

The coverage metrics described here aren't the only ones that are
possible--they are just the only ones implemented in Clover.

## See Also 

[Create An Assignment](CreateAnAssignment.html) <br/>
[Choose Your Plugin](ChooseYourPlugin.html) <br/>
[Configure Plugin Settings](ConfigurePluginSettings.html) <br/>
[JavaTddPlugin](JavaTddPlugin/)

## Comments 

This page is editable on github. To make corrections or improve these
pages, login to github and use the edit icon/link at the end of the
page title for this page.
