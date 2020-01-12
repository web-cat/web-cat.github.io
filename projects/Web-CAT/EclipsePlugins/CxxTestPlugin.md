---
title: 'Eclipse Plugins: CxxTest Plugin'
---
The **[CxxTest](../CxxTest.html) plug-in for Eclipse** provides Eclipse users who are developing C++ code with a graphical user interface for [CxxTest](../CxxTest.html).

[CxxTest](../CxxTest.html) is a unit-testing framework for C++ development that behaves similarly to Eclipse's native support for [JUnit](../../http://www.junit.org). This plug-in provides better integration with Eclipse and the CDT. Some key features are:

* Automatically detects test suites in a project by navigating the CDT DOM
* Generates a source file to run all test suites that will be compiled with the containing project
* Enable/disable [CxxTest](../CxxTest.html) features on a per-project basis through the project properties dialog
* Automatically execute all tests after each successful build
* Test failures are annotated with markers in source files
* Test results appear in a [CxxTest](../CxxTest.html) view modeled after the JUnit view in Eclipse

## Download the CxxTest Plugin 

This plug-in is provided as part of our ..[Cpp Feature](CppFeature.html), which you can install using Eclipse's built-in update command.

Alternatively, If you want to use the CxxTest plug-in by itself, you can 
[download it](http://sourceforge.net/project/showfiles.php?group_id=142064&package_id=160236) from our [Sourceforge Project](../SourceforgeProject.html).

The downloadable zip file is designed so you can directly unpack it in your eclipse installation.  It will add three plug-in directories to your eclipse/plugins folder: the core [CxxTest](../CxxTest.html) plugin, the plug-in documentation, and the wizards used to create new managed make projects that automatically support [CxxTest](../CxxTest.html) development.  The downloadable zip also contains the GPL-licensed source code.

You can visit our [Sourceforge Project](../SourceforgeProject.html) for CVS access to the latest plug-in source, or to report a bug or request a new feature.

## CxxTest Plugin Documentation 

If you have the CxxTest plug-in installed, you can access the documentation right from within Eclipse.  Use the Help->Help Contents menu command, and select **[CxxTest](../CxxTest.html) User's Guide** from the contents list.

Alternatively, we provide an [on-line mirror of the plug-in documentation](http://web-cat.cs.vt.edu/eclipse/cxxtest).

You may also wish to read the [CxxTest User's Guide](http://cxxtest.sourceforge.net/guide.html) available from the [CxxTest home page](../http://cxxtest.sf.net).
