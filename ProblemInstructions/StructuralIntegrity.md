## Introduction

Billy and his friends are building snow forts. Billy, though, always having to come out on top, builds his out of ice. Since ice is a lot heavier than snow and harder to use, Billy enlists his engineering skills to determine the weak points in his fort. And because he is as creative as he is interesting, his fort is in the shape of a cube. To "help" Billy (aka do his work for him), we'll divide his fort into 1x1x1 blocks of ice, each with coordinates of (x, y, z). Each block is also given a number to describe its strength, but since Billy isn't the greatest builder, all of these values are initially 0. Billy will also ask us to do a few things while building. When Billy wants us to change the strength of a certain ice block, he will ask the following:
```
UPDATE x y z W
```
which means that we should change the strength of the block at (x, y, z) to W.

He will also want to know about the overall integrity of his fort, for which he will ask:
```
QUERY x1 y1 z1 x2 y2 z2
```
which means that we should tell him the sum of the strengths of blocks whose x coordinate is between x1 and x2 (inclusive), y coordinate between y1 and y2 (inclusive) and z coordinate between z1 and z2 (inclusive). 

### Input Format

The first line contains an integer T, the number of test-cases.
For each test case, the first line will contain two integers N and M separated by a single space.

N defines the N * N * N matrix.
M defines the number of operations

The next M lines will contain either
```
 1. UPDATE x y z W
 2. QUERY x1 y1 z1 x2 y2 z2 
```

##  Sample Input

**Constraints**
* \\(1 ≤ T ≤ 50\\)
* \\(1 ≤ N ≤ 100\\)
* \\(1 ≤ M ≤ 1000\\)
* \\(1 ≤ x1 ≤ x2 ≤ N\\)
* \\(1 ≤ y1 ≤ y2 ≤ N\\)
* \\(1 ≤ z1 ≤ z2 ≤ N\\)
* \\(1 ≤ x,y,z ≤ N\\)
* \\(-10^9 ≤ W ≤ 10^9\\)

```
2
4 5
UPDATE 2 2 2 4
QUERY 1 1 1 3 3 3
UPDATE 1 1 1 23
QUERY 2 2 2 4 4 4
QUERY 1 1 1 3 3 3
2 4
UPDATE 2 2 2 1
QUERY 1 1 1 1 1 1
QUERY 1 1 1 2 2 2
QUERY 2 2 2 2 2 2
```

## Sample Output

```
4
4
27
0
1
1
```