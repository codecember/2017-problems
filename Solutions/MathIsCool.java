/*
* Programmer: Emily Peterson
* Date: Nov 6, 2017
* Project Name/Description:
*/
import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class MathIsCool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(System.in);
			int cases = in.nextInt();
			for (int t=0; t<cases; t++) {
				int N = in.nextInt();
				int[] subs = new int[N];
				List<Integer>[] log = new ArrayList[N];
				for (int i=0; i<subs.length; i++) {
					log[i] = new ArrayList<Integer>();
					int r = i+1;
					if (r==1) {
						subs[i]=0;
						log[i].add(1);
					} else if (r==2) {
						subs[i] = 1;
						log[i].add(2);
						
					} else if (r==3) {
						subs[i] = 1;
						log[i].add(3);
						
					} else {
						int one = Integer.MAX_VALUE;
						int two = Integer.MAX_VALUE;
						int three = Integer.MAX_VALUE;
						one = 1 + subs[i-1];
						if ((r)%2==0) {
							two = 1 + subs[(r)/2-1];
							//Collections.copy(log[(i+1)/2-1], log[i]);
							/*
							for (int g: log[(i+1)/2-1]) {
								log[i].add(g);
							}
							out.println(log[i] +"!");
							*/
						}
						if ((r)%3==0) {
							three = 1 + subs[(r)/3-1];
							//Collections.copy(log[(i+1)/3-1], log[i]);
							//out.println(log[(i+1)/3-1] +"old");
							//out.println(log[i] +"!");
						}
						if (one<=two && one<= three) {
							subs[i] = one;
							for (int g: log[i-1]) {
								log[i].add(g);
							}
							log[i].add(1);
						} else if (two<=one && two<= three) {
							subs[i] = two;
							for (int g: log[(r)/2-1]) {
								log[i].add(g);
							}
							log[i].add(2);
						} else {
							subs[i]=three;
							for (int g: log[(r)/3-1]) {
								log[i].add(g);
							}
							log[i].add(3);
						}
						//out.println(log[i] +"!");
						//subs[i]=Math.min(one,  Math.min(two, three));
					}
				}
				out.println(subs[subs.length-1]);
				/*
				for (int x : log[subs.length-1]) {
					out.print(x+"_");
				}
				out.println("\n---");
				*/
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
