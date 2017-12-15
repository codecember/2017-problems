import java.util.*;

public class LastMinute {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());

		for (int i = 0; i < n; i++) {
			String line1 = in.nextLine();
			String[] parts1 = line1.split("[ :]");

			int hour1 = Integer.parseInt(parts1[0]);
			int minute1 = Integer.parseInt(parts1[1]);
			int day1 = Integer.parseInt(parts1[2]);

			String line2 = in.nextLine();
			String[] parts2 = line2.split("[ :]");

			int hour2 = Integer.parseInt(parts2[0]);
			int minute2 = Integer.parseInt(parts2[1]);
			int day2 = Integer.parseInt(parts2[2]);

			int diff = 0;

			diff += (day1 - day2) * 24;
			diff += hour1 - hour2;

			int mins = minute1 - minute2;

			if (mins < 0) {
				diff--;
				mins += 60;
			}

			System.out.println(diff + " hours " + mins + " minutes");
		}
	}
}
