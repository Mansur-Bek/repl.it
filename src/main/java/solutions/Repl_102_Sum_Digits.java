package solutions;

import java.util.Scanner;

public class Repl_102_Sum_Digits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum += Integer.valueOf(str.substring(i, i + 1));
			}
		}
		System.out.println(sum);
	}
}
