## Introduction

Many modern computers have Location Awareness features. Phones, tracking systems, and self-driving vehicles have the ability to determine their current location. Often this is accomplished using a trilateration algorithm. If the device can receive signals from three sources whose locations are known, then it can determine its location from that data.

For this problem, you will write a trilateration algorithm (explained below) for an autonomous robot using signals from three towers positioned around a square arena. The arena is an integer grid with walls at the four lines defined by \\(x=100\\), \\(y=100\\), \\(x=-100\\), and \\(y=-100\\). The robot may be positioned anywhere within the arena. Tower 1 is located at \\((x,y)\\) position \\((0,100)\\), tower 2 at \\((-100,-100)\\), and tower 3 at \\(100,-100\\).

Here's how the system works: the tower broadcasts distinct signals that the robot can receive. The towers are all powered by one common battery. When the robot is near a tower, its signal strength is high, but the farther the robot is from the tower, the weaker the signal. The strength of a tower's signal is given by the following equation:

$$s=P/d^2$$

The variable \\(P\\) is the transmission power and \\(d\\) is the distance from the tower to the robot. When the battery is fully charged the signal is very strong. But over time, as the battery's energy is used, the signal power is reduced. So \\(P\\) is the same for each tower, but it changes over time. Also, the robot has no direct way to measure \\(P\\). So it is not possible to make an exact calculation for the distance to a tower using the signal strength. You'll have to think of how to use all three signals to solve this problem.

Use the signals from the three towers to determine the robot's location on the grid.

## Sample Input
Each line of input has three floating-point number separated by one or more spaces. These numbers are the signal strengths from towers 1, 2, and 3, in that order, for each location of the robot. The input ends with three zeros.
```
5.432 2.716 2.716
6.733 0.956 1.284
501.345 2.102 1.878
2.207 2.644 662.852
0 0 0
```

## Sample Output
For each input line, print the exact integer \\(x\\) and \\(y\\) location of the robot.
```
0 0
21 35
-14 99
93 -90
```