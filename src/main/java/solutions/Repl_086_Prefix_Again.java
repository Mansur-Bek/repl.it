package solutions;

import java.util.Scanner;

public class Repl_086_Prefix_Again {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n = scan.nextInt();

		System.out.println((str.substring(n, str.length()).contains(str.substring(0, 0 + n))));
	}
}
