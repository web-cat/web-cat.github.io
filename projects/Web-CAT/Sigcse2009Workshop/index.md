---
title: Sigcse2009 Workshop
---
## Automatically Grading Programming Assignments with Web-CAT 

**SIGCSE 2009 Workshop Companion Wiki**

This page contains the companion materials from the **SIGCSE 2009
Workshop: Automatically Grading Programming Assignments with Web-CAT**,
presented by 
[Stephen Edwards](http://people.cs.vt.edu/~edwards/) and
[Manuel Pérez-Quiñones](http://perez.cs.vt.edu/)
from [Virginia Tech's Department of Computer Science](http://www.cs.vt.edu/).

This wiki page and its children contains electronic copies of the workshop materials,
together with links to installable versions of all required software.

## Workshop Abstract 

This workshop introduces participants to using
[Web-CAT](../WhatIsWebCat.html),
an open-source automated grading system.  Web-CAT is customizable and
extensible, allowing it to support a wide variety of programming
languages and assessment strategies.  Web-CAT is most well-known as
the system that "grades students on how well they test their own code," with
experimental evidence that it offers greater learning benefits than
more traditional output-comparison grading.  Participants will
learn how to prepare reference tests, set up assignments,
manage multiple sections, and allow graders to manually grade for
design.   Go home ready to start using it in your own classes! Prior
exposure to a unit testing framework, such as JUnit, is recommended
but not required. Laptop optional.

## Workshop Contents 

Workshop notes (presentation): <a href="attachments/Web-CAT-workshop-SIGCSE09.pdf">Web-CAT-workshop-SIGCSE09.pdf</a>

The SIGCSE 2009 Web-CAT workshop features live demonstration walkthroughs of
how to use Web-CAT, from the very first step of creating your first course offering,
through the steps required to create assignments, submit work, and grade work.
As a resource to workshop participants--and those who could not attend the
workshop--we also provide here both the instructions and the materials needed
to walk through these steps yourself using a demonstration account on our
Web-CAT server at Virginia Tech.  You can [request a guest account](../TryOutWebCat/)
online and then follow the instructions below.

### Hands-on Versions of the Workshop Demonstrations 

* Preliminaries: [Setting up your environment](SetUp.html)

  Before you try the hands-on exercises, be sure you have Eclipse installed.  Web-CAT does not require Eclipse, but the hands-on exercises here are written for that IDE to simplify the instructions.  The [preliminary setup instructions](Sigcse2009Workshop/SetUp.html) also explain how to install our submission plug-in for eclipse.

* **Exercise 1**: [Creating JUnit Test Cases with Eclipse](JunitTestCases.html)

  This exercise will give you a bit of practice writing simple test cases with JUnit, if you have not already used that testing framework.  It also explains how to run those tests within Eclipse and interpret the results.

* **Exercise 2**: [Setting up your first assignment](FirstAssignment.html)

  The second exercise walks you through the following activities:

  * Creating your first course offering
  * Uploading your course roster as a CSV file
  * Creating your first assignment
  * Submitting a sample solution to try out your assignment
    More resources for various practice assignments are also available under the [Try Out Web Cat/Usage Instructions](../TryOutWebCat/UsageInstructions.html).


* **Exercise 3**: [Changing assignment grading options](GradingOptions.html)

  The third exercise is all about customizing the behavior of grading plug-ins, using the [JavaTddPlugin](../JavaTddPlugin/) as an example.  It walks you through the following activities:

  * Configuring an assignment without test cases
  * Modifying an assignment so students are not required to write tests
  * Changing code coverage requirements
  * Providing "hints" to students when instructor tests fail
  * Hand-grading key parts of students submissions

* **Exercise 4**: [Configuring coding style checks](StaticChecks.html)

  The fourth exercise walks you through the following activities:

  * Adding instructor-provided data files to an assignment
  * Regrading student submissions when they need to be reprocessed
  * A brief overview of how static analysis works
  * How to provide custom PMD checks (including turning them off)
  * How to provide custom Checkstyle checks (including turning them off)

## Sponsorship 

We gratefully acknowledge the support provided to this work by our
sponsors.  This work is sponsored in part by the
[National Science Foundation](http://www.nsf.org/) under
Grant Nos. DUE-0618663 and DUE-0633594.  Any opinions, findings, and
conclusions or recommendations expressed in this material are those of
the author(s) and do not necessarily reflect the views of the National
Science Foundation.

----
[SIGCSE 2009 Workshop](index.html)
