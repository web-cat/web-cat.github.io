---
title: 'SIGCSE 2007 Workshop: Ex.2: Setting Up Your First Assignment'
---

## Goal 

In this exercise, we will be building off of the simple
`Calculator` class you worked with in
[Exercise 1](JunitTestCases.html).  You will use the test cases
you wrote in that exercise to set up your very first assignment on
Web-CAT.

## Learning Objectives 

* Familiarity with setting up a course on Web-CAT
* Familiarity with uploading a course roster
* Familiarity with creating a basic Java assignment
* Familiarity with configuring a grading plug-in
* Familiarity with providing reference tests for an assignment
* Exposure to managing multiple course sections

## Login to Web-CAT 

If you don't have access to a Web-CAT server, see the instructions
in [Try Out Web Cat](../TryOutWebCat/)
.

Once you have logged in, Web-CAT will show your **home page**.
Notice the tabs across the top--these are your primary navigation tool
in Web-CAT.

Click on the **My Profile** sub-tab under the **Home** tab.
Fill in your first and last name, and feel free to change your
password from the one that was initially assigned to you.

#### Relevant Cookbook Recipes 

recipe: [Login To Web Cat](../LoginToWebCat.html) <br/>
recipe: [Change Your Password](../ChangeYourPassword.html)

The [Web-CAT Cookbook](../Cookbook.html) contains a number of _recipes_ for common
situations.  These recipes contain step-by-step instructions on how to
and accomplish specific tasks, and also have areas for
user-contributed discussion and insights.  The cookbook is a great
place to check if you are looking for help on a basic task.

The cookbook is part of the this wiki, so it is
completely user-editable by anyone using or
learning about Web-CAT.  If you're looking for a recipe and can't find
it, feel free to start a new one (even if you don't have a solution!),
and others can help out in completing it.  Community-driven
documentation helps Web-CAT work!

## Create a Course Offering (a Course Section) 

Now it is time for you to create your first course on Web-CAT.
Before doing this, there is an important distinction in Web-CAT
terms that you should be aware of: Web-CAT knows the difference
between a _course_ and a _course offering_.

In Web-CAT, the term
**course** refers to the name for an academic course
that is offered at an institution, the kind of thing that is normally
associated with an academic catalog's course descriptions.  It defines
the **timeless** features that are shared by all
offerings of the course.

A **course offering**, on the other hand, is a specific
offering of a given course during a specific semester/term, taught by
a specific instructor.  A course offering is akin to a "course
section", and there may be multiple offerings of one course going
on simultaneously, taught by the same or different people.
A single **course offering** defines the
specifics for one section/offering of a course during a single 
semester/term--the instructor(s), the graders or TAs (if any), the
student roster, etc.

Course offerings also are frequently used to manage "lab sections"
at larger universities. Often, students in a single, large lecture
course may be split into smaller groups for recitation sections or
laboratory periods.  If such a division is helpful in managing grading
tasks, or in managing data within course management systems like
Blackboard or WebCT, instructors often arrange multiple course
offerings of the same course within Web-CAT as well.

### An Overview of Creating a Course Offering 

To watch a movie that shows how to set up a new course
offering, see the [Create a Course Walkthrough](../CreateaCourseWalkthrough.html) (9Mb, 4min).

### Now It's Your Turn 

In Web-CAT, click on the **Courses** tab, and then click on
the **New** sub-tab.

Follow the instructions in the
[Create a Course Offering](../CreateaCourseOffering.html)
recipe to create a new offering of the **Sandbox** course.  
Use your **last name** as the **CRN**, which should be a
unique identifier for your course offering, distinguishing it from all
others.

Click "Apply All" to save your work, but continue editing the
course.

#### Relevant Cookbook Recipes 

[Create a Course Walkthrough](../CreateaCourseWalkthrough.html) (Movie: 9Mb, 4min) <br/>
[Create a Course Offering](../CreateaCourseOffering.html) <br/>
[Add Another Instructor](../AddAnotherInstructor.html) <br/>
[Add Another Grader](../AddAnotherGrader.html) <br/>
[Courses And Course Offerings](../CoursesAndCourseOfferings.html) <br/>

### Upload Your Course Roster 

Now let's populate your course with some student accounts.
Most instructors **upload a CSV file** to populate
their course roster.  Web-CAT will automatically create accounts for
any students listed in your CSV file, but who currently do not have an
account.

Web-CAT supports a
[Generic CSV format](http://web-cat.cs.vt.edu/Web-CAT.help/Grader/CourseRosterPage.php?t1=3&amp;t2=0&amp;t3=2&amp;ua=100)
that is easy to create. The minimum columns are just
last name, first name, and e-mail address:

||<rowbgcolor="#cccccc"> ||A||B||C||
||<bgcolor="#cccccc">1||Flintstone||Fred||fredf@vt.edu||
||<bgcolor="#cccccc">2||Rubble||Betty||brubble@vt.edu||
||<bgcolor="#cccccc">3||Flintstone||Wilma||wilma@hotmail.com||

You can see this same information in this sample CSV file:
<a href="attachments/roster.csv">roster.csv</a>.  Later, you can read the
[Web-CAT help on CSV student rosters](http://web-cat.cs.vt.edu/Web-CAT.help/Grader/CourseRosterPage.php?t1=3&amp;t2=0&amp;t3=2&amp;ua=100)
for information on the format of the
CSV file, and additional optional columns you might want to use.

Follow the instructions in the [Upload Your Course Roll](../UploadYourCourseRoll.html)
recipe to upload your CSV file and enroll students in your account.

Click "**Finish**" when you are done in order to save
your changes to the database.  If you move to a different tab before
clicking "Apply" or "Finish", your changes will be cancelled rather
than saved.

#### Relevant Cookbook Recipes 

[Upload Your Course Roll](../UploadYourCourseRoll.html) <br/>
[Adding Students](../AddingStudents.html) <br/>
[Dropping Students](../DroppingStudents.html)

## Create Your First Assignment 

Now it is time for you to create your first assignment in your new
course offering.

### An Overview of Creating an Assignment 

To watch a movie that shows how to set up a new assignment,
see the [Create An Assignment Walkthrough](../CreateAnAssignmentWalkthrough.html) (34Mb, 9min).

### Now It's Your Turn 

Let's use the `Calculator.java` file and your
`CalculatorTest.java` test cases from [Exercise 1](JunitTestCases.html)
to create a new assignment.  If
you did not complete that exercise, you can use these:
<a href="attachments/Calculator.java">Calculator.java</a> and <a href="attachments/CalculatorReferenceTest.java">CalculatorReferenceTest.java</a>.

For this part of the exercise, you should set up your own
**submission rules** and add the [JavaTddPlugin](../JavaTddPlugin/), but
don't worry about configuring the plug-in for now.  Use your own
choices for the other fields.

When you create this assignment, use your initials to create the
assignment name (e.g., "SE 1" or "MPQ 1").  You can use "Calculator"
for the short description.  Use your name for the submission rules
profile you will create.

Click the **Assignments** tab.  Follow the
instructions in the [Create An Assignment](../CreateAnAssignment.html)
recipe to create your first assignment.  Be sure to click "Finish"
when you are done.

#### Relevant Cookbook Recipes 

[Create An Assignment](../CreateAnAssignment.html) <br/>
[Create An Assignment Walkthrough](../CreateAnAssignmentWalkthrough.html) (Movie: 34Mb, 9min) <br/>
[Multiple Course Sections](../MultipleCourseSections.html) <br/>
[Set Late Policy](../SetLatePolicy.html) <br/>
[Give Early Bonuses](../GiveEarlyBonuses.html) <br/>
[Hide An Assignment](../HideAnAssignment.html) <br/>
[Regrade One Student](../RegradeOneStudent.html) <br/>
[Regrade All Students](../RegradeAllStudents.html) <br/>
[Move Back Due Date](../MoveBackDueDate.html)

## Provide Reference Tests for Your Assignment 

Let's use your `CalculatorTest.java` test class as the
reference tests for this assignment.

### An Overview of Providing Reference Tests 

A short demonstration of how you
can add reference tests to your assignment by configuring the
[JavaTddPlugin](../JavaTddPlugin/) settings appears in the [Create An Assignment Walkthrough](../CreateAnAssignmentWalkthrough.html) movie.

### Now It's Your Turn 

Use your `CalculatorTest.java` test class as the
reference tests for this assignment  (or use this one:
<a href="attachments/CalculatorReferenceTest.java">CalculatorReferenceTest.java</a>).  Add it to the
assignment.  Use the instructions in the
[Provide Java Reference Tests](../ProvideJavaReferenceTests.html) recipe if you need help.

## Make a Test Submission 

Finally, let's pull it all together and make a test submission to
your assignment.

**Step 1:** Use the **Courses** tab to edit your course's
properties.  Click "Next" until you are viewing your student roster.
Use the list of users at the bottom of the page to add **yourself**
as a student in your own course offering.  Click "Finish" to save your
changes.

**Step 2:** Use the **Assignments** tab to edit your
assignment's properties.  Click the edit icon next to the submission
rules for your assignment.  In the **External Submission
Engines[/ Plug](..//Plug.html)-ins** section at the bottom of the submission rules
profile, be sure to select **List for Eclipse submitter** in the
drop-down list.  Click "Next" to return to your assignment's
properties.  Make sure the **Published** check box is checked.
Then "Finish" to save your changes.

**Step 3:** Switch to Eclipse.  Use the
**Window->Preferences...**
menu command to open the preferences dialog, and then select
**Electronic Submission** on the left.  [Contact Your Administrator](../ContactYourAdministrator.html) and
ask what value to use for the **Assignment definition URL**, which will
allow Eclipse to read available assignment information directly from
the Web-CAT server.  On the Virginia Tech Web-CAT server, for example,
this URL is:
<a href="http://web-cat.cs.vt.edu/Web-CAT/WebObjects/Web-CAT.woa/wa/assignments/eclipse?institution=Guest">http://web-cat.cs.vt.edu/Web-CAT/WebObjects/Web-CAT.woa/wa/assignments/eclipse?institution=Guest</a>.
Save your Eclipse preferences.

Now, right-click on your Calculator project in the Package
Explorer view and chose **Submit...** from the pop-up context
menu.  Follow the wizard to submit your assignment and see your
results.

After completing this step, you may wish to make a few changes to
your own test cases or your Calculator code and then resubmit to see
what happens.

#### If You Are Not Using Eclipse 

You don't need to use Eclipse to use Web-CAT.  If you are using a
different IDE (or just the command line), just zip, jar, or tar up
your project (omit the *.class files, object files, executable files,
etc., please).  Then just use your browser: click the **Submit** tab
in Web-CAT, select your course and assignment, then upload your
files.  If your submission consists of just one file, you don't even
need to archive it.

#### Relevant Cookbook Recipes 

[Submit An Assignment](../SubmitAnAssignment.html) <br/>
[Submission Walkthrough](../SubmissionWalkthrough.html) (Movie: 24Mb, 5min)

----
[SIGCSE 2007 Workshop](index.html)
