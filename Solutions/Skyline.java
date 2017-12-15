/*
* Programmer: Emily Peterson
* Date: Nov 6, 2017
* Project Name/Description:
*/
import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class Skyline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(System.in);
			int cases = in.nextInt();
			for (int c =0; c<cases; c++) {
				int scrapers = in.nextInt();
				int[] heights = new int[scrapers];
				int biggestHeight = 0;
				for (int s=0; s<scrapers; s++) {
					heights[s] = in.nextInt();
					if (heights[s]>biggestHeight) {
						biggestHeight = heights[s];
					}
				}
				char[][] skyline = new char[biggestHeight+1][scrapers*3];
				for (int i=0; i<skyline.length; i++) {
					for (int r=0; r<scrapers; r++) {
						if (i+1<=heights[r]) {
							skyline[i][r*3]='|';
							skyline[i][r*3+1]='#';
							skyline[i][r*3+2]='|';
						} else if (i+1 == heights[r]+1) {
							skyline[i][r*3]=' ';
							skyline[i][r*3+1]='_';
							skyline[i][r*3+2]=' ';
						} else {
							skyline[i][r*3]=' ';
							skyline[i][r*3+1]=' ';
							skyline[i][r*3+2]=' ';
						}
					}
				}
				for (int i=skyline.length-1; i>=0; i--) {
					for (int z=0; z<skyline[i].length; z++) {
						out.print(skyline[i][z]+"");
					}
					out.println();
				}
				out.println();
			}
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
