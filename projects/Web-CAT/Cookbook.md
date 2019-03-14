---
title: The Web-CAT Cookbook
aside:
  toc: true
---

The **Web-CAT Cookbook** shows how to use [Web-CAT](Web-CAT.html) as an
automated grading tool.  It is intended to be a living, community-maintained
document where people can come to learn (and teach others) how to set up and
run programming assignments using [Web-CAT](Web-CAT.html).  Common scenarios
and problem solutions in using [Web-CAT](Web-CAT.html) are documented in the
form of short use case "recipes".

A secondary aim of the Cookbook is to further the adoption
of [Web-CAT](Web-CAT.html). To that end we want to allow the possibility of
a publishable book. The [Contributor Agreement](ContributorAgreement.html)
statement for this book is the most important consideration for publication.
It is designed to allow free access to the content of the Cookbook while
protecting the investmest a publisher may make in a compilation of material
from the Cookbook. If you are going to contribute to the Cookbook you must
agree to the [Contributor Agreement](ContributorAgreement.html) statement.

This cookbook is written in the form of a website hosted on **GitHub Pages**.
To ask questions or make comments on any page, use the comment box at the
bottom of that page.
To add new pages, write your own recipes, or contribute other content,
please fork the repository, add your page(s) and link them in,
and [create a pull request](https://help.github.com/en/articles/creating-a-pull-request-from-a-fork).
For major concerns, such as suggesting revisions to the overall site
navigation, [open an issue on GitHub](https://github.com/web-cat/web-cat-cookbook/issues).

Given the current lack of practical documentation on how to write "testable"
programming assignments, and lack of documentation on pedagogical strategies
for using automated graders for feedback and learning, we also aim for the
Cookbook to cover these areas as well.

The Cookbook is a living, collaborative, community-maintained document and
contributions are actively sought from all users of [Web-CAT](Web-CAT.html). See the
Author Guide at the bottom of this page for instructions on how you can
contribute.   It's structure (and Author Guide) are based on
the [Schematics Cookbook](http://schemecookbook.org/Cookbook), a
wiki-based documentation project.  This basic organization has been reused
under the terms of the LGPL, which also governs community contributions to
the Web-CAT Cookbook.

Look for the :movie_camera: in the recipes below if you want a quick video tour
of what Web-CAT is like, starting with
the [Submission Walkthrough](SubmissionWalkthrough.html) (24Mb, 5min).
Pages marked with :warning: do not exist yet--so contribute!

## Basic Concepts 

* [What Is Web Cat?](Web-CAT.html)
* [Courses And Course Offerings](CoursesAndCourseOfferings.html)
* [Assignments And Assignment Offerings](AssignmentsAndAssignmentOfferings.html)
* [Role Based Permissions](RoleBasedPermissions.html)
* [Web Cat Faq](WebCatFaq.html)
  * [Try Out Web Cat](TryOutWebCat.html) (with [usage instructions](TryOutWebCat-UsageInstructions.html))
  * Sigcse2009Workshop: self-paced, on-line, quick-start training for new instructors (a detailed outline is available lower on this page)
* [Web Cat Features](WebCatFeatures.html) (and [Web Cat Change History](WebCatChangeHistory.html))
* [Web-CAT Development Blog](http://people.cs.vt.edu/~edwards/Web-CAT-Blog.html)
* [Mailing Lists](MailingLists.html)
* [Our Publications](OurPublications.html)

## Recipes for Students 

* [Login To Web Cat](LoginToWebCat.html)
* [Change Your Password](ChangeYourPassword.html)
* [Submit An Assignment](SubmitAnAssignment.html)
  * [Submission Walkthrough](SubmissionWalkthrough.html) (24Mb, 5min) :movie_camera: 
  * [Submit Using Bluej](SubmitUsingBluej.html) :warning:
  * [Submit Using Eclipse](SubmitUsingEclipse.html) :warning:
* [Interpret Your Feedback Report](InterpretYourFeedbackReport.html)
  * [Interpret Java Tdd Feedback](InterpretJavaTddFeedback.html) :warning:
  * [Interpret Cpp Tdd Feedback](InterpretCppTddFeedback.html) :warning:
  * [Improve Your Testing](ImproveYourTesting.html) :warning:
* [Look Up Assignment Results](LookUpAssignmentResults.html)
* [Look Up An Old Submission](LookUpAnOldSubmission.html)
* [View Graphs Of Your Results](ViewGraphsOfYourResults.html) :warning:
* [Download What You Submitted](DownloadWhatYouSubmitted.html)

## Recipes for Graders 

* [Grading Walkthrough](GradingWalkthrough.html) :warning: :movie_camera: 
* [Manually Gradea Student Submission](ManuallyGradeaStudentSubmission.html) :warning:
* [Override Late Penalties](OverrideLatePenalties.html) :warning:
* [Give Extra Credit](GiveExtraCredit.html) :warning:
* [Regrade One Student](RegradeOneStudent.html)

## Recipes for Instructors 

### Self-paced On-line Training Materials 

* [Sigcse 2009 Workshop](Sigcse2009Workshop.html): **Automatically Grading Programming Assignments with Web-CAT**

  The workshop page contains electronic copies of the workshop materials
  in a form that you can try on your own, either on your own Web-CAT server,
  or with a guest account on the server at Virginia Tech.  The workshop's
  hands-on materials include:

  * Preliminaries: [Setting up your environment](Sigcse2009Workshop/SetUp.html)

    Before you try the hands-on exercises, be sure you have Eclipse installed.
    Web-CAT does not require Eclipse, but the hands-on exercises here are
    written for that IDE to simplify the instructions.
    The [preliminary setup instructions](Sigcse2009Workshop/SetUp.html) also
    explain how to install our submission plug-in for eclipse.

  * **Exercise 1**: [Creating JUnit Test Cases with Eclipse](Sigcse2009Workshop/JunitTestCases.html)

    This exercise will give you a bit of practice writing simple test cases
    with JUnit, if you have not already used that testing framework.  It also
    explains how to run those tests within Eclipse and interpret the results.

  * **Exercise 2**: [Setting up your first assignment](Sigcse2009Workshop/FirstAssignment.html)

    The second exercise walks you through the following activities:

    * Creating your first course offering
    * Uploading your course roster as a CSV file
    * Creating your first assignment
    * Submitting a sample solution to try out your assignment

    More resources for various practice assignments are also available under
    [Try Out Web Cat/Usage Instructions](TryOutWebCat/UsageInstructions.html).

  * **Exercise 3**: [Changing assignment grading options](Sigcse2009Workshop/GradingOptions.html)

    The third exercise is all about customizing the behavior of grading
    plug-ins, using the [JavaTddPlugin](JavaTddPlugin.html) as an example.
    It walks you through the following activities:

    * Configuring an assignment without test cases
    * Modifying an assignment so students are not required to write tests
    * Changing code coverage requirements
    * Providing "hints" to students when instructor tests fail
    * Hand-grading key parts of students submissions

  * **Exercise 4**: [Configuring coding style checks](Sigcse2009Workshop/StaticChecks.html)

    The fourth exercise walks you through the following activities:

    * Adding instructor-provided data files to an assignment
    * Regrading student submissions when they need to be reprocessed
    * A brief overview of how static analysis works
    * How to provide custom PMD checks (including turning them off)
    * How to provide custom Checkstyle checks (including turning them off)

### Bite-sized Recipes for Instructors 

* Setting Up A Course Offering
  * [Createa Course Walkthrough](CreateaCourseWalkthrough.html) (9Mb, 4min) :movie_camera:
  * [Createa Course Offering](CreateaCourseOffering.html)
  * [Upload Your Course Roll](UploadYourCourseRoll.html)
  * [Adding Students](AddingStudents.html)
  * [Dropping Students](DroppingStudents.html)
  * [Add Another Instructor](AddAnotherInstructor.html)
  * [Add Another Grader](AddAnotherGrader.html)
  * [Contact Your Administrator](ContactYourAdministrator.html)
* Setting Up An Assignment
  * [Create An Assignment Walkthrough](CreateAnAssignmentWalkthrough.html) (34Mb, 9min) :movie_camera:
  * [Create An Assignment](CreateAnAssignment.html)
  * [Choose Your Plugin](ChooseYourPlugin.html)
  * [Configure Plugin Settings](ConfigurePluginSettings.html)
  * [Configure Plugin Walkthrough](ConfigurePluginWalkthrough.html) (30Mb, 4min) :movie_camera:
  * [Multiple Course Sections](MultipleCourseSections.html)
  * [Set Late Policy](SetLatePolicy.html)
  * [Give Early Bonuses](GiveEarlyBonuses.html)
  * [Hide An Assignment](HideAnAssignment.html)
  * [Regrade One Student](RegradeOneStudent.html)
  * [Regrade All Students](RegradeAllStudents.html)
  * [Move Back Due Date](MoveBackDueDate.html)
* Advanced Features
  * [Configure Blue Js Submitter](ConfigureBlueJsSubmitter.html)
  * [Configure Eclipse Submitter](ConfigureEclipseSubmitter.html)
  * [Installa New Plugin](InstallaNewPlugin.html) :warning:

### Configuring the Java TDD Grading Plug-in 

* Reference materials:
  * [JavaTddPlugin](JavaTddPlugin/)
  * [JavaTddPlugin/Default Configuration](JavaTddPlugin/DefaultConfiguration.html)
  * [JavaTddPlugin/Parameter Descriptions](JavaTddPlugin/ParameterDescriptions.html)
  * [JavaTddPlugin/Hint Control](JavaTddPlugin/HintControl.html)

* Recipes:
  * [Configure Plugin Walkthrough](ConfigurePluginWalkthrough.html) (30Mb, 4min) :movie_camera:
  * [Provide Java Reference Tests](ProvideJavaReferenceTests.html)
  * [Provide Student Hints](ProvideStudentHints.html)
  * [Set Java Coverage Criteria](SetJavaCoverageCriteria.html)
  * [Disable Pmd And Checkstyle](DisablePmdAndCheckstyle.html)
  * [Customize Pmd Checks](CustomizePmdChecks.html)
  * [Customize Checkstyle Checks](CustomizeCheckstyleChecks.html)
  * [Set Deductions For Checks](SetDeductionsForChecks.html) :warning:
  * [Provide Course Jar File](ProvideCourseJarFile.html) :warning:
  * [Java Assignment Data Files](JavaAssignmentDataFiles.html)
  * [Java Supplemental Classes](JavaSupplementalClasses.html) :warning:

### Configuring the C++ TDD Grading Plug-in 

* Reference materials:
  * [CppTddPlugin](CppTddPlugin/)
  * [CppTddPlugin/Default Configuration](CppTddPlugin/DefaultConfiguration.html)
  * [CppTddPlugin/Parameter Descriptions](CppTddPlugin/ParameterDescriptions.html)

### Configuring the C++ Stdio Grading Plug-in 

* Reference materials:
  * [CppStdioPlugin](CppStdioPlugin/)
  * [CppStdioPlugin/Default Configuration](CppStdioPlugin/DefaultConfiguration.html)
  * [CppStdioPlugin/Parameter Descriptions](CppStdioPlugin/ParameterDescriptions.html)

### Configuring the Pascal Compiler Plug-in 

* Reference materials:
  * [PascalCompilerPlugin](PascalCompilerPlugin/)
  * [PascalCompilerPlugin/Default Configuration](PascalCompilerPlugin/DefaultConfiguration.html)
  * [PascalCompilerPlugin/Parameter Descriptions](PascalCompilerPlugin/ParameterDescriptions.html)
  * [PascalCompilerPlugin/Change History](PascalCompilerPlugin/ChangeHistory.html)

### Configuring the Text TDD Plug-in 

* Reference materials:
  * [TextTddPlugin](TextTddPlugin/)
  * [TextTddPlugin/Default Configuration](TextTddPlugin/DefaultConfiguration.html)
  * [TextTddPlugin/Parameter Descriptions](TextTddPlugin/ParameterDescriptions.html)
  * [TextTddPlugin/Change History](TextTddPlugin/ChangeHistory.html)

### Configuring the Generic TDD Feedback Plug-in 

* Reference materials:
  * [GenericTddFeedbackPlugin](GenericTddFeedbackPlugin/)
  * [GenericTddFeedbackPlugin/Default Configuration](GenericTddFeedbackPlugin/DefaultConfiguration.html)
  * [GenericTddFeedbackPlugin/Parameter Descriptions](GenericTddFeedbackPlugin/ParameterDescriptions.html)
  * [GenericTddFeedbackPlugin/Change History](GenericTddFeedbackPlugin/ChangeHistory.html)

### Configuring the Output Comparison Plug-in 

* Reference materials:
  * [OutputComparisonPlugin](OutputComparisonPlugin/)
  * [OutputComparisonPlugin/Default Configuration](OutputComparisonPlugin/DefaultConfiguration.html)
  * [OutputComparisonPlugin/Parameter Descriptions](OutputComparisonPlugin/ParameterDescriptions.html)
  * [OutputComparisonPlugin/Change History](OutputComparisonPlugin/ChangeHistory.html)

## Recipes for Administrators 

* Installation and Setup
  * [Installation Walkthrough](InstallationWalkthrough.html) (29Mb, 7min) :movie_camera:
  * [System Requirements](SystemRequirements.html)
  * [Install Web Cat](InstallWebCat.html)
  * [Customize Login Page](CustomizeLoginPage.html) :warning:
* Configuring Web-CAT
  * [Edit System Properties](EditSystemProperties.html) :warning:
  * [Edit Message of the Day](EditMessageOfTheDay.html) :warning:
  * [Edit Announcements](EditAnnouncements.html) :warning:
* Managing Courses
  * [Createa New Department](CreateaNewDepartment.html)
  * [Createa New Course](CreateaNewCourse.html)
* Managing Users
  * [Reset User Password](ResetUserPassword.html) :warning:
  * [Createa New User](CreateaNewUser.html)
  * [Createa New Grader](CreateaNewGrader.html)
  * [Createa New Instructor](CreateaNewInstructor.html)
  * [Grant Instructor Permissions](GrantInstructorPermissions.html)
* [Install a New Plugin](InstallaNewPlugin.html)
* [Set Plugin Global Properties](SetPluginGlobalProperties.html) :warning:
* [Update Bootstrap Jar](UpdateBootstrapJar.html)

## Information for Developers 

* [Development Priorities](DevelopmentPriorities.html) capture current plans for fixes and enhancements

### Recipes for Plug-in Writers 

* [Writea Plugin](WriteaPlugin.html) :warning:
* [Define Plugin Parameters](DefinePluginParameters.html) :warning:
* [Simple Plugin Example](SimplePluginExample.html) :warning:
* [Installa New Plugin](InstallaNewPlugin.html) :warning:
* [Set Plugin Global Properties](SetPluginGlobalProperties.html) :warning:
* [Edit Plugin Files Online](EditPluginFilesOnline.html) :warning:

### Web-CAT Internals 

## Teaching Strategies 

### Writing Testable Assignments 

* recipes on the way

### Using Web-CAT to Improve Learning 

* recipes on the way

## Author Guide 

* [Contributor Agreement](ContributorAgreement.html)
* [Becoming An Author](BecomingAnAuthor.html)
* [Creating Recipes](CreatingRecipes.html)
* [Editing Existing Text](EditingExistingText.html)
* [Including Source Code](IncludingSourceCode.html)
* [You Have Permission](YouHavePermission.html)

## Requested Recipes 

* Add your requests for new recipes here
