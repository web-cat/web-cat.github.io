---
title: 'JavaTddPlugin: Default Configuration'
---
**Plug-in:** [JavaTddPlugin](index.html)

**Parameters:** [Parameter Descriptions](ParameterDescriptions.html)

This plug-in has a usable default configuration if you have not set
any parameters, so that it can be used for grading right away.  You
can add or tweak parameters incrementally from that point, if desired.

The key features of the default configuration are:

* Java 1.5 sources are compiled, with access to the built-in jar provided by the plugin, but with no other supplemental classes or data files.
* No reference tests are used, so students are graded solely on their own test cases.
* Students will receive a score even if some of their own tests fail to pass.
* Code coverage is measured by the number of methods executed.
* Full Checkstyle and PMD checks that enforce Virginia Tech's coding style are applied against the student code.

Full details of the default value for each available parameter are
available in the [Parameter Descriptions](ParameterDescriptions.html).
