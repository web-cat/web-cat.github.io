---
title: Assignment Interchange Format
---
#acl [Iticse Working Group](IticseWorkingGroup.html):read,write,revert All:

This page contains information related to the 2008 [I Ti CSE](ITiCSE.html) Working Group **[WG6: Developing a Common Format for Sharing Assignments](http://www.iticse08.fi.upm.es/WG6.htm)**.

At the moment, it contains the strawman for our proposed format.

### Tutorial 

We have written a "how-to"-style tutorial on preparing an assignment for uploading to a hypothetical assignment
repository.  This tutorial is designed to make the instructions easy to follow and to minimize any intimidating
complexity in the assignment metadata structure.  You can browse the tutorial here:

* [Assignment packaging tutorial](http://web-cat.org/assignment-packaging/tutorial/)

### Zip File Structure 

The entire assignment itself is packaged as a single zip file with its own internal subdirectory structure.
At a minimum, such a file contains an assignment writeup and a simple metadata file with information
about the assignment.  More complex assignments may contain many additional supporting files, as
needed.

* [Zip file structure](http://web-cat.org/assignment-packaging/zip-structure.html)

### Metadata File Structure 

The core information about an assignment--its metadata--is stored in a single file.  This file is a plain-text file
in UTF-8.  Note that US-ASCII (7-bit) is a subset of UTF-8.  The file is a Java properties file.

* [Metadata file structure](http://web-cat.org/assignment-packaging/metadata.html)
