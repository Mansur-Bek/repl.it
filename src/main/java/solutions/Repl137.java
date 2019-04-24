package solutions;

import java.util.Scanner;

public class Repl137 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] matrix = new int[][] { { scan.nextInt(), scan.nextInt(), scan.nextInt() },
				{ scan.nextInt(), scan.nextInt(), scan.nextInt() },
				{ scan.nextInt(), scan.nextInt(), scan.nextInt() } };

		int result = 0;

		// FINAL PRINT

		int right = 0;
		int left = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i == j)
					right += matrix[i][j];
				if (i + j == matrix.length - 1)
					left += matrix[i][j];
			}
		}
		result = right - left;

		System.out.println(Math.abs(result));

	}
}
