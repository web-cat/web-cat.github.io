---
title: Eclipse Plugins
---
Under the umbrella of Web-CAT development, we also are working on a number of Eclipse plugins and a full student Eclipse distribution that are designed to support unit testing by students, as well as to integrate Web-CAT-style assignment grading right into the IDE.
The following paper presents a good overview of our Eclipse work:

    Anthony Allowatt and Stephen H. Edwards. [IDE support for test-driven development and automated grading in both Java and C++](http://web-cat.cs.vt.edu/grader/edwards-etx.pdf).  In _Proceedings of the Eclipse Technology Exchange (eTX) Workshop at OOPSLA 2005_, October 2005, to appear.

All of our plug-ins can be directly installed from our [Eclipse update site](http://web-cat.cs.vt.edu/eclipse/).

## Electronic Submission Plug-in 

See: [Submission Plugin](SubmissionPlugin/)

This plug-in provides a core engine and user interface to allow students or other users to package and submit their projects easily from within Eclipse to an automated grading system or file collection server.

The key features of this plug-in include:

* Built-in support for http, https, ftp, mailto, and file protocols
* Built-in support for ZIP and JAR archiving
* Additional protocols/packagers can be added via extension points
* Hierarchical tree of submission targets configured by an easy-to-understand XML file
* File-pattern-based inclusion and exclusion of files in submissions
* File-pattern-based specification of required files in submissions

## CxxTest Plug-in 

See: [CxxTest Plugin](CxxTestPlugin.html)

[CxxTest](../../CxxTest.html) is a unit-testing framework for C++ development that behaves similarly to Eclipse's native support for [JUnit](../../http://www.junit.org). This plug-in provides better integration with Eclipse and the CDT. Some key features are:

* Automatically detects test suites in a project by navigating the CDT DOM
* Generates a source file to run all test suites that will be compiled with the containing project
* Enable/disable [CxxTest](../../CxxTest.html) features on a per-project basis through the project properties dialog
* Automatically execute all tests after each successful build
* Test failures are annotated with markers in source files
* Test results appear in a [CxxTest](../../CxxTest.html) view modeled after the JUnit view in Eclipse

## Student-oriented Eclipse Feature for Java 

See: [Java Feature](JavaFeature.html)

Our Java feature is designed to support students.  Some key features are:

* Full Eclipse-style support for Java development
* A streamlined interface for students based upon [Gild](http://gild.cs.uvic.ca)
* Support for static checks within the IDE that mirror those we use on ["Web-CAT"], so students will get warnings earlier during development
* Eclipse's built-in JUnit support
* Built-in electronic submission of assignments using our [Eclipse Plugins/Submission Plugin](SubmissionPlugin/)

## Student-oriented Eclipse Feature for C++ 

See: [Cpp Feature](CppFeature.html)

Our C++ feature is designed to support students.  Some key features are:

* Full Eclipse-style support for C++ development (we use g++ on top of cygwin or unix, via the Eclipse CDT)
* Custom plug-in support for writing and executing test cases using [CxxTest](../CxxTest.html) via our [Eclipse Plugins/CxxTest Plugin](CxxTestPlugin.html)
* Built-in electronic submission of assignments using our [Eclipse Plugins/Submission Plugin](SubmissionPlugin/)
