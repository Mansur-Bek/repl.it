package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class Repl148 {
	public static void add_to_r(int[] r, int n) {
		// create new array with one more position.
		int[] new_r;
		new_r = new int[r.length + 1];
		// we are coping all values
		new_r = Arrays.copyOf(r, r.length + 1);
		// we are assgining to the last element in the new array value of variable n
		new_r[new_r.length - 1] = n;
		// we are printing values one by one
		for (int each : new_r) {

		}
		System.out.print(Arrays.toString(new_r));
	}

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		int size = inp.nextInt(), n = inp.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i <= size - 1; i++) {

			arr[i] = inp.nextInt();
		}

		add_to_r(arr, n);

	}
}
