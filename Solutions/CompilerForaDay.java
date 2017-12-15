/*
* Programmer: Emily Peterson
* Date: Nov 3, 2017
* Project Name/Description:
*/
import static java.lang.System.*;
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class CompilerForaDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Scanner in = new Scanner(System.in);
			int cases = in.nextInt();
			in.nextLine();
			String regex = "\\s*int\\s+\\w+\\s*=\\s*-?\\d+\\s*;\\s*";
			for (int t=0; t<cases; t++) {
				String line = in.nextLine();
				//out.print(line + " is ");
				if (Pattern.matches(regex, line)) {
					out.println("VALID");
				} else {
					out.println("INVALID");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
