## Introduction

Sandra and Mortimer are computer science students, and they think that math is cool. So cool, in fact, that like many people you hear about in contest problems, they love to play math games. In their favorite game called “First to One”, the two friends first pick a number N, and then compete to see who can change N into 1 within the least number of moves. A “move” can consist of one of three options:

1. Subtracting 1 from N
2. If N is divisible by 2 (no remainder), dividing N by 2
3. If N is divisible by 3 (no remainder), dividing N by 3

Now write a program which will output the minimum number of moves required to go from N to one. Then you’ll be able to join in the merriment and destroy Mortimer and Sandra at their own game!

## Input
On the first line of input will be an integer T denoting the number of test cases to follow. Next will be T lines, each containing a single integer N (0 < N < 1,000,000).

```
4
2
17
52
14236
```

## Output
For each test case, print a line containing the least number of moves it takes to go from N to 1 using the above options.

```
1
5
6
15
````
1
5
6
15
```