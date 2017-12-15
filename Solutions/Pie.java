/*
* Programmer: Emily Peterson
* Date: Nov 12, 2017
* Project Name/Description:
*/
import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Pie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(System.in);
			while(in.hasNext()) {
				int slices = in.nextInt();
				out.println(slices%3);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
