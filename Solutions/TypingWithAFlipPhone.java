import java.util.*;

public class TypingWithAFlipPhone {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			String[] keys = new String[9];

			boolean end = false;
			for (int i = 0; i < keys.length; i++) {
				String line = in.nextLine();

				if (!line.equals("#")) {
					keys[i] = line + Integer.toString(i + 1);
				} else {
					end = true;
					break;
				}
			}

			if (end) break;

			int out = 0;
			String input = in.nextLine();

			for (int i = 0; i < input.length(); i++) {
				char letter = input.charAt(i);

				if (letter == ' ') {
					out++;
					continue;
				}

				if (letter == '0') {
					out += 2;
					continue;
				}

				for (int n = 0; n < keys.length; n++) {
					if (keys[n].contains(Character.toString(letter)))
						out += keys[n].indexOf(letter) + 1;
				}
			}

			System.out.println(out);
		}
	}
}
