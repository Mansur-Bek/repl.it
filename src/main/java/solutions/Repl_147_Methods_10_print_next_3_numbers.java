package solutions;

import java.util.Scanner;

public class Repl_147_Methods_10_print_next_3_numbers {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("enter number");
		int num = inp.nextInt();

		next3(num);
	}

	public static void next3(int passNum) {
		for (int i = 0; i < passNum + 3; i++) {
			System.out.print(passNum + i + " ");
		}

	}

}
