---
title: Use Web Cat Remotely
---
### Using Our Web-CAT Server Remotely 

If you [Try Out Web Cat](TryOutWebCat/) and things look ok, I am willing to host a small
number of "foreign" course setups on my Web-CAT server.  That way, you
could try out Web-CAT's style of auto-grading without having to worry
about installing or maintaining a local copy (which isn't so simple!).

Of course, there are some limitations in our current installation:

* There is no [Instructors Manual](InstructorsManual.html) describing how to set up assignments.
* There is no [Grading Manual](GradingManual.html) describing how to mark up/grade assignments.
* There is [Online Help](OnlineHelp.html) for students, but it needs some work.
* It supports a number of languages already:
  * Java (1.4.2_04, 1.5b is untested but may work)
  * Pascal ([Free Pascal](FreePascal.html))
  * Scheme (MIT Scheme and [Dr Scheme](DrScheme.html))
  * Prolog (SWI-Prolog)
  * Standard ML (very limited experience here)
* Supporting other language (C, g++, MSVC++, C#, etc.) requires you to [Add Languages](AddLanguages.html) and [Add Grading Scripts](AddGradingScripts.html).
* The time zone management code still needs work (i.e., making all due dates/etc. visible relative to the student's/instructor's local time zone).

However, for people who are willing to **live with these limitations**
for the time being
(and possibly contribute to their resolution), I'd be happy to
host remote auto-grading for your course.  I'd probably be able
to do this starting this summer, since there is too much going on
in the next 6 weeks or so to set things up for this semester.  The
server we are currently using is a 3.06GHz Pentium 4 with 1GB of
RAM and about 160GB of disk space, and it isn't anywhere near
capacity with the 10 course sections it is handling this semester,
so there should be room.

* <!> To sign up, send an e-mail message to <a href="mailto:webcat@vt.edu">webcat@vt.edu</a> requesting remote grading service on Web-CAT for your course.  Include:
  * Your institution name
  * The course name and number
  * A URL for the course's information (if available)
  * The programming language you want to use
  * Whether or not you expect to require students to test their own code

Read the [Instructors Manual](InstructorsManual.html) once you receive confirmation that your
account has been created.
