## Introduction

Imagine a world without barcodes. Checkout lines at grocery stores would take years to get through, and inventory checking would be a nightmare. Well, let us not dwell too long on those dark thoughts. Rather, write a program that “scans” a barcode and looks up the item the barcode is attached to.



## Input
The first line of input will contain an integer Z, the number of items catalogued as products in your store. The next Z lines will each contain a 10 digit barcode where each digit is either a “1” or a “0” (1 representing black ink), followed by a space and then the name of that item. After that, there will be an integer T denoting the number of barcodes to be scanned.  The next T lines will each contain a 10 digit barcode.

```
5
1001110101 White Toaster
0010110010 Green Beans
1011101000 USB
0001110101 Detergent
1101110110 Nuclear Reactor
5
1011101000
0010110010
1101110110
0010110010
1110000000
```

## Output
For each barcode you scan, print out the name of that item. If the barcode is not listed in your catalogue, print “UNRECOGNIZED”

```
USB
Green Beans
Nuclear Reactor
Green Beans
UNRECOGNIZED
```RECOGNIZED
```