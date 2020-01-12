---
title: 'SIGCSE 2007 Workshop: Set Up'
---
Web-CAT can be used with many different programming languages, and
virtually any development environment.  For simplicity, however, this
workshop is going to teach you how to use Web-CAT in the context of
**Java programming assignments**, since Java is the most commonly
used language in introductory computer science courses.  The basic
skills regarding setting up and configuring assignments in this
context are applicable to assignments that use **different
programming languages** as well.

For Java programmers (in academia as well as in industry), the
[JUnit testing framework](http://www.junit.org/) is the de
facto standard for writing simple, repeatable, automatically
executable test cases.  If you've never used JUnit before, we'll show
you the basics in Exercise 1 of this workshop.  If you want to use
Web-CAT for assignments in a different programming language, there
are similar [''X''Unit frameworks](http://www.xprogramming.com/software.htm)
for many other programming languages.  It is also
possible to use grading plug-ins that perform basic input/output
comparison for writing reference tests, if necessary.

## 1. Preparing Your IDE 

Most developers use some kind of interactive development environment
(IDE) for writing their code, and most instructors use an IDE when
teaching introductory courses.  Web-CAT **does not require a specific
IDE** for students or instructors.  In practice, you can use any
IDE you want (or even just the command line and a text editor).
Students then just zip up their project and submit via a web
browser.

However, for this workshop, we'll ask all the participants to
**use the same IDE for simplicity**.
We'll use **Eclipse** for our exercises.  Afterwards, you can try
out the workshop exercises using your own IDE if you like.

## 2. If You Do Not Already Have Eclipse Installed 

If you already use [Eclipse](http://www.eclipse.org/)
and have it installed on your machine, jump to Section 3.

If you don't have Eclipse installed, install it now.

### 2.1. If You Are Working on a Windows-based PC 

If you are working on a Windows-based PC **(not Vista!)** and do
not already have Eclipse installed, you
are welcome to use Virginia Tech's student Eclipse distribution, which
includes a preconfigured set of plug-ins for Java and C++ development,
plus a distribution of [cygwin](http://www.cygwin.com/)
that includes a recent version of g++.

First, make sure you have Java installed.  If not, download it from
Sun's [downloads page](http://java.sun.com/javase/downloads/index.jsp)--select
the latest JDK 6 version.

To install the VT student Eclipse distribution, use the
`vteclipse-320-20070109-setup.exe` self-installer included
in the root directory of this CD
(or [available for download](http://web-cat.cs.vt.edu/eclipse/install.php)).

Alternatively, you can install the latest official Eclipse release
by following the instructions in Section 2.2.

### 2.2. If You are Working on a Different OS 

If you are not working on a Windows-based PC, or if you prefer to
use the official Eclipse distribution provided by
[http://www.eclipse.org/](http://www.eclipse.org/),
that will work, too.

First, make sure you have Java installed.  If not, download it from
Sun's [downloads page](http://java.sun.com/javase/downloads/index.jsp)--select
the latest JDK 6 version.

Download the appropriate distribution of the Eclipse SDK from
[http://www.eclipse.org/downloads/](http://www.eclipse.org/downloads/).
Look for the link that says "Download now: Eclipse SDK 3.2.1" (or
newer), or "Other downloads for 3.2.1", depending on your OS.
Eclipse is typically distributed as a zip or tar archive, and all you
need to do to install it is unpack the archive some place convenient
on your machine.

After installing Eclipse, **also** complete the steps in the
Section 3.

## 3. If You Already Have Eclipse Installed 

If you are already an Eclipse user and have it installed on your
machine, then you're almost all set.  For this workshop, we will also
use a custom plug-in that supports electronic submission of projects,
the **Submitter** plug-in.  The Submitter plug-in can be used to
submit electronic versions of a project about anywhere (by e-mail,
ftp, the web, etc.), and it also works well for Web-CAT
submissions.

The Submitter plug-in can be downloaded from
[our Sourceforge site](http://sourceforge.net/project/showfiles.php?group_id=142064).

Locate your Eclipse installation folder and unzip the
`webcat-eclipse-submitter-1.1.0.zip` in it.  This will
add the submitter plug-in (and its support code) to the "plugins"
folder within your copy of Eclipse.  The submitter will be
available the next time you start up Eclipse.

----
[SIGCSE 2007 Workshop](index.html)
