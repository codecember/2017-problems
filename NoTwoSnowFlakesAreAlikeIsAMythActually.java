import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

// lol love the name!
public class NoTwoSnowFlakesAreAlikeIsAMythActually {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		List<String> cache = new ArrayList<>();

		while (in.hasNext()) {
			String num = in.nextLine();

			if (!cache.contains(num))
				cache.add(num);
		}

		for (String s : cache)
			System.out.println(s);
	}
}
