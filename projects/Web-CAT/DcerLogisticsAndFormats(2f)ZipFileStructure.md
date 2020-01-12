---
title: Dcer Logistics And Formats ( 2f ) Zip File Structure
---
#format text

Much of the info we expect for people to provide can also be handled
by file naming/placement conventions.  Here is an outline of the
organization of the required/optional elements.

Also, note that all files with textual content are stored as
PDF or as plain text files (encoded using UTF-8).  Of course, there
may also be binary files in a dataset, including things like movies,
audio recordings, images, and so on; we may give format recommendations
for these, but will probably take whatever format contributors
provide.  Presumably, we should handle text document contributions in
Microsoft Word format (in addition to PDF or plain text) and
auto-print-to-PDF to convert them.  For text files, we should handle
contributions with Unix, Mac, or Windows-style line ending
conventions and then normalize them.  We should
probably also provide for text files included in downloads to be
translated to a given platform's line ending conventions (through
user preferences or browser request settings).

A dataset upload is a zip file that includes a "dataset.properties"
file at its root, like this one.  Other files written in the
primary language are also included in the root of the zip file
(or in subdirectories based on subject study codes, if needed).
All translated data files in secondary languages should be placed in
a subdirectory within the zip file named after the language in which
the file is written.  That means the top-level of a multi-lingual
upload might look like this:

/dataset.properties   -- the primary metadata file file
/*                    -- data files in primary language (i.e., first

    in order in dataset.languages list)

/de/*                 -- subdir for files written in German
/en/*                 -- subdir for files written in English
/fr/*                 -- subdir for files written in French
/se/*                 -- Swedish ...

At the root (and within each language dir, for translations), there are
several file names that, if present, contain specific information:

overview.txt

    This file should contain a plain text description (or a PDF
version in overview.pdf) of the purpose for which this data
was collected, including any research questions and
experimental hypotheses.  It could be anywhere from a brief
paragraph, to a long section extracted from a relevant
research paper, depending on what the contributor wants to
provide, however shorter is probably better.

subjects.txt

    This file should describe the subject population involved
in the experiment, including its size, how subjects were
selected, what the background of the subjects was, etc.
This could be in subjects.pdf instead.

method.txt

    This file should describe the experimental design and protocol
used in collecting the data.  It may refer to supplementary
files by name, such as a text copy of a survey questionnaire,
or a text copy of a structured interview protocol, etc.  We
can come up with recommended names for the common cases that we
can think of.  This could be in method.pdf instead.

data.csv

    This is the main tabular/numeric data file for the dataset, if
there is one.  Columns, formats, etc., are completely user-defined,
with the exception that it should be in UTF-8, and we recommend
date/time columns use an iso-std format.  The first row should
contain the column names.  Some examples:
    --  For a survey, there might be one row per subject, with one
        column per question containing that subject's response.
    --  For an interview, there might be one row per subject, with
        the coded demographic data for that subject in the columns
(age, gender, race, date of interview, etc., etc.).
    --  For datasets with multiple CSV files, they can be placed
        in data01.csv, data02.csv, etc.
    --  In all cases, appropriate subject codes could be used.
        For example, we could use "s01", "s02", "s03", ...
    --  Generally, this file (or the other data*.csv files) can contain
        one or more columns that refer to additional data files in
the dataset, such as the file holding this subject's interview
transcript, or the subdirectory holding this subject's programming
code, or the file holding the video recording of this subject's
attempt at a task, etc.
        Where possible, such additional data files related to a single
subject should be given names that include the subject code as
the file's/directory's base name or prefix (e.g., "s01.txt",
"s14.mov", "s15-1.dat", or "s75/" as a subdirectory).

datatoc.csv

    This is the "table of contents" for the data*.csv files that
defines what the columns are.  It is a fixed-format file containing
one row describing each column in the data*.csv files.  The
columns in this fixed-format file are:
    Col             Content
--------------  --------
File            The name of the data file containing the column
        described in this row (e.g., "data.csv" or "data02.csv").
    Col Name        The name of the data column in the given file (e.g.,
        "id", "Subject", "score", "q12", etc.).  We suggest
using reasonably compact names for ease of manipulation
(see Extended Label below).
    Type            Excel-compatible description of the type of data in
        the given column (e.g., number, text, date, time, etc.).
    Meaning         The meaning of the data in the given column.
Extended Label  An optional field that provides a longer descriptive,
        human-readable version of a column's name.  For example,
if the column contains survey responses, this might
include the full text of the corresponding survey
question. Alternatively, if the column name is "ncsloc",
this column might say "Non-commented Source Lines of
Code".
    Scale           An optional field that characterizes the measurement
        scale used for values entered in this column.

s01.txt
s02.txt
s*.txt

    These are subject-specific data files with contents that depend on
the experiment.  For example, each of these can be the transcript of
an interview with the corresponding subject.  If there are multiple
files, they can be named s01-1.txt, s01-2.txt, etc., or placed in
a subdirectory s01/.
    Note that I've been using two-digit subject study codes here, but
we can't restrict to that, and we also don't want to limit, so it
is reasonable to allow study codes to be used without zero-padding.
Further, we could probably work it so that contributors can use any
unique identifiers as study codes, although we could recommend something
simple like "s" + number.
