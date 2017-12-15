/*
* Programmer: Emily Peterson
* Date: Nov 3, 2017
* Project Name/Description:
*/
import static java.lang.System.*;
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class BarcodeReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Scanner in = new Scanner(System.in);
			int c = in.nextInt();
			in.nextLine();
			HashMap<String, String> cat = new HashMap<String,String>();
			for (int i=0; i<c; i++) {
				String line = in.nextLine();
				int sepInd = line.indexOf(" ");
				cat.put(line.substring(0, sepInd), line.substring(sepInd+1));
			}
			int t = in.nextInt();
			in.nextLine();
			for (int i=0; i<t; i++) {
				String bar = in.nextLine();
				if (cat.get(bar)!=null) {
					out.println(cat.get(bar));
				} else {
					out.println("UNRECOGNIZED");
				}
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
