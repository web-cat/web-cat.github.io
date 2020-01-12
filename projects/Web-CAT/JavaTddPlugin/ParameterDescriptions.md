---
title: 'JavaTddPlugin: Parameter Descriptions'
---
**Plug-in:** [JavaTddPlugin](index.html)

See [Configure Plugin Settings](../ConfigurePluginSettings.html) for information on how to access these
options for a given assignment.

## Assignment-Specific Options 

These options must be set individually for each assignment you create.

 * JUnit Reference Test Class(es):A Java source file (or directory of source files) containing JUnit tests to run against student code to assess completeness of problem coverage. If you select a single Java file, it must contain a JUnit test class declared in the default package.  If you select a directory, it should contain JUnit test classes arranged in subdirectories according to their Java package declarations.  If you make no selection, an empty set of instructor reference tests will be used instead.

   **Default:** no reference tests

 * Supplemental Classes for Assignment:A jar file (or a directory) containing precompiled classes to add to the classpath when compiling and running submissions **for this assignment**. If you want to apply the same jar settings to many assignments, use the "Supplemental Classes" jar in the "Reusable Configuration Options" section instead.  If you have multiple jars to provide, combine their contents into one unified jar and upload it.

   **Default:** no supplemental classes

 * Data Files for Student:A file (or a directory of files) to place in the student's current working directory when running his/her tests and when running reference tests.  The file you select (or the entire contents of the directory you select) will be copied into the current working directory during grading so that student-written and instructor-written test cases can read and/or write to the file(s).  The default is to copy no files.

   **Default:** no data files

## Reusable Configuration Options 

These options are designed so that you can store them in a profile
that you can reuse across many assignments.  You must create a
reusable option set in order to access these features, but once it has
been created, you can reuse it on any future assignments.  Changes to
the reusable option set affect all assignments that use it.

The reusable configuration options for this plug-in are separated into
five groups.  Use the **Show:** drop-down list to select the
appropriate group (or show all options at the same time) when you are
editing a reusable option set.

### Java Settings 

 * Java Source Compatibility:The Java source compatibility version to use when compiling student code (used with `javac`'s `-source` command line argument).

   **Default:** v1.5 compatibility

 * Use Java Assertions:Enable Java assertions during execution.  When set to false, assertions in student or instructor-provided code will be treated as non-executable (no-op's).

   **Default:** true

 * Use Built-in Jar:Set to true to have a built-in jar containing Virginia Tech cs1705/cs1706 classes placed on the classpath for assignments.  Set to false to omit this jar from the classpath.

   **Default:** true

 * Predefined Classes:A jar file (or a directory) containing precompiled classes to add to the classpath when compiling and running submissions.  Use this setting if you'd like to share the same jar across several assignments.  If you have multiple jars to provide, combine their contents into one unified jar and upload it.

   **Default:** no additional predefined classes

 * Java Security Policy:A Java security policy file used to limit actions on student programs at run-time.  Leave unset to use the built-in default, which plugs most security holes and prevents any file system access outside the subtree rooted at the program's working directory.

   **Default:** Restrictions on most hazardous actions, including executing external programs.  Full file access within the current working directory and its children, but no file access outside the scope of the current working directory is permitted.  Access to system properties is restricted.  General internet connections are restricted, although some sites are permitted.

### Scoring Settings 

 * All Student Tests Must Pass:If you are truly following test-driven development practices, then no code is ever released until all of its unit tests pass.  If this option is set to true, students will not receive a non-zero score or receive further assessment feedback unless all student tests pass.  If this option is not set, then students may continue to proceed even if some student-written tests fail  The student's correctness/testing score is multiplied by the proportion of their tests that pass.

   **Default:** false

 * Students Must Submit Tests:When set, this option requires all students to submit test cases for their own code.  Submissions without test cases will received feedback to that effect (and no more), as well as a zero score.  If you unset this option, then student submissions will **not** be required to include student-written test cases, and **only** the reference test pass rate will be used for scoring (i.e., student code coverage and student test pass rate will not be included in scoring). 

   **Default:** true

 * Test Coverage Metric:Choose the criterion used to measure how thoroughly a student's tests cover the corresponding code. The available choices are:
   * Methods executed
   * Statements executed
   * Methods + decisions executed
   * Statements + decisions executed
   * Methods + statements + decisions executed

   **Default:** methods executed

### Static Analysis 

 * Checkstyle Configuration:An XML file containing a Checkstyle rule configuration (see the [Checksyle documentation](../http://checkstyle.sourceforge.net/)).

   **Default:** a set of checks that enforces the coding style used at Virginia Tech

 * PMD Configuration:An XML file containing a set of PMD rules (see the [PMD documentation](../http://pmd.sourceforge.net/)).

   **Default:** a set of checks that enforces the coding style used at Virginia Tech.  Where possible, PMD checks are preferred to Checkstyle checks.

 * Static Analysis Scoring Scheme:A Java properties file containing the point deductions and limits to use for messages generated by Checkstyle or PMD.  The point deductions are specified in a fairly generic way so they can be used for many assignments.  Deductions in the default scheme are typically 1, 2, or 5 'points', which are really simply relative weights.  Specify a scaling factor below to adjust how these weights are translated into point deductions for a student.

   **Default:** -2 points for most violations, -5 for poorly formed test cases (assuming a 100-point scale)

 * Static Analysis Deduction Scaling Factor:The **Static Analysis Scoring Scheme** above defines the point deductions and limits to use for messages generated by Checkstyle or PMD in a generic way, with most deductions in the default scheme being 1, 2, or 5 points. Deductions in the static analysis scoring scheme are multiplied by this factor to translate them into actual 'point deductions' shown to the student.

   **Default:** 1

### Feedback Settings 

 * Hints Limit:Maximum number of hints the student will receive from failed reference tests.

   **Default:** 3

 * Generate PDF Printouts:Set to true if you wish for a single PDF file containing a pretty-printed source code printout to be generated from the student's code.  The printout will be downloadable by students, and accessible by TAs during grading.

   **Default:** false

### Script Developer 

 * Debug Level:Set to a non-zero value for the script to produce debugging output (the larger the number, the greater the detail, up to about 5).  Debugging output on each grading script run will be e-mailed to the instructor.

   **Default:** 0
