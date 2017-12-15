import java.util.*;
import java.math.BigInteger;

public class StructuralIntegrity {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int cases = Integer.parseInt(in.nextLine());

		for (int i = 0; i < cases; i++) {
			String line = in.nextLine();
			String[] words = line.split(" ");
			int matrixSize = Integer.parseInt(words[0]);
			int operations = Integer.parseInt(words[1]);

			int[][][] matrix = new int[matrixSize][matrixSize][matrixSize];

			for (int x = 0; x < matrixSize; x++)
				for (int y = 0; y < matrixSize; y++)
					for (int z = 0; z < matrixSize; z++)
						matrix[x][y][z] = 0;

			for (int m = 0; m < operations; m++) {
				line = in.nextLine();
				words = line.split(" ");

				if (words[0].equals("UPDATE")) {
					int x = Integer.parseInt(words[1]);
					int y = Integer.parseInt(words[2]);
					int z = Integer.parseInt(words[3]);
					int value = Integer.parseInt(words[4]);

					matrix[x - 1][y - 1][z - 1] = value;
				} else if (words[0].equals("QUERY")) {
					int x1 = Integer.parseInt(words[1]);
					int y1 = Integer.parseInt(words[2]);
					int z1 = Integer.parseInt(words[3]);
					int x2 = Integer.parseInt(words[4]);
					int y2 = Integer.parseInt(words[5]);
					int z2 = Integer.parseInt(words[6]);

					BigInteger sum = BigInteger.valueOf(0);
					for (int x = x1 - 1; x < x2; x++)
						for (int y = y1 - 1; y < y2; y++)
							for (int z = z1 - 1; z < z2; z++)
								sum = sum.add(BigInteger.valueOf(matrix[x][y][z]));

					System.out.println(sum.toString());
				}
			}
		}
	}
}

