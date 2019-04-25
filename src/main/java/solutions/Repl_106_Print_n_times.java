package solutions;

import java.util.Scanner;

public class Repl_106_Print_n_times {
	public static void main(String[] args) {
		int j = 0;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (j = 0; j < n; j++) {
			System.out.print("*");
		}
	}
}
