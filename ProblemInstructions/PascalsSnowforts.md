## Introduction

In Antarctica, there are plans to create a new triangular snow fort with various items in it. In order to achieve this, the lead architect suggested using Pascal's Triangle in order to create the fort and decide what goes in it. 

Here is how Pascal's Triangle Works:

1 - Start out the triangle of numbers like this:
```
 1 
1 1
```

2 - Every row has one more number then the last. For each number, take the two numbers above it and add them together and make that the value.
```
   1
  1 1
 1 2 1   // 2 comes from the two numbers above it added together
1 3 3 1  // 3 comes from the two numbers above it added together
```

Write a program for the architect that generates blueprints of the fort given a certain size.

## Input
The input starts with one line containing \\(I\\), the number of test cases. Each test case contains one line with a number that gives \\(n\\), the size of the fort (\\(1 ≤ n ≤ 40\\)).

```
1
4
```

## Output
The blueprint of the fort up to \\(n\\) with the correct spacing.

```
   1
  1 1
 1 2 1
1 3 3 1
``` 1
1 3 3 1
```