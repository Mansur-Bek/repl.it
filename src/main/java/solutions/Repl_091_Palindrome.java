package solutions;

import java.util.Scanner;

public class Repl_091_Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		word = word.toLowerCase().replace(" ", "");
		String word2 = "";
		// WRITE YOUR CODE HERE
		int length = word.length() - 1;
		for (int i = length; i >= 0; i--) {
			word2 += word.charAt(i) + "";
		}
		System.out.println(word.equals(word2));
	}
}
