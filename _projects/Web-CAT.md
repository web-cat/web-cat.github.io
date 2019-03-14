---
title: What is Web-CAT?
---

Web-CAT is a **flexible, tailorable automated grading system** designed to
process computer programming assignments.

Web-CAT runs on a server and provides all of its capabilities via a web
interface.  All submission activity, feedback, viewing of results, and
grading activities take place via your web browser.  All instructor
administration of classes, assignments, and grading is also performed using
a web browser.  Even all administration tasks are carried out this way.

While much prior work on automated grading exists (see
our [Reading List](ReadingList.html)
and [Our Publications](OurPublications.html)),
other systems typically focus on assessing whether or not student code
produces the correct output.  Web-CAT was originally designed as a
general-purpose automated grading system, but before the initial
implementation was completed, its designers decided they wanted to support
student software testing activities, rather than simply judging student work
by comparing output results.  As a result, Web-CAT is typically used in a
way that focuses on assessing the student's performance at testing his or
her own code, and on generating concrete, directed feedback to help the
student learn and improve.  Such a tool allows educators to give assignments
that require test suites to be submitted along with code.  Ideally, students
should be able to "try out" their code-in-progress together with their tests
early and often, getting timely feedback at every step.

At the same time, however, Web-CAT has been engineered to support arbitrary
instructor-provided plug-ins for processing and assessing student work, so
virtually any grading scheme or strategy you can devise can be implemented
without modifying the underlying system itself.  Administrators can upload
new plug-ins over the web and publish them for instructors to use.
Instructors can even write their own plug-ins off-line and then upload them
via Web-CAT's web interface.  Such plug-ins require no code changes to the
server, and are immediately available for use without an application restart.

For a quick demo of how students use Web-CAT, watch
the [Submission Walkthrough](SubmissionWalkthrough.html) movie (24Mb, 5min). 

## Web-CAT's Primary Strengths 

Despite the long history of work in automated grading and the use of so
many "home grown" systems at various sites, there are virtually no mainstream
systems in widespread use.  We are currently evolving Web-CAT to fill this
role, because we believe it is the best candidate currently available for
adoption by other institutions.  This belief is founded on four core strengths
derived from Web-CAT's internal architecture:  security, portability,
extensibility, and support for manual grading practices.

### Security 

First and foremost, Web-CAT has been designed to support secure operation.
Its user model includes a plug-in-based authentication approach with an open
API, so that an administrator can choose one of several built-in
authentication strategies or even provide a custom-written,
institution-specific authentication adapter that makes use of existing
campus-wide authentication services at a given institution.  Services within
Web-CAT are guarded by a combination of both user-specific permission levels
(e.g., the ability to create course sections) and a role-based access control
system (e.g., only users listed as an instructor or TA for a given course
section can grade submissions for that section).  Detection of erroneous
student programs and protection from malicious code are provided.  Data
integrity is maintained through system security policies and the services
provided by a relational database.

### Portability 

Web-CAT is a web application written in Java, giving the code a high degree
of portability.  Web-CAT can be packaged and distributed as a Java servlet
application that will run under any compliant servlet container, such as
Apache Tomcat.  When packaged as a servlet, Web-CAT can be distributed as
a single WAR file (a servlet Web Archive) that includes all necessary
dependencies.  Students, instructors, and even administrators can access
all features provided by Web-CAT using only a web browser; no other software
is required.

### Extensibility 

Perhaps Web-CAT's biggest strength is the inherent flexibility and
extensibility built-in to its architecture.  Web-CAT was designed using a
completely plug-in-based architecture.  Major feature innovations can be
added without changing any code in the existing system, and all of Web-CAT's
existing capabilities are implemented in a few plug-ins.  Further, as
discussed in Section 2.1, the mechanism used to process each student
submission is also completely plug-in-based, using an open API.  An
instructor can string together an arbitrary sequence of conforming plug-ins
to handle processing for any assignment, and then reuse that configuration
over and over again as desired.  Thus, the Web-CAT server itself, which
manages courses, enrollments, due dates, security, and reception and
archiving of submissions, knows nothing about how any particular submission
is going to be processed--this information is completely under the
instructor's control.  This provides an immense amount of flexibility, since
all aspects of compilation, execution, interpretation, scoring, and feedback
generation are completely factored out of the core application, and are
instead the responsibility of configurable plug-ins that can be replaced,
chained together, or extended dynamically by instructors themselves.

The result is that Web-CAT itself is completely language-neutral--it has been
used to handle submissions in Java, C++, Scheme, Prolog, Standard ML, and
Pascal, and can easily be applied to others.  In addition, Web-CAT itself is
also completely neutral with respect to how assignments are scored and what
feedback is generated for return to students.  Of course, we have an
extensive set of plug-ins for assessing assignments based on student-written
tests, and for presenting unified, HTML-based, syntax-highlighted feedback
reports indicating how students can improve.  However, Web-CAT's architecture
also allows one to construct plug-ins that support traditional "output
comparison-based" assessment, or that support completely new assessment
models that have not yet been devised.  We believe that this form of
extensibility is critical for any grading system intended for wider
distribution.

### Manual Grading 

Finally, while Web-CAT handles all of the automated tasks an instructor
wishes for processing student submissions, it also has built-in support for
the manual grading tasks that typically follow automated grading.
Course staff members can use a web browser to login and view student
submissions.  They can also enter comments, suggestions, point deductions,
or extra credit directly into an HTML view of the student's source code in a
WYSIWYG manner, keep track of their progress through multi-file submissions,
and track their progress through all students on a given assignment.
Students are notified automatically by e-mail when manual grading on a
submission has been completed, and can read their results on the web at
any time.

While several of these strengths are not unique to Web-CAT, Web-CAT is the
only automated grader published in the CS education literature that combines
all of these strengths in one system. 

### Why Strive for A Common Automated Grading Platform? 

The benefits of automating at least some portion of the assignment submission,
assessment, and return workflow offers clear and compelling benefits to many
educators, inspiring them to build their own versions of such systems.
Unfortunately, there are so many core issues involved in automated
grading--security, protection from malicious code, data integrity, scalability,
portability, and assignment analysis methods, just to name a few--that it is
difficult for a single developer at one institution to develop a system with
robust solutions for all of them.

However, failure to address these problems results in a solution that is
not robust enough for use in a wide variety of contexts.  The result is
a proliferation of systems that work locally, but that are not very
suitable for adoption by many others.  This, in turn, results in a great
deal of overlapping work without much overall progress in the state of
the practice.

We believe that building on top of a common platform is the best way for
independent developers to make progress without reinventing the wheel,
by reusing a common, well-tested solution that already addresses the
principal issues involved.  A single system may not fill this role
completely, of course--maybe there will be several to choose from. 
However, only by working together on a common base can educators build
on the work of each other without reinventing the wheel.

We've documented some of
the [Obstacles Toa Common Auto Grader](ObstaclesToaCommonAutoGrader.html)
that have been raised by various people, although at this point they all
seem addressable in Web-CAT.

## An Overview of Web-CAT's Support for Testing 

Web-CAT's plug-in architecture provides a great deal of flexibility. 
The most commonly used grading plug-ins currently available are for
processing Java or C++ assignments where students write their own
software tests.  In order to provide appropriate assessment of testing
performance and appropriate incentive to improve, these plug-ins use a
scoring strategy that does more than just give some sort of
"correctness" score for the student's code.  In addition, Web-CAT
assesses the validity and the completeness of the student's tests.  It
grades assignments by coming up with three scores:

1. A **code correctness** score measures how "correct" the student's
   code is.  To empower students in their own testing capabilities, this
   score is based solely on how many of the student's own tests the
   submitted code can pass.
1. A **test completeness** score measures how thoroughly the student's
   tests cover the problem.  For both the Java and C++ plug-ins, student
   code is instrumented to collect coverage data, measuring which parts of
   the code are actually executed by the student's tests.  Instructors can
   choose whether method-level, statement-level, or
   condition/decision-level coverage is used for scoring.  Plug-ins for
   other languages where code instrumentation tools are not available may
   use other techniques.
1. A **test validity** score measures how many of the student's tests
   are accurate--consistent with the problem assignment.  The Java and C++
   plug-ins use an independent (hidden) set of instructor-written reference
   tests for this measure.  Other approaches are possible.

These three measures, taken as percentages, are then multiplied together
to come up with a composite score.  This formula ensures that no aspect
of the approach can be ignored, or the student's score will suffer.

In addition to its unique approach to scoring, The Java plug-in also
incorporates a number of open-source and commercial tools to check
commenting conventions, adherence to coding style guidelines, and use of
potentially bug-inducing coding practices.  Further, during execution of
student-provided tests, it tracks which portions of the student's
solution are actually executed so that it can provide feedback on how to
improve the thoroughness of testing.  All of these results are presented
to the user in one integrated, web-viewable feedback report.

Initial evaluation results indicate that students produce higher quality
code using this approach, with a 28% reduction in the number of bugs per
thousand lines of student-written code, on average (see
[Our Publications](OurPublications.html)).  In addition to this feedback, it
is clear that students can see real value to using the approach.  This
value comes in the form of increased confidence in solution correctness,
increased confidence when making changes or modifications to code, and
the assurance of always having a "running version" ready to go as the
solution is being developed incrementally. Students have confirmed their
perceptions of these benefits in surveys, where students have expressed
a strong preference for Web-CAT over their past experiences with more
traditional automated grading systems.

Web-CAT is a web application built on top of Apple's
[Web Objects](WebObjects.html) framework.  Its Grader subsystem is designed
in a language-neutral way, and presumes little about the actual process
required for grading an assignment.  It divides the grading process into
a series of steps, with the number and nature of steps being fully
tailorable by the instructor.  The action(s) undertaken in each of the
steps can be controlled through scripts or programs uploaded by the
instructor.  This approach allows Web-CAT to support everything from
dumb file archiving with no automated assessment, to traditional
output-based assessment of compiled or interpreted code, to any other
approach desired. 

## Usage Statistics 

As of March, 2019, the Web-CAT server at Virginia Tech had been used in
1,306 course sections across 39 universities, on assignments covering 8
programming languages, and has processed 3,520,581 submissions from 39,844
students. This does not include submissions processed at other institutions
running their own servers (approximately 90).
