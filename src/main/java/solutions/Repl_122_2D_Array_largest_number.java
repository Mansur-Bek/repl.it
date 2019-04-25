package solutions;

import java.util.Scanner;

public class Repl_122_2D_Array_largest_number {
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

		int max = arr[0][0];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];

				}

			}

		}
		System.out.print(max);

		// System.out.print(Arrays.toString( arr));

	}// end main

}
