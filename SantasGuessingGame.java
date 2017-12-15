import java.util.*;

public class SantasGuessingGame {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = Integer.parseInt(in.nextLine()) + 1;

		BinarySearch search = new BinarySearch(n);

		System.out.println(search.choose());

		String input = in.nextLine();

		while (!input.equals("CORRECT")) {
			if (input.equals("HIGHER"))
				search.upper();
			else
				search.lower();

			System.out.println(search.choose());
			input = in.nextLine();
		}
	}
}

class BinarySearch {
	private int lowerBound, upperBound;
	private int chosen;
	
	Random rand;

	public BinarySearch(int upper) {
		lowerBound = 0;
		upperBound = upper;
		chosen = 0;
		rand = new Random();
	}

	public int choose() {
		chosen = (int) ((upperBound + lowerBound) / 2);
		return chosen;
	}

	public void upper() {
		lowerBound = chosen;
	}

	public void lower() {
		upperBound = chosen;
	}
}
