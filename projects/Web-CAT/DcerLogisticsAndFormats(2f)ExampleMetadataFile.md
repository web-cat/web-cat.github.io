---
title: Dcer Logistics And Formats ( 2f ) Example Metadata File
---
#format text

# ===================================================================
# D C E R Metadata Template
# ===================================================================
# This file is a plain Java properties file that holds the metadata
# for this experimental dataset.  All of the fields are commented so
# that it can serve as a template.

# -------------------------------------------------------------------
# Required Properties
# -------------------------------------------------------------------
# The properties in this section should always be provided for all
# assignments, all the time.
# -------------------------------------------------------------------

# A title for this dataset, provided by the contributor.  Like a paper
# title, it should be as descriptive as possible.  However, titles are
# not presumed to be unique.
# -----
dataset.title = Objectdraw Opinion Survey

# A comma-separated list of one or more languages in which this dataset's
# files are written.  Values should conform to RFC 4646 (see
# http://www.rfc-editor.org/rfc/rfc4646.txt).  If no value is
# given, then "en" is assumed.
#
# Individual files within the dataset should use one language only, but
# multiple translations within the dataset are fine.  Note that the
# first entry in this list is considered the "primary" language for
# this dataset, and it is expected that all supporting files will be
# available in that language.  Other languages in the list would
# then imply that translations for some or all of those files in the
# given language would also be provided as part of this dataset.
# -----
dataset.languages = en

# An optional comma-separated list of keywords or tags provided by
# the contributor.
# -----
dataset.keywords = objectdraw, JUnit, TDD, test-first coding, \

    test-driven development

# Basic contact information.  Can be repeated as many times as necessary
# with different numeric suffix to cover the number of authors/contributors
# involved.  Only one author is required, and only the e-mail is required.
# The other author fields are actually optional.
# -----
author1.name.first = Stephen H.
author1.name.last = Edwards
author1.email = edwards@cs.vt.edu
author1.url = http://people.cs.vt.edu/~edwards/
author1.phone = +1 540 231 5723
author1.institution = Virginia Tech
author1.department = Dept. of Computer Science

# An optional element that gives one of the following values, characterizing
# the general nature of the data available in this dataset:
#
# + transcript  : The dataset consists of interviews, transcribed video,
#                 "think aloud" protocols, or other scenarios where the
#                 primary data is transcribed text.
# + survey      : The dataset consists of answers to some kind of survey.
# + exercise    : The dataset consists of student performances on an
#                 assigned exercise, test, quiz, etc., other than a
#                 programming exercise.
# + programming : The dataset consists of student performances on a
#                 programming exercise or activity.
#
# For datasets that cover multiple categories, a comma-separated list
# can be used.
# -----
dataset.type = survey

# The copyright holder and date.  This can be automatically filled in
# when the dataset is submitted (default == current year and
# contributor).
# -----
copyright = (c) 2008 Virginia Tech Department of Computer Science

# The name of the license under which rights to use this dataset
# are granted.  If omitted, the assumption is "all rights reserved
# by the copyright holder".  When a new dataset is uploaded, we
# can suggest this creative commons license as the default.  We can
# also provide a drop-down list of the most common choices, including
# the creative commons choices and approved OSI open source licenses.
# -----
license = Creative Commons Attribution-Noncommercial 3.0 United States License

# The URL under which the full text of the license is available on-line.
# -----
license.url = http\://creativecommons.org/licenses/by-nc/3.0/us/

# -------------------------------------------------------------------
# Recommended Properties
# -------------------------------------------------------------------
# The properties in this section are expected for all assignments,
# but stingy or lazy contributors may still fail to provide them
# (we'll bug them, but we won't force them).
# -------------------------------------------------------------------

# A brief, one- or two-sentence description of what this dataset contains.
# This will be the short description other researchers will first see when
# searching. Keep your entry to 30 words or less.
# -----
synopsis = An opinion survey given to CS1 students after completing a \

    course that required unit testing of GUI assignments written using \
objectdraw.

# -------------------------------------------------------------------
# Subject Population
# -------------------------------------------------------------------
# Number of subjects involved in experiment.
# -----
subjects.count = 41

# Optionally, identifies the academic course(s) involved in the
# experiment.  Can be a comma-separated list.  Where possible, complete
# course numbers and titles should be provided, although contriutors can
# also use generic terms (like "CS1") or tags (like "introductory") or
# any other appropriate label they feel will be recognizable by others.
# -----
subjects.course = CS1, CS1705: Introduction to Object-oriented Development I

# An optional comma-separated list of keywords or tags intended to identify
# the knowledge content that is the focus or context of the experiment,
# where appropriate.
#
# If possible, CC2001 (or newer) knowledge units can be used in this
# spot, although contributors are also free to use more generic terms,
# including any other appropriate labels they feel will be recognizable
# by others.
# -----
subjects.content =

# -------------------------------------------------------------------
# Optional Properties
# -------------------------------------------------------------------
# Optional properties are not required.  We'll give contributors a
# chance to provide them, but won't nag.  We expect that many
# assignments won't provide some or all of these.
# -------------------------------------------------------------------

# -------------------------------------------------------------------
# Citations
# -------------------------------------------------------------------
# We want to be able to include citations for papers published using
# or referring to this dataset.  There are many different forms, however.
# My suggestion is to (a) prompt for a real URL, and then (b) take
# any human-readable form and represent it as a plain string.  After
# all, it is relatively unlikely that anyone is going to be automatically
# building bibliographies directly off such a repository's optional
# citation info, and as long as it is human-readable, users should be
# able to convert it to an appropriate format.  Especially if a real
# url is provided.  So anything from a plain text formatted reference to
# bibtex or anything else seems reasonable.

citation.1 = ...
citation.1.url = http://...
citation.2 = ...
citation.2.url = http://...

# -------------------------------------------------------------------
# Repository Properties
# -------------------------------------------------------------------
# Repository properties are provided automatically
# by a third party, typically when an assignment is uploaded to some
# service.  These properties are not intended for direct editing by
# end users or contributors, but are provided in downloaded assignments
# for informational purposes, and to aid in tracking the relationships
# between modified/adapted versions of assignments and their original
# ancestors.
# -------------------------------------------------------------------

# A globally unique identifier for this dataset, generated by the
# repository or service to which the assignment is uploaded.  The property
# also includes a rudimentary checksum-style hash code for error detection
# and tamper resistance.
# -----
repository.id = dcer.org:12345 de23

# A generated version number for this dataset.  We can just use
# integers.  Any of the registered authors can upload a mod, which
# is recorded as another version.
# -----
repository.version = 2

# A publicly accessible URL where people can view information about this
# dataset, typically provided by some repository/service to which this
# dataset has been uploaded.  Can this be the same as the repository id?
# Maybe it should be
# -----
repository.url = http\://dcer.org/dataset/12345

# A human-readable change history summary for this dataset.  If the
# repository/service hosting this dataset allows contributors to
# briefly describe changes when they upload modified/updated datasets,
# then a consolidated presentation of the change history associated with
# this particular version can be generated here for informational purposes.
# -----
repository.history = 

# -------------------------------------------------------------------
# Additional Properties
# -------------------------------------------------------------------
# I've only put in the basics so far.  If we go through Jan Erik's
# merging of our metadata suggestions, we can add more as we see
# fit.
#
# Contributors can add any properties they want as well.
