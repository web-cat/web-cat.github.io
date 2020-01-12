---
title: 'SIGCSE 2007 Workshop: Ex.3: Changing Assignment Grading Options'
---

## Goal 

In this exercise, we will explore some of the grading options
available for assignments by modifying the configuration of the
`Calculator` assignment you created in
[Exercise 2](FirstAssignment.html).

## Learning Objectives 

* Familiarity with configuring a grading plug-in
* Familiarity with plug-in reusable option sets
* Familiarity with the basic options for the [JavaTddPlugin](../JavaTddPlugin/)
* Exposure to code coverage options
* Exposure to manually reviewing submissions
* Exposure to providing hints in reference tests

## Editing Grading Plug-in Parameters 

The assignment you created in [Exercise 2](FirstAssignment.html)
used the default configuration for the
[JavaTddPlugin](../JavaTddPlugin/).
The default settings for that plug-in **require students to submit
their own tests** and rate the thoroughness of student tests by
measuring **how many methods are executed** by the student's
tests.

The key features of the default configuration for the [JavaTddPlugin](../JavaTddPlugin/)
are:

* Java 1.5 sources are compiled, with access to the built-in jar provided by the plugin, but with no other supplemental classes or data files.
* No reference tests are used, so students are graded solely on their own test cases. (You provided your own reference tests in [Exercise 2](FirstAssignment.html).)
* Students will receive a score even if some of their own tests fail to pass.
* Code coverage is measured by the number of methods executed.
* Full Checkstyle and PMD checks that enforce the default coding style are applied against the student code.

Full details about the default settings for the [JavaTddPlugin](../JavaTddPlugin/)
are described on the [JavaTddPlugin/Parameter Descriptions](../JavaTddPlugin/ParameterDescriptions.html)
page.  All of these settings can by customized for your
assignments.

### Make A Test Submission without Test Cases 

To see what will happen if you submit an assignment without any
student-written tests, go to your Calculator project in Eclipse.

Right-click on your `CalculatorTest.java` class in the
Pacakage explorer and **Rename** it to
**`CalculatorJUnit.java`**.

The [JavaTddPlugin](../JavaTddPlugin/) recognizes test classes by their names: any class
with a name that ends in "Test" or "Tests" is treated as a test case
class.  By renaming our test class, it won't be seen as a test class
any longer.

Now submit your Calculator project to the Web-CAT server again.
Refere back to the instructions in
[Exercise 2](FirstAssignment.html) if you need to jog your
memory.

When viewing Web-CAT's results, notice how your submission received
a zero because it did not include any test cases.

### An Overview of Configuring a Plug-in 

To watach a movie that shows how you
can configure a grading plug-in like the [JavaTddPlugin](../JavaTddPlugin/), see the
[Configure Plugin Walkthrough](../ConfigurePluginWalkthrough.html) (30Mb, 4min).

### Don't Require Student-written Tests 

Many instructors who are just starting out with automated grading
do not want to require their students to write their own tests (at
least, not at first).  Setting up an assignment so that students do
not need to write their own tests is easy.

You need to edit the configuration of the [JavaTddPlugin](../JavaTddPlugin/) for your
assignment, create a **reusable option set**, and set the
assignment so that it does not require student-written tests.

Click the **Assignments** tab and edit your assignment's
properties.  Follow the instructions in the
[Configure Plugin Settings](../ConfigurePluginSettings.html)
recipe to edit the [JavaTddPlugin](../JavaTddPlugin/) settings for your assignment.

General-purpose settings that control how student-written tests are
processed, or what Java options are supported, etc., are **Reusable
Configuration Options**.  These options are held in a named profile,
a **reusable option set** that can be used over and over again on
many assignments.  Use the **New** button to create your own
reusable option set, and use **your own name** as the name for the
profile you create.

Under the profile's Shared Options, select **Scoring Settings**
and look for the option named **Students Must Submit Tests**.
Uncheck this option.  Click **Next**, make sure your other
assignment settings are as you intend, and click **Finish** to save
your work.

#### Relevant Cookbook Recipes 

[Configure Plugin Walkthrough](../ConfigurePluginWalkthrough.html) (Movie: 30Mb, 4min) <br/>
[Configure Plugin Settings](../ConfigurePluginSettings.html)

### Make Another Test Submission 

Resubmit your Calculator project to see what happens.  Web-CAT
now allows submissions that do not include student-written tests.

Rename your `CalculatorJUnit.java` file back to
`CalculatorTest.java` in your project and submit once
more.  Notice that Web-CAT recognizes and runs your tests, just as
before.  However, it does not **require** you to submit tests, and
the results of your own tests (as well as how much of your code gets
exercised by your tests) is **not** used in scoring the assignment
anymore.

## Adjust Code Coverage Requirements 

When you _do_ want to require students to write their own
tests, Web-CAT gives you some flexibility in determining how
stringently to grade students on the thoroughness of their own tests.
The [JavaTddPlugin](../JavaTddPlugin/) uses a tool called
[Clover](http://www.cenqua.com/clover/) to measure the
**code coverage** achieved by a student's tests--that is, how
much of a student's code is executed by his or her tests.

Most people are familiar with the idea of _statement
coverage_--causing each statement in a program to be executed at
least once.  Clover also measures _method coverage_--which
methods are called.  Finally, Clover even measures _branch
coverage_ (or _decision coverage_)--which logical
decisions in boolean control structure expressions have been evaluated
both true and false.

As an instructor, you can choose which of these metrics will be
used when assessing how thoroughly student tests exercise student
code.  The [JavaTddPlugin](../JavaTddPlugin/)'s default setting is to use **method
coverage** as the thoroughness metric for grading.  This may be
appropriate for beginning students who are just learning to write test
cases.  As students develop more skill, however, you may wish to
ratchet up the expected level of performance in their test coverage.

The code coverage metric used in the grading formula is controlled
by one of the reusable configuration options for the [JavaTddPlugin](../JavaTddPlugin/).
To change it, click the **Assignments** tab and edit your
assignment's properties.  Click the edit icon for the [JavaTddPlugin](../JavaTddPlugin/) to
edit its configuration.  Now click the edit icon next to the reusable
option set drop-down list, which should contain the reusable option
set you created earlier in this exercise.

While editing the reusable configuration option set, select
**Scoring Settings** from the "Show:" drop-down list under
**Shared Options**.  The **Test Coverage Metric** parameter is
set by choosing the appropriate metric.

Pick the **Methods + statements + decisions executed** option
and save your changes.  This option uses the sum of the three basic
coverage metrics provided by Clover, and is a good overall choice when
you want to be sure students test the code they have written fairly
thoroughly.

Now grab this file: <a href="attachments/CalculatorTest.java">CalculatorTest.java</a>.  This
modified test file omits the tests for the `divideBy()`
method, leaving it uncovered.  Put this test class in your `Calculator`
project in Eclipse, overwriting the previous version.

Submit your modified project to Web-CAT to see how the scoring for
your submission changes.  In the resulting feedback provided by
Web-CAT, click on the link for your `Calculator.java` file
to see the detailed feedback for that file.  Scroll down to the
`divideBy()` method and notice how the lines are
highlighted.  Note the execution counts in the lefthand margin, next
to the line numbers.  Hover your mouse over a highlighted line to see
a test coverage message in a tooltip.

#### Relevant Cookbook Recipes 

[Set Java Coverage Criteria](../SetJavaCoverageCriteria.html)

## Providing Helpful Hints for Students 

When grading student submissions, you don't have to use reference
tests at all--in fact, the default for the [JavaTddPlugin](../JavaTddPlugin/) is to grade
without any reference tests.  However, most instructors use them,
since they're a useful way to assess assignments where students don't
write their own tests.  Further, when students _do_ write their
own tests, a separate set of reference tests written to the problem
specification is one of the most practical ways to assess whether
a student's tests cover all the expected problem behavior.

At the same time, however, a student does not get to see the
results from reference tests--instead, only the results from the
student's own tests are shown.  It can be frustrating for students if
they get absolutely no feedback about how or why their work is
inconsistent with the problem, however.  To remedy this, the
[JavaTddPlugin](../JavaTddPlugin/) supports a variety of **hint generation** mechanisms
that provide students with a glimpse into why their submission was
downgraded.  Controlling these hints is fully at the discretion of the
instructor.

To demonstrate hinting, edit the `Calculator.java` file
in your Eclipse project.  Go to the `divideBy()` method and
comment out its body, so that it does nothing.  Re-run the tests in
your `CalculatorTest` class to make sure they all pass.
There shouldn't be any tests for `divideBy()` if you
completed the last section of this exercise.

Now submit your revised Calculator project to Web-CAT and look at
the overall feedback you receive.  On the main feedback page for your
submission, you will see that Web-CAT provides four separate sections
with more feedback details.  Clicking the + icon in front of a section
will expand it to show more details.

* The **Results from Running Your Tests** section summarizes how many of the student-written tests pass, and provides full output for those tests.
* The **Code Coverage from Your Tests** section summarizes how thoroughly the student's tests exercise the student's code.
* The **Estimate of Problem Coverage** section summarizes how well the student's solution (and tests) cover the required behavior, as measured by any instructor-provided reference tests.
* The **Interpreting Your Correctness[/ Testing](..//Testing.html) Score** section summarizes how these three measures are combined to compute the correctness/testing score for this submission.

Expand the **Estimate of Problem Coverage** and read the
information provided there.  Notice at the bottom that there is a
section of hints provided for the student that looks something like
this:

* divide by (2 occurrences)

This hint was automatically generated based on the reference test
cases that failed, and they are based on the name of the corresponding
test case method(s).  For example, a test case called
`testDivideBy()` (or `testDivideBy2()`, or
`testDivideBy3()`, ...) will result in a hint that says
simply "**divide by**".  A test case called
`testThisIsMyTest()` will produce a hint that says "this is
my test".

Let's edit your reference tests to supply a different hint for this
error.  Click on the **Assignments** tab and navigate to your
assignment's properties.

Click on the edit icon for the [JavaTddPlugin](../JavaTddPlugin/) grading step.

In the Assignment-Specific Options on the lower half of
the page, click the **Browse...** button for the **JUnit Reference
Test Class(es)**.  You'll see your personal directory space on the
Web-CAT server.

Look for your Calculator reference tests (which
should be highlighted).  Click the edit icon to the right of that file
to edit it in place.

Scroll down to the the test case(s) you have for the
`divideBy()` method.  Rename one of them like this:

~~~ java
public void testIncompleteTestingOf_mDivideBy()
{
    ...
}
~~~

Click the **Save and Close File** button to save your changes,
then click **Finish**.

Now resubmit your Calculator project from within Eclipse.  When it
is done, take a look at the feedback.  Expand the **Estimate of
Problem Coverage** and look at the new hints.

Using your reusable option set's "Feedback Settings", you can
limit the total number of hints a student receives (default: 3), allow
unlimited hints (use -1), or suppress all hints altogether (use
0).

Remember that the information a student gathers from these hints
can be as detailed (or as vague) as you wish.  So choose the method
names for your reference tests carefully, based on how much
information you wish to reveal to students.

#### Additional Hint Controls 

The [JavaTddPlugin](../JavaTddPlugin/) supports a variety of ways to control and/or
suppress hints at various levels.  Two other common approaches to
providing hints include:

~~~ java
import net.sf.webcat.annotations.*;

...

public void testFoo()
{
    ...
    // Note the required prefix at the start of the string
    assertEquals( "hint: this hint applies to this assertion only",
        something, somethingElse );
}

@Hint( "This overrides the method name" )
public void testBar()
{
    ...
}
~~~

Read [Java Tdd Plugin / Hint Control](../JavaTddPlugin/HintControl.html)
To learn about other controls, including how to suppress hints when
needed (for a single test case method, or an entire test class), how
to give different weights to tests, and more.

## Hand-grading a Submission 

At some point, you or another member of your course staff will
actually review your students' submissions manually, so that you can
grade for the things that Web-CAT cannot do automatically (especially
design, quality of comments, etc.).

Let's try now, on your most recent submission.  Click the
**Grading** tab.  Navigate to your assignment.  You'll see a list
of all students who have submitted, and your most recent submission
should be there.

Click the **edit** link in the **TA** column for your
submission. You'll see the essentially the same results as the
student would see, but now with edit controls that allow scoring and
comment entry.

Enter a comment in the large text box labeled **TA/Instructor
Comments** (anything you like).

Scroll down to the section labeled **Detailed Reference Test
Results** and click the + icon to expand it.  While students do not
see this information, it is readily available for course staff.  This
section contains the full output produced by running the reference
tests on the student's code.

In the table at the bottom of the page, you can view or download
the intermediate results generated by the plug-in(s), as well as the
student's original submission itself.

Scroll back up to the top of the page, and look for the table
showing the list of files contained in the submission.  Click on the
edit icon next to the `Calculator.java` file.

    **Note:** This direct editing comments into student files works in Internet Explorer and Firefox, but does not work in some browsers, including Safari.

You can now see the color-highlighted view of the student's source
code.  However, where students see this as plain HTML, you will see it
i a scrollable edit box.

Scroll down to some point in the code (say, to the
`divideBy()` method).  Use your mouse to click on a line in
the source file where you want to place a comment.  Now click the "add
a new comment" button (<img href="img/ed_new.gif"/>) at the left of the
toolbar above the edit box.  This will add a new comment to the
file.

Use your mouse to select the text in the body of the message.  Then
type in a replacement message of your own (anything you like).

Use the middle drop-down list in the editor's toolbar to change the
message from an Error to a Warning, or to some other type.  Change it
back to an Error.

Select the point deduction for your error message with your mouse
and type in a new value.

Click the **Save & Mark Done** button to save your work.

Web-CAT keeps track of your point deductions and enters them under
the **Design/Readability** category reserved for manual grading.
However, on the main feedback page you can directly type in the manual
score you want.  Try it now.  Note that you can enter any number you
like, which allows course staff to add arbitrary penalties, give
bonuses, or restore points lost due to automated grading (say, when
you decide a student should have earned more for the work they did,
even if they failed most of your reference tests).

Click **Finish** at the bottom of the page to save your
work.

Now use the **Results** tab to look up your submission and see
what it looks like from the student side.

----
[SIGCSE 2007 Workshop](index.html)
