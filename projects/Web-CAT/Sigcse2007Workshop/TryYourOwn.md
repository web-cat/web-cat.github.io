---
title: 'SIGCSE 2007 Workshop: Ex.5: Develop Your Own Assignment'
---

## Goal 

This final exercise provides a chance for you to develop the setup
for your own Web-CAT assignment.

## Learning Objectives 

* Mastery of creating a basic Java assignment on Web-CAT
* Mastery of providing reference tests
* Familiarity with customizing [JavaTddPlugin](../JavaTddPlugin/) options
* Familiarity with writing unit tests for your own assignments

## Create a New Web-CAT Assignment 

Begin by using the **Assignments** tab to create a new
assignment on Web-CAT.  Fill in the values for the basic properties
yourself.

Be sure to add the [JavaTddPlugin](../JavaTddPlugin/), edit its configuration, and
select your reusable option set from the drop-down menu.  Don't worry
about filling in any other parameters yet, however.

Click **Next** to go back to your assignment's properties.  Be
sure to publish it, then **Apply All** to save your work.

## Set Up a New Eclipse Project for Your Sample Solution 

Hopefully, you have a sample solution for your assignment all ready
to go.  Create a project for it in Eclipse  Compile it and make sure
it is working.

### If You Already Have JUnit Reference Tests 

Run them to make sure they work as expected.  Adjust your build
path and project settings as appropriate to get your solution
running.  Ask if you need help.

### If You Do Not Have JUnit Reference Tests Yet 

Create one JUnit test class (see the instructions in
[Exercise 1](JunitTestCases.html)).  Add a single, simple test
case method to the class.  This is just enough to get things
working--you can work on filling out the tests later.

## Add Reference Tests to Your Assignment 

While editing your new assignment's properties, click the edit icon
for the [JavaTddPlugin](../JavaTddPlugin/), and then add your reference test class.

If your assignment has multiple test classes, create a directory
for them on Web-CAT, then select the entire directory.

Save your work.

## Make a Test Submission 

Try out a test submission from Eclipse to make sure the assignment
provides the feedback you want.

## Refine Your Assignment 

Now that you have a very basic custom assignment working, it is
time for your to incrementally improve it.  Consider any of the
following tasks, and then make the corresponding configuration changes
to your plug-in options:

* Adding to your reference tests so they are more complete.
* Checking the names of the test case methods in your test classes, to make sure they will produce appropriate hints for students.
* Decide on whether or not you want students to be required to submit their own tests.
* If students are submitting their own tests, decide what coverage criteria you want to use in scoring.
* Add any supplementary data files necessary for your assignment to run.
* Provide your own supplemental classes or interfaces to be used by student solutions (just like providing data files).
* Adapt your program so it is easier to test (if it uses plain stdin/stdout I/O, or has a GUI interface, for example).

As soon as you run into something you want to do but are having
trouble with, let us know!

----
[SIGCSE 2007 Workshop](index.html)
