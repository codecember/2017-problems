/*
* Programmer: Emily Peterson
* Date: Nov 3, 2017
* Project Name/Description:
*/
import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class Biologist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(System.in);
			int cases = in.nextInt();
			for (int i=0; i<cases; i++) {
				int rows = in.nextInt();
				int cols = in.nextInt();
				in.nextLine();
				char[][] map = new char[rows][cols];
				char[][] markedMap = new char[rows][cols];
				for (int r=0; r<rows; r++) {
					map[r] = in.nextLine().toCharArray();
					for (int c=0; c<cols; c++) {
						markedMap[r][c] = map[r][c];
						//out.print(markedMap[r][c]);
					}
					//out.println();
				}
				ArrayList<int[]> data = new ArrayList<int[]>();
				for (int r=0; r<rows; r++) {
					for (int c=0; c<cols; c++) {
						//out.print(map[r][c] + "/" + markedMap[r][c] + " ");
						int ind = has(data, map[r][c]);
						if (ind!=-1) {
							data.get(ind)[2]++;
							if (markedMap[r][c]!='#') {
								data.get(ind)[1]++;
								//mark
								int[] spot = {r, c};
								mark(markedMap, spot, map[r][c]);
							}
						} else {
							int[] toAdd = {map[r][c], 1, 1};
							data.add(toAdd);
							//mark
							int[] spot = {r, c};
							mark(markedMap, spot, map[r][c]);
						}
					}
					//out.println();
				}
				MyComparator mc = new MyComparator();
				Collections.sort(data, mc);
				for (int[] v: data) {
					out.println((char)(v[0]) + " " + v[1] + " " + v[2]);
				}
				out.println();
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static class MyComparator implements Comparator {

		@Override
		public int compare(Object arg0, Object arg1) {
			int[] one = (int[])arg0;
			int[] two = (int[])arg1;
			if (one[2]>two[2]) {
				return -1;
			} else if (two[2]>one[2]) {
				return 1;
			} else {
				return one[0]+"".compareTo(two[0]+"") * -1;
			}
			
		}
		
	}
	public static void mark (char[][] toMark, int[] curr, char type) {
		if (toMark[curr[0]][curr[1]]==type) {
			toMark[curr[0]][curr[1]] = '#';
			if (curr[0]+1<toMark.length) {
				int[] newCurr = {curr[0]+1, curr[1]};
				mark(toMark, newCurr, type);
			}
			if (curr[1]+1<toMark[0].length) {
				int[] newCurr = {curr[0], curr[1]+1};
				mark(toMark, newCurr, type);
			}
		}
		
	}
	public static int has (ArrayList<int[]> data, char ch) {
		for (int z=0; z<data.size(); z++) {
			if (data.get(z)[0]==ch) {
				return z;
			}
		}
		return -1;
	}

}
