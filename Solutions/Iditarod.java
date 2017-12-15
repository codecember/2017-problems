/*
* Programmer: Emily Peterson
* Date: Nov 6, 2017
* Project Name/Description:
*/
import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class Iditarod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner in = new Scanner(System.in);
			int direction = 0; //0=up, 1=right, 2=down, 3=left
			int xDist = 0;
			int yDist = 0;
			loop: while (in.hasNext()) {
				String command = in.nextLine();
				switch (command) {
				case "WOAH":
					break loop;
				case "MUSH":
					switch (direction) {
					case 0:
						yDist += 10;
						break;
					case 1:
						xDist += 10;
						break;
					case 2:
						yDist -= 10;
						break;
					case 3:
						xDist -= 10;
						break;
					}
					break;
				case "GEE":
					direction++;
					break;
				case "HAW":
					direction--;
					break;
				}
				if (direction==4) {
					direction = 0;
				} else if (direction <0){
					direction = 3;
				}
			}
			int resultant = (int)Math.round((Math.sqrt(xDist*xDist + yDist*yDist)));
			out.println(resultant);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
