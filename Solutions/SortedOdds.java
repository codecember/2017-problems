import java.util.*;
import java.util.stream.*;

public class SortedOdds {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			String input = in.nextLine();

			int[] nums = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
			int[] odds = Arrays.stream(nums).filter(i -> i % 2 == 1).sorted().toArray();

			for (int i = 0, s = 0; i < nums.length; i++)
				if (nums[i] % 2 == 1)
					nums[i] = odds[s++];

			IntStream.range(0, nums.length - 1).forEach(n -> System.out.print(nums[n] + " "));
			System.out.println(nums[nums.length - 1]);
		}
	}
}
