package solutions;

import java.util.Scanner;

public class Repl_140_Methods_3_find_cube {

	public static void cube() {
		// your code here
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		n = n * n * n;
		System.out.println(n);
	}// end cube

	public static void main(String[] args) {

		cube();

	}
}
