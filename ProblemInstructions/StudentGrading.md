## Introduction

It is the almost the end of the first semester and your teacher has to make a student report. Can you write a computer program to help your teacher out?

Write a program that outputs each students, average score, the score in the first test, and the score in the last test for each subject.

## Input
A list of unsorted student records (student name, subject, test number, score). The last line contains the string `END`, do not process this line.

```
ADAM ENG 1 71
ADAM ENG 3 84
ADAM MAT 2 99
BETH SCI 1 79
ADAM ENG 2 90
BETH SCI 2 97
ADAM MAT 1 91
END
```

## Output
For each student print: The student name, subject, average score (round to nearest integer), first score and final score.
The output should be sorted by the student name and subject.

```
ADAM ENG 82 71 84
ADAM MAT 95 91 99
BETH SCI 88 79 97
```