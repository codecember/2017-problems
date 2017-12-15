## Introduction

Sarah likes to play a game where given a number,  she tries to find the last number before it where the digits in the number are in ascending order. Numbers like 8, 123, 555, and 224488 are examples of numbers with ascending order digits. Numbers that do not have this property, like 20, 321, 495 and 999990, do not contain ascending order digits.

Write a program that finds the largest number with ascending order digits \\(\\leq N\\).

## Input
The first line of the input gives the number of test cases, \\(T\\). \\(T\\) lines follow. Each line describes a test case with a single integer \\(N\\) where \\(0 \\leq N \\leq 10^{18}\\).

```
4
132
1000
7
111111111111111110
```

## Output
For each test case, output one line containing the largest number with ascending order digits.

```
129
999
7
99999999999999999
```
