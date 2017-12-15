## Introduction

The Iditarod is an annual sled dog race 350 miles in length and taking about 15 days to complete. The best sled dog mushers in the world gather in Alaska to compete in the toughest race conditions, facing blizzards, sub-zero temperatures, and powerful winds. This year though, the race will need to pick a new course (due to blockages). Help calculate the distance of the new Iditarod course! To determine the race path, a sled dog team will be sent out into the Alaskan wilderness following its musher’s commands. Given the commands of the musher as she navigates the terrain for a new course, determine the distance between the starting and finishing points.

## Input
There will be several lines of input. Each line will contain a sled dog command (one of four) from the musher. If the command is “MUSH”, the sled dogs will advance forward in their current direction for 10 miles. If the command is “GEE”, the dogs will turn 90 degrees to the right, and if the command is “HAW”, the dogs will turn 90 degrees to the left. Input will be terminated by the command of “WOAH”.

```
MUSH
MUSH
GEE
MUSH
MUSH
HAW
MUSH
HAW
HAW
MUSH
GEE
MUSH
GEE
MUSH
WOAH
```

## Output
Print out the distance between the starting point of the sled dog team and finishing point. The distance should be rounded into an integer.

```
32
```r.

```
32
```