package solutions;

import java.util.Scanner;

public class Repl_085_Repeat_separator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String separator = scan.next();
		int count = scan.nextInt();

		String summary = word;
		while (--count > 0) {
			summary += separator + word;
		}
		System.out.println(summary);
	}
}
