## Introduction

Billy and his friends are making snow forts on a coordinate grid. Each of his friends built their fort on a random point on the grid, and Billy, being the narcissist he is, built his at (0, 0). As a master strategist, Billy wants to know which of his friend's forts he should attack first. Billy has a limited number of snowballs, though, so he can't attack *every* fort. With the snowballs he has, he can only attack \\(K\\) forts. If Billy has \\(N\\) friends, find the \\(K\\) closest forts for Billy to attack.

## Input
Input consists of \\(I\\) test cases, where each test case will have one line with two numbers  \\(N\\) and \\(K\\), followed by \\(N\\) lines of Billy's friends and their location on the grid. 

```
4 4
Tom -4 48
Joe -19 8
Karl 0 -18
Marx 37 -44
5 3
Beth 15 15
Melvin 29 49
Timothy -18 30
William 45 35
Reginald 39 -10
```

## Output
For each set, output the order in which Billy should target his friends, from the closest fort to the farthest fort.

```
Karl
Joe
Tom
Marx
Beth
Timothy
Reginald
```