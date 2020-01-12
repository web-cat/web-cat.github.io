---
title: SIGCSE 2007 Workshop
---
## Automatically Grading Programming Assignments with Web-CAT 

**SIGCSE 2007 Workshop Companion Wiki**

This page contains the companion materials from the **SIGCSE 2007
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
practice hands-on how to prepare reference tests, set up assignments,
manage multiple sections, and allow graders to manually grade for
design.  Bring your own Java or C++ assignment (small, with sample
solution, and test cases if you have them) to work through.  Go home
ready to start using it in your own classes!

## Workshop Contents 

* Preliminaries: [Setting up your environment](SetUp.html)
* <a href="attachments/Introduction.pps">Introduction.pps</a>
* **Exercise 1**: [Creating JUnit Test Cases with Eclipse](JunitTestCases.html)
* **Exercise 2**: [Setting up your first assignment](FirstAssignment.html)
* **Exercise 3**: [Changing assignment grading options](GradingOptions.html)
* **Exercise 4**: [Configuring coding style checks](StaticChecks.html)
* **Exercise 5**: [Develop your own assignment](TryYourOwn.html)
* <a href="attachments/Conclusions.pps">Conclusions.pps</a>

## Resources 

In addition to the materials on this CD, you may find the
following on-line resources useful:

* The [Web-CAT Wiki](../WebCatWiki.html) is the community support site for Web-CAT, and is the first place to turn for answers or resources.  It includes nearly everything that is publicly available about using Web-CAT.
* The [Web-CAT Cookbook](../Cookbook.html) is a central part of the [Web-CAT Wiki](../WebCatWiki.html).  It provides "recipes" for many common tasks.  It also contains a number of **screen capture movies** showing how things work.  If it doesn't provide a recipe for something you need to do, then start a new one and ask for help!  Contributions are welcome.
* The Web-CAT Wiki's [Test Driven Development](../TestDrivenDevelopment.html) page provides some basic information on TDD together with links to suggested readings available on-line.
* The [Web-CAT Wiki](WebCatWiki.html) contains a [Reading List](../ReadingList.html) on automated grading and on integrating software testing into the CS curriculum, including links to [Our Publications](../OurPublications.html) on the Web-CAT grader and research results.  You will also find a [paper describing our Eclipse-related plug-ins](http://web-cat.cs.vt.edu/grader/edwards-etx.pdf) for supporting student testing activities.
* The Web-CAT Wiki serves as the home for our [SourceForge Project](../SourceForgeProject.html), which supports community development of both Web-CAT and all our Eclipse plug-ins, including our [CxxTest](../CxxTest.html) plug-in.

## Tools You May Need 

While you can view the source code on this CD directly, if
you wish to use it in an IDE, be sure to use an
environment that supports an appropriate unit testing framework.

* For Java examples:
  * **Sun Java Development Kit Standard Edition** ([home page](http://java.sun.com/)):

    You need to install an appropriate Java development environment to compile the Java examples here.  We recommend the latest stable release of JDK v.1.6.x from Sun, although an older v1.5.x version will also suffice for the examples here.

* **BlueJ** ([home page](http://www.bluej.org/)):

    If you wish to try out a beginner-level environment targeted at CS1 students, you can try out BlueJ.  All of our Java examples work in BlueJ, and this environment has excellent built-in support for JUnit.  We use [BlueJ](BlueJ.html) in our CS1 course, and have students writing test cases during their very first lab.

* **Eclipse** ([home page](http://eclipse.org/)):

    Eclipse is a full-featured IDE targeted at professional developers, particularly in the Java community.  It also provides built-in support for JUnit.  We recommend our own [Virginia Tech Student Edition](http://web-cat.cs.vt.edu/eclipse/) of Eclipse, which includes a number of enhancements targeted at students.  The Java examples provided here will work on nearly any Eclipse distribution, however.

* **JUnit v4.1** ([home page](http://www.junit.org/)):

    JUnit comes prebundled with both Eclipse and BlueJ (although BlueJ includes the older v3.8.1 release).  However, if you are not using one of these environments, JUnit is available as a separate jar file you can add to your classpath.

* For C++ examples:
  * **Eclipse, Virginia Tech Student Edition** ([home page](http://web-cat.cs.vt.edu/eclipse/)):

    Although an IDE is not strictly required, if you wish to play around with our C++ examples, we recommend using our preconfigured Eclipse bundle for students.  The Windows version we distribute comes as a self-installing executable that contains everything needed for C++ projects.  Versions for Mac OS/X and Linux are also available.  If you already have an existing Eclipse installation, we provide an update site from which you can install our Eclipse features directly.

* **[CxxTest](CxxTest.html)** ([home page](http://cxxtest.sf.net/)):

    Our C++ support is based on [CxxTest](../CxxTest.html), a unit testing framework similar to JUnit, but for C++ code.  You can visit the [CxxTest](CxxTest.html) home page to read the [CxxTest](CxxTest.html) user's guide.  The [CxxTest](CxxTest.html) support we provide in Eclipse relies on a number of extensions that are not part of the base [CxxTest](CxxTest.html) distribution, however (signal handling, heap error tracking, etc.).

* **g++** ([home page](http://gcc.gnu.org/)):

    [CxxTest](../CxxTest.html) works well with g++, which is the compiler we use in many of our classes.  It is available for most platforms.  A Windows-compatible version of g++ based on [cygwin](http://www.cygwin.com/) is included with our Windows distribution of Eclipse for student use.  Other versions are also available.  If you prefer to use Microsoft Visual C++, instructions for using [CxxTest](CxxTest.html) with Visual C++ are available from the [CxxTest](CxxTest.html) home page.

## Sponsorship 

We gratefully acknowledge the support provided to this work by our
sponsors.  This work is sponsored in part by the
[National Science Foundation](http://www.nsf.org/) under
Grant Nos. DUE-0618663 and DUE-0127225.  Any opinions, findings, and
conclusions or recommendations expressed in this material are those of
the author(s) and do not necessarily reflect the views of the National
Science Foundation.

----
[SIGCSE 2007 Workshop](index.html)
