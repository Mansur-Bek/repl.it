package solutions;

import java.util.Scanner;

public class Repl_138_Methods_1_simple_calculator {

	public static void main(String[] args) {

		plus();
	}

	public static void plus() {

		// your code here
		Scanner scan = new Scanner(System.in);
		// System.out.println("enter first number:");
		int n1 = scan.nextInt();
		// System.out.println("enter second number:");
		int n2 = scan.nextInt();

		System.out.println("result: " + (n1 + n2));
	}
}
