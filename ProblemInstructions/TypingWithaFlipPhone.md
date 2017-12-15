## Introduction

Nix has a flip phone and he uses that to text. If you don't know, a flip phone consolidates all of the alphabet in 9 digits requiring you to press a pattern of digits to get one character. For example the number 2 has the letters ABC above it and if you want to type a C, you have to press the 2 button 3 times to cycle A->B->C->2, and like the number 7 also has the letters PQRS above it and if you want to type an S, you have to press the 7 button 4 times to cycle between P->Q->R->S->7

Unfortunately, Nix's flip phone is messed up: the letters mapping to each of the buttons are weird. 0 still maps to space, but all the other numbers are different.


## Input
Take an input consisting of 9 lines of keymappings and then one line containing a string Nix needs to type. The string that Nix needs to be typed will not contain any characters not in the 9 lines of keymappings, other than space, which is always mapped to 0, or numerals, which come after the letters in every cycle. Input terminates with a `#`.

```
ABC
DEF
GHI
JKL
MNO
PQRS
TUV
WXYZ
.,?!
HELLO WORLD!
QWE
RTY
UIOP
ASD
FGH
JKL
ZXC
VBN
M,.
L33T SP34K
#
```

## Output
Determine how many button presses are required to type Nix's input string. 

```
29
33
```