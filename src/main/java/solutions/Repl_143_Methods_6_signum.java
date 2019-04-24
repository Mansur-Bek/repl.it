package solutions;

import java.util.Scanner;

public class Repl_143_Methods_6_signum {

	public static void sign(int n) {
		System.out.println(n > 0 ? 1 : n == 0 ? 0 : -1);
	}// end sign

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();

		sign(n);
	}
}
