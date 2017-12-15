## Introduction

Normal camel case looks like this:
```
thisIsCamelCase
```
For every word in a sentence all spaces are removed and each word after the first starts with a capital letter.

But high arctic camels are different:
```
THISiShIGHaRCTICcAMELcASE
```
It is similar to normal camel case except that now the first letter is the only letter that is lowercased.

Given a string where words are separated by spaces, convert it to high arctic camel case.

## Input
\\(N\\) lines containing one string needed to be converted to high arctic camel case. Input ends with one line containing `END`, do not process this line

```
Hello World
gOoD sAmPlE iNpUt rIgHt
END
```

## Output
The high arctic camel case version of the given input strings.

```
HELLOwORLD
GOODsAMPLEiNPUTrIGHT
```