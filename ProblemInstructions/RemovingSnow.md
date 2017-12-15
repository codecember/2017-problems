## Introduction

Congratulations! You own the Snow Remover 9000!

It can remove any size rectangle of snow in one fell swoop. Unfortunately, it can only be used once, so we'll have to maximize the efficiency of our snow removal. Given the sizes of the rows of plots on our land, find the size of the largest rectangle we can remove with the snow removal machine.

Input consists of a number \\(N\\) indicating the number of plots. Each plot starts with a number \\(M\\) indicating how many rows are in that plot, followed by \\(M\\) rows of numbers which correspond to the number of spaces on that row. As an example, the plot:

```
3
5
3
```

means a plot that looks like this:

```
***
*****
***
```

Find the largest rectangle of snow on the plot that you can clear with one run of your machine. For the sample plot above, that's 9.

## Input
Input starts with \\(N\\) representing the amount of test cases. Each test case starts with one line containing \\(M\\) (where \\(0 \\leq M \\leq 1000\\)) and \\(M\\) lines afterwards.

*NOTE: There will be no empty lines in the actual test cases. The ones below are used for the sake of brevity.*

```
2

3
3
5
3

3
1
2
3
```

## Output
Each line of output contains the largest area of the rectangle for each test case.

```
9
4
```