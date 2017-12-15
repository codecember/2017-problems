/*
* Programmer: Emily Peterson
* Date: Nov 6, 2017
* Project Name/Description:
*/
import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class Cooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(System.in);
			int cases = in.nextInt();
			double[] recipe = {3.0, 2.0, 2.0, 1.0};
			for (int i=0; i<recipe.length; i++) {
				recipe[i] /= 22.0;
				//out.println(recipe[i] + " for 1 cookie ing " + i);
			}
			
			for (int c =0; c<cases; c++) {
				double[] ing = new double[4];
				int lowestNum = Integer.MAX_VALUE;
				for (int i=0; i<ing.length; i++) {
					ing[i] = in.nextInt() * 1.0;
					if ((int)(ing[i]/recipe[i])<lowestNum) {
						lowestNum = (int) (ing[i]/recipe[i]);
						//out.println("latest lowest " + i);
					}
				}
				out.println(lowestNum);
			}
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
