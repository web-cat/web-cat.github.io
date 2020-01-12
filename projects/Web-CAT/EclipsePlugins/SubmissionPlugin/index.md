---
title: 'Eclipse Plugins: Submission Plugin'
---
The **electronic submission plug-in for Eclipse** allows Eclipse users to electronically submit projects to services, including grading systems.

This plug-in provides a core engine and user interface to allow students or other users to package and submit their projects easily from within Eclipse to an automated grading system or file collection server.

The key features of this plug-in include:

* Built-in support for http, https, ftp, mailto, and file protocols
* Built-in support for ZIP and JAR archiving
* Additional protocols/packagers can be added via extension points
* Hierarchical tree of submission targets configured by an easy-to-understand XML file
* File-pattern-based inclusion and exclusion of files in submissions
* File-pattern-based specification of required files in submissions

## Download the Submission Plugin 

This plug-in is provided as part of both our ..[/ Java Feature](..//JavaFeature.html) and our ..[/ Cpp Feature](..//CppFeature.html), which you can install using Eclipse's built-in update command.

Alternatively, If you want to use the electronic submission plug-in by itself, you can 
[download it](../http://sourceforge.net/project/showfiles.php?group_id=142064&package_id=160235) from our [Sourceforge Project](../SourceforgeProject.html).

The downloadable zip file is designed so you can directly unpack it in your eclipse installation.  It will add three plug-in directories to your eclipse/plugins folder: the core submission engine, the submission plug-in documentation, and the submission wizard user interface.  The downloadable zip also contains the GPL-licensed source code.

You can visit our [Sourceforge Project](../SourceforgeProject.html) for CVS access to the latest plug-in source, or to report a bug or request a new feature.

## Submission Plugin Documentation 

For all users--students and instructors alike--the following pages describe how to configure the plug-in and how to submit a project from your Eclipse workspace.

* [/ Plugin Preferences](..//PluginPreferences.html)
* [/ Submitting Projects](..//SubmittingProjects.html)

Instructors can collect assignment submissions through some service, whether as simple as direct e-mail to the instructor, or as complex as an SSL web connection to an automated grading system.  The following page explains how an instructor can publish assignment descriptions that students can submit to.  Such assignments are defined in an XML control file, which would usually be placed on a web site or in a local file on the student's machine.
The plug-in reads such an assignment definition set in order to display submission targets to the user.

* [/ Assignment Definitions](..//AssignmentDefinitions.html)
