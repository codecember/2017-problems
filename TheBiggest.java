/*
* Programmer: Emily Peterson
* Date: Nov 6, 2017
* Project Name/Description:
*/
import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class TheBiggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(System.in);
			int nums = in.nextInt();
			int biggest = Integer.MIN_VALUE;
			for (int n=0; n<nums; n++) {
				int num = in.nextInt();
				if (num>biggest) {
					biggest = num;
				}
			}
			out.println(biggest);


		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
