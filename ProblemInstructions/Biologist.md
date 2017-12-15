## Introduction

A biologist is growing different populations of bacteria in a common petri dish in order to see which species survive better in the competitive environment. Though she can estimate the size of the different bacteria populations when squinting through her microscope, she would much rather write a program to analyze a high-quality photograph of the petri dish to more accurately observe the growth of each species. Help the biologist write her program!

## Input
On the first line of input will be an integer T denoting the number of test cases to follow. For each test case there will then be a line containing two space-separated integers R and C. The next R lines will contain C characters each, comprising the petri dish photograph to be analyzed. Each character will be a capital letter representing a unit of pixels that can be recognized as a certain species of bacteria present in the dish.

```
1
6 8
COMPSCII
SSMPSSSI
SSMMSPPP
IOSMPCOP
CISPPIOQ
CIMPOSSS
```

## Output
For each test case photograph, your program should count up the number of “colonies” per species of bacteria as well as the number of pixel units (characters) for each bacteria species. A colony is a comprised of a group of adjacently connected pixel units of the same species (not including diagonal connection). For each species of bacteria observed in the photograph, print a line beginning with the character representation of the species followed by the number of detected colonies of that species and then the total number of pixel units recognized of that variety. These output lines should be sorted in order of the total number of pixel units recognized per species in descending order (the most prevalent species will be outputted first). Ties for this ordering will be broken alphabetically by the character representation of the species. Lastly, in your output, follow each test case with a blank line divider.

```
S 4 14
P 3 10
I 4 7
M 2 6
C 4 5
O 4 5
Q 1 1
```

Good luck!``

Good luck!