package solutions;

import java.util.Scanner;

public class Repl_059_Print_first_and_last_letters {
	public static void main(String[] args) {
		// DO NOT CHANGE
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		// WRITE YOUR CODE HERE
		int i = word.length() - 1;
		System.out.println(word.charAt(0) + "" + word.charAt(i));

	}
}
