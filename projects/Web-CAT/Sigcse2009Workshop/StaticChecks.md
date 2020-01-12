---
title: 'Sigcse2009 Workshop: Ex.4: Configuring Coding Style Checks'
---

## Goal 

In this exercise, we will explore some additional grading options
you can use to tailor the processing of your assignments.  You will
also create a second assignment of your own.

## Learning Objectives 

* Mastery of configuring a grading plug-in
* Familiarity with plug-in reusable option sets
* Familiarity with the basic options for the [JavaTddPlugin](../JavaTddPlugin/)
* Exposure to providing data files for student testing
* Exposure to configuring PMD checks
* Exposure to configuring Checkstyle checks
* Exposure to configuring score settings for static checks

## A New Example 

For this exercise, we will use a new example taken from Virginia
Tech's CS 1 course.  This example is a web log analyzer that reads
Apache-style web server logs.  It tabulates hit rates by day of the
week and hour of the day.  We'll load it into a new Eclipse project, set up a new
Web-CAT assignment for it, and then tweak the assignment's settings.

## Create a New Project in Eclipse 

Now that you've worked with the Calculator example for a while,
let's switch gears and work with a new example.

In Eclipse, select the File->New->Project... menu and select
Java Project.  Name it **![Log Analyzer](../LogAnalyzer.html)** and accept defaults for the
other settings.

Add these two files to your new project: <a href="attachments/VTLogAnalyzer.java">VTLogAnalyzer.java</a> and
<a href="attachments/VTLogAnalyzerTest.java">VTLogAnalyzerTest.java</a>.  They won't compile yet, however.

Also, download <a href="attachments/cs1705.jar">cs1705.jar</a> and place it into
your new Eclipse project as well (you can drag it into your project in
the Package Explorer view).

Right-click the `cs1705.jar` file in the Package
Explorer and select Build Path->Add to Build Path.

Finally, right-click on your `LogAnalyzer` project in the Package
Explorer view and select Build Path->Add Libraries..., select
JUnit from the resulting list, and click Finish.  This should clear up
any remaining compiler errors in the project.

However, if you run your tests, all the tests will fail!  That is
because the `VTLogAnalyzerTest` class uses an external log
file as the input for its tests, and your project does not contain
this file yet.

Download <a href="attachments/sample.log">sample.log</a> and add it to your `LogAnalyzer` project and
re-run your tests.

## Create a New Web-CAT Assignment 

In your web browser, click the **Assignments** tab and create a
brand new assignment for the web log analyzer.  Use your initials to
provide the name (e.g., "SE 2" or "MPQ 2").  Choose the same
submission rules as you used for your first assignment (should be
named with your name).

Add the [JavaTddPlugin](../JavaTddPlugin/) to the grading scheme.  Click the edit icon
for the [JavaTddPlugin](../JavaTddPlugin/) entry, and select your reusable option set
(again, look for your name).  **Do not worry about reference
tests** for this assignment.  We'll go without them this time.  You
can come back and add them after completing this exercise, if there is
time.

After selecting your reusable option set, click "Next" to go back
to your assignment's properties.  Make sure to check "Publish It", and
then **Finish**.

## Make a Test Submission 

From Eclipse, make a test submission from your `LogAnalyzer`
project.  Make sure everything looks OK.

All of your tests should have failed!  While you've added the
`sample.log` file to your project, it was not included in
your submission to Web-CAT.  Web-CAT assignments are configured by
default to exclude any *.log, *.dat, *.bin, *.zip, *.jar, etc. files
from submissions.  After all, we don't want many, many copies of the
same files constantly going back and forth to the server, for each and
every student.  In fact, Web-CAT imposes a cap on the size of project
submitted by students (controled by the submission policy for your
assignment), with a default of 200K.

## Add a Data File to Your Assignment 

To resolve this situation, let's configure the assignment to
**provide** a stock set of data files when running each student's
tests.  The same set of files will be available for everyone, without
students having to submit their own independent (but identical) copies.

In your web browser, click the **Assignments** tab and navigate
to your web log analyzer assignment's properties.

Click on the edit icon for the [JavaTddPlugin](../JavaTddPlugin/) step in the grading
scheme.

Under the Assignment-Specific Options section in the lower half of
the window, look for the **Data Files for Student** parameter and
click its Browse button.

Upload your `sample.log` file, and then select it as the
data file to provide.  For other assignments, you could upload an
entire directory of data files (or a zip archive that you could expand
on upload to populate an entire directory tree).  If you select a
directory, the contents of that directory are made available in the
current working directory during grading.  If you select a single
file, then that single file is provided in the current working
directory during grading.  These files can be used in either
student-written tests, instructor-written reference tests, or
both.

Click **Finish** to save your work.

## Regrade Your Submission 

Rather than resubmitting your project, let's use Web-CAT's regrade
feature.  Click the **Grading** tab and navigate to your new web
log analyzer assignment.

Click the edit link in the **TA** column for your submission to
view your submission results.

Look for the **Regrade Submission** button near the top of the
page.  Click it, and then click **OK** to regrade this
submission.

Use the **Results** tab to look up your new results.  Did all
your tests pass?

Note that when Web-CAT regrades an assignment, it puts it at the
back of the processing queue.  Fresh assignments always take
precedence over regrading actions.  However, once the regrading is
completed, Web-CAT will notify the student by e-mail.

#### Relevant Cookbook Recipes 

[Regrade One Student](../RegradeOneStudent.html) <br/>
[Regrade All Students](../RegradeAllStudents.html)

## Examine Static Analysis Scoring 

While all your tests should now pass, you will still receive less
than a perfect score.  That is because the solution you are using does
not follow all of the coding conventions enforced by Web-CAT's static
analysis tools.  The sample solution, adapted from a sample project in
Barnes and K&ouml;lling's _Objects First with Java_ book, does
not follow the same conventions.

Under the **Results** tab, look inside the files you submitted
and view the detailed comments provided for an example.

The [JavaTddPlugin](../JavaTddPlugin/) automatically deducts points for static analysis
violations.  It uses a Java-style properties file to define the
penalties for each offense.  You can see the [JavaTddPlugin](../JavaTddPlugin/)'s default
scoring scheme here:
[markup.properties](http://web-cat.cvs.sourceforge.net/web-cat/Plugins/JavaTddPlugin/src/markup.properties?view=markup).

In the future, you can edit and then upload your own custom
version of this penalty file using your assignment's reusable option
set.

## Configure PMD Checks 

Rather than directly editing the static analysis scoring file,
however, let's simply disable the static checks.  The process used
here is the same one you would use if you were planning to add,
remove, or customize the checks performed.  We'll start with PMD.

[PMD](http://pmd.sourceforge.net/) is an open-source
static analysis tool for Java.  It provides a large collection of
static analysis checks, many of which embody accepted best practices
for coding style.

PMD is controlled by an XML file that defines the configuration you
wish to use when checking student code.  To change the behavior of
PMD, simply provide a new configuration file for it.

For now, let's just turn off the PMD checks.  We can do this with
an XML configuration file that tells PMD to shut off all checks:
<a href="attachments/pmd-None.xml">pmd-None.xml</a>.

In Web-CAT, click the **Assignments** tab and navigate to your
web log analyzer assignment.

Click the edit icon for the [JavaTddPlugin](../JavaTddPlugin/).

Click the edit icon for your reusable option set.

Choose **Static Analysis** from the "Show:" drop-down list.

Click the **Browse** button for the **PMD Configuration**
parameter.

Upload and then select the <a href="attachments/pmd-None.xml">pmd-None.xml</a> file.

Click **Finish** to save your changes.

For reference, the checks provided by the [JavaTddPlugin](../JavaTddPlugin/)'s
default configuration are defined in
[pmd.xml](http://web-cat.cvs.sourceforge.net/web-cat/Plugins/JavaTddPlugin/src/pmd.xml?view=markup),
which indirectly refers to
[several other files](http://web-cat.cvs.sourceforge.net/web-cat/Plugins/JavaTddPlugin/src/plugin-rulesets/).
You can write your own XML file that refers to some
or all of these customized rules, or that suppresses specific rules.
Check out the PMD project's instructions on
[how to make a rule set](http://pmd.sourceforge.net/howtomakearuleset.html).

## Configure Checkstyle Checks 

[Checkstyle](http://checkstyle.sourceforge.net/) is
another open-source static analysis tool for Java.  Many of its checks
overlap those in PMD, but it also provides some unique checks of its
own.

Like PMD, Checkstyle is also controlled by an XML configuration
file that defines which checks are enabled.  Customizing the set of
Checkstyle rules that are enabled works just like it does for PMD.
Just upload your custom Checkstyle XML configuration file.

To turn off all Checkstyle checks, for example, edit your
assignment's properties, and go into the [JavaTddPlugin](../JavaTddPlugin/)'s reusable
option set again.  Under the **Static Anaylsis** category, look for
the **Checkstyle Configuration** parameter.

Upload and select this file: <a href="attachments/checkstyle-None.xml">checkstyle-None.xml</a>.

After selecting this file as the Checkstyle configuration file,
click **Finish** to save your work.

Use the **Grading** tab to find and then regrade your latest
submission to your web log analyzer assignment.  Did the static
analysis errors go away?

For reference, the checks provided by the [JavaTddPlugin](../JavaTddPlugin/)'s
default configuration are defined in
[checkstyle.xml](http://web-cat.cvs.sourceforge.net/web-cat/Plugins/JavaTddPlugin/src/checkstyle.xml?view=markup).

----
[SIGCSE 2009 Workshop](index.html)
