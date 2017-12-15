import java.util.*;

public class RemovingSnow {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());

		for (int i = 0; i < n; i++) {
			int plots = Integer.parseInt(in.nextLine());
			int[] values = new int[plots];

			for (int p = 0; p < plots; p++)
				values[p] = Integer.parseInt(in.nextLine());

			System.out.println(getLargest(values));
		}
	}

	public static long getLargest(int[] values) {
		long maxArea = 0;

		for (int i = 0; i < values.length; i++) {
			final int h = values[i];
			int w = 1;
			for (int j = i - 1; j >= 0 && values[j] >= h; j--) w++;
			for (int j = i + 1; j < values.length && values[j] >= h; j++) w++;

			maxArea = Math.max(maxArea, h * w);
		}

		return maxArea;
	}
}
