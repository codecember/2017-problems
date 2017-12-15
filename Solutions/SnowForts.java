import java.util.*;

public class SnowForts {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			PriorityQueue<Fort> forts = new PriorityQueue<>();

			String friends = in.nextLine();
			String[] friendSplit = friends.split(" ");
			int n = Integer.parseInt(friendSplit[0]);
			int k = Integer.parseInt(friendSplit[1]);

			for (int i = 0; i < n; i++) {
				String line = in.nextLine();
				String[] split = line.split(" ");

				forts.add(new Fort(split[0], Integer.parseInt(split[1]), Integer.parseInt(split[2])));
			}

			for (int i = 0; i < k; i++)
				System.out.println(forts.remove());
		}
	}
}

class Fort implements Comparator<Fort>, Comparable<Fort> {
	public String name;
	public int x;
	public int y;
	public double dist;

	public Fort(String name, int x, int y) {
		this.name = name;
		this.x = x;
		this.y = y;

		dist = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	public int compare(Fort c1, Fort c2) {
		return c1.dist > c2.dist ? 1 : c1.dist == c2.dist ? 0 : -1; 
	}

	public int compareTo(Fort c) {
		return this.dist > c.dist ? 1 : this.dist == c.dist ? 0 : -1;
	}

	public String toString() {
		return name;
	}
}
