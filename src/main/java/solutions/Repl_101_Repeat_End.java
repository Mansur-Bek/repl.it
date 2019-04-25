package solutions;

import java.util.Scanner;

public class Repl_101_Repeat_End {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = scan.nextInt();

		// String str = "Hello";
		// int n = 3;
		String want = "";
		// int lent = str.length();
		String substr = str.substring(str.length() - n, str.length());
		// System.out.println(substr);

		for (int i = 1; i <= n; i++) {
			want = want + substr;
		}

		System.out.println(want);

	}
}
