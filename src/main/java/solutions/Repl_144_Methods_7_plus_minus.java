package solutions;

import java.util.Scanner;

public class Repl_144_Methods_7_plus_minus {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int size = inp.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i <= size - 1; i++) {

			arr[i] = inp.nextInt();
		}

		plus_minus(arr);
	}// end main

	public static void plus_minus(int[] arr) {

		int positives = 0;
		int negatives = 0;
		int zeros = 0;

		for (int j = 0; j < arr.length; j++) {

			if (arr[j] > 0) {
				positives++;
			} else if (arr[j] < 0) {
				negatives++;
			} else {
				zeros++;
			}

		}
		System.out.println("positives:" + positives + ", negatives:" + negatives + ", zeros:" + zeros);
	}

}
