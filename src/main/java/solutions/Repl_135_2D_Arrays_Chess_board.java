package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_135_2D_Arrays_Chess_board {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int rows = inp.nextInt(), cols = inp.nextInt();
		int[][] arr = new int[rows][cols];
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= cols - 1; j++) {
				arr[i][j] = inp.nextInt();
			} // end for cols
		} // end for rows

		// TODO write your code below
		int max = 0;
		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= cols - 1; j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
			} // end for cols
		} // end for rows

		for (int i = 0; i <= rows - 1; i++) {
			for (int j = 0; j <= cols - 1; j++) {
				arr[i][j] = max;

			} // end for cols
		}

		System.out.println(Arrays.deepToString(arr));
		

	}
}
