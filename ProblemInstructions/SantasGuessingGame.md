## Overview
So you ended up on Santa's naughty list. Well luckily for you Santa has a way to get back on the nice list. All you have to do is guess what number he is thinking of from 0 to \\(n\\). To make it more fair, you can guess a number, and he will tell you if it's higher or lower than the number he is thinking of. But you only have \\(\\log_2 n\\) guesses before you're out of luck.

Can you outsmart Santa?

Write a program that can guess a number from 0 to \\(n\\) in \\(\\log_2 n\\) attempts. 

## Input and Output
The format for this problem is different than the others. Your program will be talking to another program (representing Santa). You can ask Santa if the number he is thinking of is something, and he will respond with either `LOWER` if his number is lower than yours, `HIGHER` is his number is higher than yours, and `CORRECT` if you guessed the number right.

Here is how it will work: 
Santa will tell you \\(n\\) where \\(0 ≤ n ≤ 100,000,000\\).
```
10
```

Then you can make your guess of what number he is thinking of
```
3
```

Then Santa will respond with either `HIGHER`, `LOWER`, or `CORRECT`
```
HIGHER
```

Then you can make another guess
```
7
```

...and so on and so forth

If you can guess Santa's number in the correct amount of attempts, you can get back on the nice list (and solve this problem).

**NOTE:** Do not use `kb.hasNext()` in your input loop, instead use `kb.hasNextLine()`

## Sample Input
```
10
HIGHER
LOWER
CORRECT
```

## Sample Output
```
3
7
5
```