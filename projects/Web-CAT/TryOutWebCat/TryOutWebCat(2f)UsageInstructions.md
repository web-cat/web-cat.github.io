---
title: 'Try Out Web-CAT: Usage Instructions'
---
## Instructions for Trying Out Web-CAT 

You can login to Web-CAT using the **authentication information you sent
in your original e-mail request to get access**.  Note that your Web-CAT
user name is probably **the same as your [Wiki Name](../WikiName.html)** (or whatever you placed
in your request for access).

You can login to our Web-CAT
server here: http://web-cat.cs.vt.edu/.  Be sure to select
"**Guest User**" as your institution.

## Try Out Student Submissions 

To get a feel for how Web-CAT works, try the [Submission Walkthrough](../SubmissionWalkthrough.html) (24Mb, 5min).

We have six example assignments set up for you to use in trying out
Web-CAT.  Four are in Java and require student-written tests in JUnit
style, and two are in C++ and use [CxxTest](../CxxTest.html)-style student-written test cases.
Lots of other possibilities are available, but these showcase the most
common ways Web-CAT is used by instructors who are trying to incorporate
software testing into programming activities.

If you run into any trouble, then e-mail <a href="mailto:webcat@vt.edu">webcat@vt.edu</a>.

### Sample Project: A Calculator 

Again, for the purposes of demonstration, we've set up a very basic
programming project that you can use in trying out the example assignments.
This project includes a single class called `Calculator`.  Objects of this
class represent a very primitive calculator with a single accumulator.
Operations to add to the accumulator, substract from the accumulator,
get or set the accumulator's value, etc. are provided by the class.

If you'd prefer to try out Web-CAT in Java, then we have three different
versions of the Calculator project for you to use as starting points, or
feel free to write your very own from scratch.  The three versions are:

1. <a href="attachments/Java-calculator-skeleton.zip">Java-calculator-skeleton.zip</a> provides a complete class definition for a `Calculator` class with all of the methods stubbed out.  This is a great place to start if you want to write some of the code and tests yourself, and get a feel for what it is like to write test cases from a student's point of view (a good experience if you've never done it).  The basic getter/setter methods and constructor are implemented, but the rest is up to you (it is pretty easy to fill in, of course).  In addition, there is a skeleton for a `[Calculator Test](../CalculatorTest.html)` class that contains JUnit-style test cases.  One test case is provided for you, and a skeleton is provided for a second.  The remainder is up to you.  This project is ready to submit to any of the example Java assignments described below.
1. <a href="attachments/Java-calculator.zip">Java-calculator.zip</a> provides a complete, but **buggy**, implementation for the skeleton mentioned above.  It provides an incomplete set of test cases, though.  This project is ready to submit to any of the example Java assignments described below.
1. <a href="attachments/Java-calculator-final.zip">Java-calculator-final.zip</a> provides a complete, bug-free implementation for the skeleton mentioned above, together with a complete set of test cases (comparable to what many students would write).  This project is ready to submit to any of the example Java assignments described below.

All of these sample Java projects use JUnit, since the example Java assignments use JUnit.  If you aren't familiar with JUnit or test-driven development, read about [Test Driven Development](../TestDrivenDevelopment.html).

In addition, we provide the same three projects in C++ form (using [CxxTest](../CxxTest.html)-style test cases) for those who prefer to use C++ instead of Java:

1. <a href="attachments/Cpp-calculator-skeleton.zip">Cpp-calculator-skeleton.zip</a>
1. <a href="attachments/Cpp-calculator.zip">Cpp-calculator.zip</a>
1. <a href="attachments/Cpp-calculator-final.zip">Cpp-calculator-final.zip</a>

### Project J1: Java Open Assignment (No Static Analysis) 

This example assignment will process any Java assignment.  The only assumptions
it makes are that (a) there are some Java source files in the submission, (b) at least
one JUnit test class is included, and (c) all test classes have names that end in "Test" or "Tests".
Otherwise, you can submit about anything you like.  You can try one of the Java
Calculator projects provided above, or try your own.

This assignment uses no static analysis checks.  In other words, it does not use
Checkstyle or PMD to check for proper documentation, coding style, formatting
requirements, or conformance to other coding guidelines.  They are turned off
on this assignment so that you can play around with your own code without getting
a huge pile of style violations because you prefer to use different coding conventions
in your courses.  The scoring for this project still includes a static analysis
component (so it will be identical to all the other example Java assignments),
but you'll always get full credit for the static analysis portion of your example score.

This assignment also uses no instructor-provided reference tests.  As a result,
you can submit any Java project you want.  The only real requirement is that
you write your own unit tests.  Scoring is based on how thoroughly you have
tested your own code.  In this assignment, coverage includes how many of
your own methods were executed during your testing, how many of the
statements were executed during your testing, and how many of the conditions
were executed both ways during your testing.  Instructors can chose various
combinations of these for scoring (or none at all).

### Project J2: Java Open Assignment (Full Static Checks) 

This example assignment is just like Project J1, except that it has
full static analysis checks turned on.  The instructor can configure exactly
which style checks are in force for an assignment.  Here, you'll get a taste
of what we expect from our students, which includes fairly tight requirements
for formatting, plus full Javadoc for all public entities.  A number of static
checks are also performed on test cases (i.e., test cases must include
assertions, and bogus assertions like "1 + 1 == 2" don't count, etc.).

Other checks you might run into require that:

* Code is indented every 4 columns using spaces instead of tabs (tabstops are interpreted as being every 8 columns).
* Braces must be used in all control structures.
* Students must be careful about including whitespace around various operators and punctuation symbols to improve readability:
  * White space must surround most binary operators
  * White space must follow most separator characters (like commas in a parameter list or semicolons in a for loop parameter list)

This assignment also uses no instructor-provided reference tests.  As a result,
you can submit any Java project you want.  The only real requirement is that
you write your own unit tests.

Take it for a spin.  If your preferred coding style is different,
don't be surprised if you get lots of warnings!  Of course, if
you use Web-CAT in class, you'll have full control over which
Checkstyle/PMD checks are enabled, what their parameters are,
and what point deduction (if any) is associated with each.

### Project J3: Java Calculator (No Static Analysis) 

This example assignment is just like Project J1, except that it attempts to
compile and run a set of instructor-provided JUnit reference tests against
your submission.  The reference tests are designed to thoroughly test
the Calculator behavior.   As a result, if you submit anything that does not
provide an appropriate Calculator class, your submission will fail to compile
(and you'll get appropriate compiler messages to that effect).

Note that you can certainly write your own project that includes far
more than just a Calculator class.  As long as you write tests for any
extra features you provide, you're OK.  To the extent that you fail to
test any extra features, your score will reflect this omission.

This project will give you a feel for what students experience if the
instructor has chosen specific behavioral requirements to double-check
through independently written reference tests, rather than relying
solely on the student's tests.

As with Project J1, all PMD and Checkstyle checks are turned off,
so you'll always get full credit for the static analysis portion of your
score.  Remember that the instructor has complete control over how
the score is split up, and can devote as much or as little to static
analysis, run-time execution (both student-written and reference
tests), and manual grading by course staff.  In all of these example
assignments, all manual grading is turned off.  In a real classroom,
you would probably devote a specific portion of assignment scores
to manual inspection/grading, which is also performed right through
your web browser.

### Project J4: Java Calculator (Full Static Checks) 

This example is just like Project J3, but with our set of PMD and
Checkstyle checks turned on (just like in P2).

### Project Cpp1: C++ Open Assignment (Using [CxxTest](../CxxTest.html)) 

This example assignment is just like Project J1, but for C++
instead of Java.  You can use any of the example C++ Calculator
projects above, or submit something of your own devising.
If you've never used [CxxTest](../CxxTest.html) before, be sure to read about it
first and start out with one of the Cpp-calculator example projects
so your code will be in the right format.

Note that we also distribute some [Eclipse Plugins](../EclipsePlugins.html) for C++, including
one that provides comprehensive [CxxTest](../CxxTest.html) support for students.  If
you decide you like [CxxTest](../CxxTest.html), you might want to try the plug-ins
out (or our pre-configured Eclipse distributions, which bring
Eclipse, our plug-ins, g++, and cygwin all in one self-installer
for Windows or other OSes).

Note that since PMD and Checkstyle are Java-specific, we do not
yet support the same kinds of static analysis checks for C++ code.
However, if you know of a tool that can do that for us, please
**let our project team know**!

### Project Cpp2: C++ Calculator (Using [CxxTest](../CxxTest.html)) 

This example assignment is just like Project J3, but for
C++ instead of Java.  It includes the same set of instructor-provided
reference tests, but written using [CxxTest](../CxxTest.html).

As with J3, you can certainly write your own project that includes far
more than just a Calculator class.  As long as you write tests for any
extra features you provide, you're OK.  To the extent that you fail to
test any extra features, your score will reflect this omission.

This project will give you a feel for what students experience if the
instructor has chosen specific behavioral requirements to double-check
through independently written reference tests, rather than relying
solely on the student's tests.

## Try Out the Instructor Interface 

If you are planning to use Web-CAT as an instructor, you can
request instructor-level access to the Sandbox area used for evaluation
accounts.  Then you can try out setting up new assignments, or
grading existing assignments.

To preview the way the instructor interface works, take a look at
these walkthrough movies:

* [Create An Assignment Walkthrough](../CreateAnAssignmentWalkthrough.html) (34Mb, 9min)
* [Configure Plugin Walkthrough](../ConfigurePluginWalkthrough.html) (30Mb, 4min)
* [Createa Course Walkthrough](../CreateaCourseWalkthrough.html) (9Mb, 4min)

Please don't create any new course offerings without requesting
permission first.  However, you can create and edit assignments
in the sandbox area set up for that purpose.  The best thing to
try is setting up assignments like Projects J1-J4 and Cpp1-Cpp2,
described above.

To set up those assignments, you can use the following resources.
For the Java assignments:

* Start with J2, which requires no configuration and no extra files.
* Next, try J4, which is just like J2, but also uses instructor-provided reference tests.  The test file we used in setting up J4 is:

    <a href="attachments/CalculatorReferenceTest.java">CalculatorReferenceTest.java</a>

* Next, try J1, which does not use any reference tests, but does use two extra configuration files:
        <a href="attachments/checkstyle-None.xml">checkstyle-None.xml</a>
<a href="attachments/pmd-None.xml">pmd-None.xml</a>

* Finally, try J3, which combines the reference tests of J4 with the reusable option set you created for J1.

For the C++ assignments:

* Start with Cpp1, which requires no configuration and no extra files.
* Next, try Cpp2, which uses the following instructor-provided reference tests:

    <a href="attachments/__instructor__test.h">__instructor__test.h</a>

If you're not sure what to do, be sure to look at the available recipes in the [Web-CAT Cookbook](../Cookbook.html)--look in the instructor's section.
Also, feel free to contact <a href="mailto:webcat@vt.edu">webcat@vt.edu</a> if you run into trouble and need help.
