import java.util.*;

public class HighArcticCamelCase {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			String line = in.nextLine().toUpperCase();
			String[] words = line.split(" ");
			if (words.length == 1 && words[0].equals("END")) break;
			String out = words[0];

			for (int i = 1; i < words.length; i++) {
				out += words[i].substring(0, 1).toLowerCase();
				out += words[i].substring(1);
			}

			System.out.println(out);
		}
	}
}
