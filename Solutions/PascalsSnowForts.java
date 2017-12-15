import java.util.*;

public class PascalsSnowForts {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int cases = in.nextInt();

		while (cases-- > 0) {
			long rows = in.nextInt();

			for (long i = 0; i < rows; i++) {
				for (long k = rows - 1; k > i; k--) {
					System.out.print(" ");
				}

				long number = 1;

				for (long j = 0; j <= i; j++) {
					System.out.print(number + " ");
					number = number * (i - j) / (j + 1);
				}

				System.out.println();
			}
		}
	}
}
