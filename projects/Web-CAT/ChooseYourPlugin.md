---
title: Choose Your Plugin
---
## Problem 

You want to decide which grading plug-in to select to process one of your assignments.

## Solution 

This recipe assumes that you have already created an assignment, and
that you have already added one or more plug-ins to the grading scheme
for it (see [Create An Assignment](CreateAnAssignment.html)).

Remember that each submission is processed by a **pipeline** of one
or more grading plug-in(s) that are applied in order.

Follow the instructions in [Create An Assignment](CreateAnAssignment.html) to get to your
assignment's properties page.

Under the **properties for all instances of this assignment**, the
grading scheme includes a list of **steps** in the processing
pipeline.  Each step is a separate plug-in.

When you click the **"Add"** button to add another step, you will be
able to choose which plug-in you would like to add to your assignment.
You will see a list of all **published** plug-ins on the server,
plus any personal plug-ins that you have installed.

A **published** plug-in is one that is available for all instructors
to use.  A plug-in that has not been published is only accessible to
the individual who installed it (and any administrators).

The plug-in that you choose will depend on the kind of assignment you
want to set up.  Some of the available plug-ins are described below.

* The **[JavaTddPlugin](JavaTddPlugin/)** provides all-in-one services for grading Java assignments where students write their own tests.  It takes care of compilation, testing, and feedback generation, and does not require any other plug-ins.
* The **[CppTddPlugin](CppTddPlugin.html)** provides all-in-one services for grading C++ assignments (compiled using g++) where students write their own tests using [CxxTest](CxxTest.html).  It takes care of compilation, testing, and feedback generation, and does not require any other plug-ins.
* The **[CppStdioPlugin](CppStdioPlugin.html)** provides all-in-one services for grading C++ assignments (compiled using g++) that produce programs that take input from stdin and produce output on stdout.  It supports student-written tests that amount to stdin files to be piped into the program; there is no expected output, but the actual results are shown to the student in generated feedback.  It also supports instructor-provided reference input files that are also piped through the student's program, with results only visible to graders and instructors.  This plug-in takes care of compilation, execution, and feedback generation, and does not require any other plug-ins.
* The **[PascalCompilerPlugin](PascalCompilerPlugin.html)** identifies and compiles a single Pascal source file in a student's submission.  This plug-in cannot be used on its own--it simply generates an executable, together with any logged compiler output, for use by other plug-ins. It is usually used in combination with the [Text Tdd Plugin](TextTddPlugin.html) and the [Generic Tdd Feedback Plugin](GenericTddFeedbackPlugin.html).
* The **[TextTddPlugin](TextTddPlugin.html)** handles pseudo-TDD-style testing of an executable program that reads input from stdin and produces output on stdout.  This plug-in reads test input and expected output from a test definition file (which is plain text).  It pipes the input from all the test cases through the program, collects the output from stdout, and compares it against the expected output in the test cases.  This plug-in cannot be used on its own--it just runs tests, collects results, and generates summaries.
* The **[GenericTddFeedbackPlugin](GenericTddFeedbackPlugin.html)** handles feedback gathering and generation for various other plug-ins that do not perform their own feedback formatting.  It gathers logged output left by earlier plug-ins and generates a nice HTML summary report, together with pretty-printed HTML code views for languages other than Java or C++.
* The **[DrSchemeTddPlugin](DrSchemeTddPlugin.html)** handles TDD-style grading of Scheme code written using [Dr Scheme](DrScheme.html), containing embedded unit test cases in the style of that tool.  This plug-in does not generate its own feedback, and is usually used in combination with the [Generic Tdd Feedback Plugin](GenericTddFeedbackPlugin.html).
* The **[PrologTddPlugin](PrologTddPlugin.html)** handles TDD-style grading of Prolog code written using plain-text test case descriptions.  This plug-in does not generate its own feedback, and is usually used in combination with the [Generic Tdd Feedback Plugin](GenericTddFeedbackPlugin.html).

Once you have added one or more plug-ins, you can click the edit icon
next to that step to [Configure Plugin Settings](ConfigurePluginSettings.html).

## Discussion 

Documentation for most published plug-ins is provided in this
cookbook.

Which plug-ins are available may depend on your server's
configuration.  For example, the [PrologTddPlugin](PrologTddPlugin.html) will probably be
unavailable when Prolog is not installed on the server.
[Contact Your Administrator](ContactYourAdministrator.html) if you wish to use a plug-in that is not
available and have questions.

You can [Install a New Plugin](InstallaNewPlugin.html) if one is available.

You can [Write a Plugin](WriteaPlugin.html) of your own if none is available for your task.

## See Also 

[Create An Assignment](CreateAnAssignment.html) <br/>
[Configure Plugin Settings](ConfigurePluginSettings.html) <br/>
[Install a New Plugin](InstallaNewPlugin.html) <br/>
[Write a Plugin](WriteaPlugin.html) <br/>
[Set Plugin Global Properties](SetPluginGlobalProperties.html)

[JavaTddPlugin](JavaTddPlugin/) <br/>
[CppTddPlugin](CppTddPlugin.html) <br/>
[CppStdioPlugin](CppStdioPlugin.html) <br/>
[PascalCompilerPlugin](PascalCompilerPlugin.html) <br/>
[TextTddPlugin](TextTddPlugin.html) <br/>
[GenericTddFeedbackPlugin](GenericTddFeedbackPlugin.html) <br/>
[SchemeTddPlugin](SchemeTddPlugin.html) <br/>
[PrologTddPlugin](PrologTddPlugin.html)

## Comments 

This page is editable on github. To make corrections or improve these
pages, login to github and use the edit icon/link at the end of the
page title for this page.
