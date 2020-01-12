---
title: Configure Plugin Settings
---
## Problem 

You want to set the parameters for a grading plug-in that you have
selected to process one of your assignments.

## Solution 

This recipe assumes that you have already created an assignment, and
that you have already added one or more plug-ins to the grading scheme
for it (see [Create An Assignment](CreateAnAssignment.html) and [Choose Your Plugin](ChooseYourPlugin.html)).

Follow the instructions in [Create An Assignment](CreateAnAssignment.html) to get to your
assignment's properties page.

Under the **properties for all instances of this assignment**, the
grading scheme includes a list of **steps** in the processing
pipeline.  Each step is a separate plug-in.

Click the **Edit icon** for the plug-in you wish to configure.  This
icon appears in the "Action" column of the list of steps in the
grading scheme.

### Configure Plug-in 

The configuration options for each plug-in are divided into two
categories:

* **Assignment-specific options** must be set for each assignment individually. These options include those settings that are likely to be different for each new assignment.
* **Reusable configuration options** are designed so that you can store them in a profile that you can reuse across many assignments.  You must create a reusable option set in order to access these features, but once it has been created, you can reuse it on any future assignments you create (when you use this plug-in again, of couse).  Changes to the reusable option set affect all assignments that use it.

On the **Configure Plug-in** page, the reusable options come first,
but here, we will discuss them second.  If you don't select a reusable
option set, you'll just use the default plug-in settings for all of
the reusable options, which should still result in a usable assignment.

By default, the **Configure Plug-in** page will show verbose
descriptions for each option that is displayed.  You can click the
"Hide" button in order to omit these descriptions and compress the
display, or "Show" them again when you need to see the descriptions.

### Assignment-Specific Options 

The assignment-specific options include all those settings that the
plug-in designer believes you'll want to change (or specify) every
time you create an assignment.

Examples of assignment-specific options include instructor-provided
reference tests, assignment-specific data files that you want to make
available to all student submissions during evaluation, header files
or compiled files that define interfaces or auxilliary classes
specific to this assignment, and so on.

Usually, instructor-provided reference tests (if any) are the most
commonly used assignment-specific settings.

Refer to your plug-in's parameter definitions for complete details
about the meaning of and default value for each assignment-specific
option.

### Reusable Configuration Options 

These options are designed so that you can reuse across many
assignments.  You must create a reusable option set in order to
access these features.  Use the "New" button to create a new profile,
which you can give any name you wish.  In the future, you can use the
drop-down list to select among the existing reusable option profiles
that you have created, or click the "Edit" icon to edit the settings
for the selected profile.

When you edit a reusable option set, there is a field for you to give
its name; a default value is provided, but feel free to change it to
something more meaningful.

In addition, you will see a list of all of the assignments that are
currently using this option set.  Changes to the reusable option set
will affect _all_ of these assignments immediately.

There may be quite a few reusable configuration options, or simply
**shared options**.  As a result, the plug-in designer may have
decided to group related options together so that they can be viewed
group-by-group rather than all at once.  If so, a "Show:" drop-down
list will appear at the top of the options.  Choose the group that you
wish to view, or choose "All Options" to see everything at once.  If
there is no "Show:" drop-down list, then the plug-in's designer chose
not to create any groups, and all options are always visible.

The biggest strength of reusable option sets is that, once you have
configured them, you can use them over and over on all the assignments
in your course.  That means you may spend a bit more time setting up
the first assignment, but once you have done that, you can reuse those
decisions without revisiting them on future assignments.

Examples of assignment-specific options include instructor-provided
supplemental classes or files that you expect to use on many
assignments, compiler option switches, scoring choices, control of
static analysis tools, and so on.

Refer to your plug-in's parameter definitions for complete details
about the meaning of and default value for each assignment-specific
option:

* [Java Tdd Plugin / Parameter Descriptions](JavaTddPlugin/ParameterDescriptions.html)
* [Cpp Tdd Plugin / Parameter Descriptions](CppTddPlugin/ParameterDescriptions.html)
* Others are listed in the [Web-CAT Cookbook](Cookbook.html)

### Server-side File Space 

Many plug-in options are set by entering a numeric value, a text
string, or a selection from a list box.  For others, however, you must
provide one or more files that will be used by the plug-in at
run-time.  To support this need, Web-CAT provides **server-side file
storage space** for all instructors.

When you click the "Browse" button next to an option that take a file
or directory value, you will be presented with a window on your own
personal file space on the server.  You may upload files, create
directories, upload and unpack zip files, and more.  You can then
click the "Select" link next to the file or directory you wish to use
as the given parameter's value.

You'll use this same file space for setting parameters in all of your
assignments for all of your courses, so you can reuse the same file
over and over again as needed.  You can even edit text files in place
on the server if you need to make small changes.

## Discussion 

## See Also 

[Create An Assignment](CreateAnAssignment.html) <br/>
[Choose Your Plugin](ChooseYourPlugin.html) <br/>
[Installa New Plugin](InstallaNewPlugin.html) <br/>
[Writea Plugin](WriteaPlugin.html) <br/>
[Set Plugin Global Properties](SetPluginGlobalProperties.html)

## Comments 

This page is editable on github. To make corrections or improve these
pages, login to github and use the edit icon/link at the end of the
page title for this page.
