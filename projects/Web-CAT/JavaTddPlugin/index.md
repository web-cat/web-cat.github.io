---
title: JavaTddPlugin
---
**Plug-in:** [JavaTddPlugin](index.html): TDD Java all-in-one grader

**Version:** 3.1.6 [2008-01-20]

**Language:** Processes submissions written in Java

**Parameters:** [Parameter Descriptions](ParameterDescriptions.html)

**Default Config:** [Default Configuration](DefaultConfiguration.html)

**Changes:** [Change History](ChangeHistory.html)

**Provider:** Virginia Tech Computer Science

**License:** [GNU General Public License v.2](http://www.gnu.org/copyleft/gpl.html)

## Summary 

This "all-in-one" plug-in is designed to provide full processing and
feedback generation for Java assignments where students write their
own JUnit test cases.
It includes ANT-based compilation, JUnit processing of student-written
tests, support for instructor-written reference tests, PMD and Checkstyle
analysis, and Clover-based tracking of code coverage during student
testing.

When you use this plug-in, no others are necessary to create a
complete assignment processing pipeline.

Read [Hint Control](HintControl.html) for information on how to control feedback hints
from reference tests using this plug-in.

## Features 

This is our most extensive and powerful grading plug-in.
It includes the following features:

* **ANT-based automated build** of any Java project, including full support for arbitrary package structures.
* Inclusion of instructor-provided library JARs to be used while compiling and executing student code.
* Automatic identification and execution of student-written JUnit tests (using ANT's junit task).
* Support for [Clover](http://www.thecortex.net/clover/) instrumentation of student code to collect code coverage data (methods, statements, and branches) while student tests are running.
* Support for static analysis of student code using [Checkstyle](http://checkstyle.sourceforge.net) to indentify documentation, formatting, naming, and stylistic errors.
* Support for static analysis of student code using [PMD](http://pmd.sourceforge.net) to indentify additional stylistic and coding errors.
* Support for optional instructor-provided reference tests that will be automatically executed against the student code.
* Support for generation of PDF program listings, if desired.
* An integrated **web-viewable feedback report** is provided to the student, including:
  * A color-coded, syntax-highlighted view of each source file.
  * An execution count for each line, with under-tested lines highlighted in pink (provided by Clover).
  * Individual errors from Checkstyle, PMD, or entered by the TA are presented in-line in the source code view, highlighting the line to which each applies.
* **Flexible configuration options** for the instructor, including:
  * Control over which Checkstyle rules are enabled and how each is configured.
  * Control over which PMD rules are enabled and how each is configured.
  * The ability to write new PMD checks using xpath expressions (or provide your own Java implementations of PMD or Checkstyle checks).
  * Control over the point deductions used for each static analysis comment.
  * The ability to group many static checks from all tools into arbitrary categories (like "commenting" vs. "layout" vs. "coding style", for example), and set maximum allowable deductions for each, or for all static checks taken together.
  * Control over how to use coverage data to compute the testing portion of a student's score.
* Powerful hint generation for instructor-provided reference tests
  * Read [Hint Control](HintControl.html)
