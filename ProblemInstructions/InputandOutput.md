## Overview

All problems in this competition use `System.in` (keyboard input) to give your problem test cases, not file input.

Here is an example that uses a `Scanner` to handle keyboard input

```
import java.util.*;    // imports java util classes including Scanner

public class Main {
	public static void main(String[] args) {
		// Creates a scanner variable "kb" and uses System.in (keyboard input)
		Scanner kb = new Scanner(System.in);
					
		while(kb.hasNextLine()) {    // Checks the input if there is any more lines left (will loop if there is)
			String a = kb.nextLine();    // Gets the next line of input as a String
			System.out.println(a);
		}					
	}
}
```

### Scanner Methods
These are some Scanner methods allow you to read information from the input (either a file or the keyboard)

```
kb.hasNextLine() // returns true if there is another line of input
kb.hasNext() // returns true if there is another token
kb.hasNextInt() //returns true if there is another int in input
kb.hasNextDouble() //returns true if there is another double in input
//etc.
```