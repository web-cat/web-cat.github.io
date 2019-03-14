---
title: JavaTddPlugin Perl Fix
tags: [ Web-CAT, bugfix, JavaTddPlugin ]
---

Fixed a bug in the JavaTddPlugin that was causing errors on newer
Perl versions. The error was reported by James Cross at Auburn.

<!-- more -->

The error was in the perllib/Web-CAT/ErrorMapper.pm module, which contained
a search pattern than included a literal left brace ({). I had to add
general escaping to the search substrings applied in this module so that
such characters are properly escaped when searching. 
