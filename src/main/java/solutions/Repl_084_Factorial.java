package solutions;

import java.util.Scanner;

public class Repl_084_Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		long total = 1;
		for (int i = number; i > 0; --i) {
			total *= i;
		}
		System.out.println(total);

	}
}
