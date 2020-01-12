---
title: Assignments And Assignment Offerings
---
First, make sure you understand the differences between [Courses And Course Offerings](CoursesAndCourseOfferings.html).

In Web-CAT's data model, there is a similar distinction between an assignment and an assignment offering.

## Assignment 

Throughout the Web-CAT user interface (and documentation), the term **assignment** is used to refer to the name and basic properties of a programming assignment--the kinds of things you would associate with an assignment writeup or a program specification.

For example, "Program 1: Hello World", might be an assignment used in a CS 101 course.

In Web-CAT, an assignment can be reused across course sections (that is, among many course offerings).  The concept of "assignment" is associated with the reusable, shared properties that all offerings of an assignment have in common.  Besides the assignment's name and a URL for the corresponding writeup or activity description, an assignment also has a submission policy (including whether or not late submissions are allowed, with or without associated penalties), and a grading scheme, which defines how submissions from students will be processed and scored.

## Assignment Offering 

While you can think of an **assignment** as being analogous to a programming assignment writeup, an **assignment offering** corresponds to a specific offering of this assignment within a specific [course offering](CoursesAndCourseOfferings.html).
An assignment offering has a **due date** (an assignment by itself does not).  Some administrative controls, like visibility to students, are also controlled per assignment offering.

Instructors who are dealing with single course offerings (i.e., one section of a course) usually don't pay much attention to the difference between an assignment and an assignment offering, since every assignment they create has just one offering, just one due date, etc.

However, if you begin working with courses that involve multiple sections (multiple course offerings of the same course during a given term/semester), then assignment offerings become more useful.  They allow you to define one activity for all course sections--the **assignment**--but still give separate due dates for closed lab sections, for example.
