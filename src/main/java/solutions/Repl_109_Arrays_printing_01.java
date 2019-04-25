package solutions;

import java.util.Scanner;

public class Repl_109_Arrays_printing_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i = 0; i < 5; i++) {

			arr[i] = input.nextLine();

			// leave above alone! write your code below
			System.out.println(arr[i].substring(0, 3));

		}
	}
}
