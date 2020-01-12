---
title: Dcer Logistics And Formats ( 2f ) Metadata Summary
---
## Summary of meta data suggestions 

### General 

* Institution, including country. Description of institution research university, undergraduate only, etc., along with description of the student body - size, academic preparedness, etc.

    NOTE: since education system differs between countries and it can be cumbersome to describe this for each study I suggest that the repository will contain standard description for educational system and that the submissions can refer to these descriptions and note specific differences.

* Contact info for all investigators
* Experimental hypotheses/research questions
* Citations of papers using the data.  Preferable with proper bibtex citations and urls.
* The data should be tagged
* Links to others who have used this information. In other words it should be possible for people who uses a data set to add papers they have published on the data.

### Participants 

* Number of subjects
* Educational level. This should include information like "in the middle of first programming course", "after first algorithm course", "last term of their studies"
* Number of courses involved <====== I don't really understand what this refers to
* Number of academic periods involved <====== I don't really understand what this refers to
* Technique used to solicit experimental volunteers.
* Were subjects paid? If so, how much?
* Any relevant data about the subjects, including:
  * age
  * gender
  * amount of programming experience
  * year in school
  * GPA or similar if applicable. 
  * Note: I think the repository should include a standard description of what GPA or similar measurement is, see note above.

### Experimental setup 

* Experimental design
* Overview
  * Type of study (e.g., interview, observation, randomized, etc.)
  * Description of method used for data collecting with motivation for the choice. If a common method is used a reference to a description is enough, any changes to standard method should be described. Description should include:
    * Types of activities the students Performed
      * Or Challenge.
      * Software and tools used
    * Level of the activity
    * How were the students monitored.(all this information should be available).
      * Video
      * Audio
      * Experimenter reviews (etc).
      * CDI's
      * Logging tools.
  * Description of experimental environment
    * in a classroom? If so, what type of class?
    * in a computing lab?
    * ??
  * All experimental information should be included.
  * Full text of any script/questionnaires/task description etc. If possible, also motivations behind specific questions.
  * Description of control and treatment groups (if applicable)
    * What was the treatment?
    * How were subjects assigned to groups?
    * What were the experimental hypotheses?
* Special considerations
  * In what language(s) is the data available
  * What was the original language (the language the data was collected in)? How was the translation done (if one exists)?
  * What are the native languages of experimenter
  * For interviews:
    * Any relevant information about the interview settings.  Relevant interruptions, technical problem, how data was gathered (for example "interview recorded and then transcribed verbatim", "notes takes during interview", "participants answers written down by interviewer", etc).
    * Any unusual events that happened during the interview, any relevant notes made by the interviewer.
    * How long time the interview took, weekday and time of day
    * Interviewers comments about interviewee
    * If data contains annotations made by the participant, Was the annotations made spontaneously or were they a part of the study?

### Data format/description 

* Data should be in a uniform structure and follow the guidelines given for the repository.
* All numeric/ordinal/categorical data should a have a meta-description of field names and their meanings
  * For Likert data:
    * question/statement text
    * number of choices
    * labels
  * For ordinal data:
    * question/statement text
    * scale/range of valid responses
  * For ratio or interval scale data
    * description of item being measured
    * measurement scale (e.g., minutes, seconds, number of occurrences, percent)

### Things suggested but that I didn't include 

* Techniques used for data analysis (e.g., content analysis, phenomenography, statistical, ...)

    Reason for not including: Since the repository is supposed to contain raw data no analysis should have been done. And papers published based on the data should contain this description.
