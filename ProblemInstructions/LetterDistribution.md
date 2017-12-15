## Introduction

The use of letters in the English language is not evenly distributed. For example, the letters E and T are used far more often than the letters X and J. Make a histogram of the frequencies of different letters in a given paragraph of text.

## Input
```
We the People of the United States, in Order to form a more perfect Union, establish Justice, insure domestic Tranquility, provide for the common defence, promote the general Welfare, and secure the Blessings of Liberty to ourselves and our Posterity, do ordain and establish this Constitution for the United States of America.
```

## Output

The program must count the number of occurrences of each letter of the input and sort the letters by popularity, from most popular to least. Upper case and lower case letters are considered the same for counting purposes. Spaces and punctuation are to be ignored. Two or more letters of equal popularity must be sorted alphabetically. the program must print a horizontal histogram of the sorted letter counts as shown below so that one "\*" is displayed for each occurrence of a letter.

```
E ***************************************
T *****************************
O *************************
I ********************
R ********************
S ********************
N *****************
A **************
D ***********
U **********
F *********
H *********
L *********
C ********
M *******
P ******
B ****
Y ***
G **
V **
W **
J *
Q *
K 
X 
Z 
```