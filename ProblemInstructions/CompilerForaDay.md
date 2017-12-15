## Introduction

Ever wish that you could put yourself in the compiler’s shoes and see what it’s like to decipher code? I know that you have. But the compiler’s job entails more complications than you might expect. The Java compiler overlooks white space and similar formatting when interpreting code, except of course when spaces separate key words and names and such. This comes into play for something as simple as declaring and initializing a variable. Write a program to validate whether or not a line of code which declares and initializes an integer variable fits Java syntax and is free of any compile-time errors.

The first line of input will contain an integer T denoting the number of test cases to follow. The next T lines will each contain a line of code to be interpreted.
For each line of code, print out `VALID` if the line is free of compile-time errors or print `INVALID` if that is not true and the line is syntactically incorrect for Java, assuming that the line of code is contained within the main method of a defined class and there are no other variables that have been declared. You need not worry about the integer literal being out of range (overflow).
A valid line will contain zero or more spaces, followed by the key word “int”, followed by one or more spaces, followed by the space-less variable name (which may contain letters or numbers), followed by zero or more spaces, followed by an equal sign, followed by zero or more spaces, followed by a literal integer number, followed by zero or more spaces, followed by a semicolon, followed by zero or more spaces after that.For example:
```
int jimbo = 15;
```

## Input
The first line of input will contain an integer T denoting the number of test cases to follow. The next T lines will each contain a line of code to be interpreted.

### Sample Input
```
10
int bob = 5;
INT bill = 10;
intcaroline = 3;
int   su5an=222  ;
int JO3Y= 20
  int q = -30;
int num = 4.33;
int num = “45”;
int blah = otherVar;
int nice one = 300;
```

## Output
For each line of code, print out `VALID` if the line is free of compile-time errors or print `INVALID` if that is not true and the line is syntactically incorrect for Java, assuming that the line of code is contained within the main method of a defined class and there are no other variables that have been declared. You need not worry about the integer literal being out of range (overflow).

A valid line will contain zero or more spaces, followed by the key word “int”, followed by one or more spaces, followed by the space-less variable name (which may contain letters or numbers), followed by zero or more spaces, followed by an equal sign, followed by zero or more spaces, followed by a literal integer number, followed by zero or more spaces, followed by a semicolon, followed by zero or more spaces after that. For example:
```
int jimbo = 15;
```

### Sample Output
```
VALID
INVALID
INVALID
VALID
INVALID
VALID
INVALID
INVALID
INVALID
INVALID
```