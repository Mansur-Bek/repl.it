package solutions;

import java.util.Scanner;

public class Repl_065_Concatenate_strings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word1 = scan.nextLine();
		String word2 = scan.nextLine();
		String a = (word1.substring(word1.length() - 1));
		String b = (word2.substring(0, 1));
		if (a.equals(b)) {
			System.out.println(word1 + word2.substring(1));

		} else {
			System.out.println(word1 + word2);
		}
	}
}

//Write a program that will append two strings (word1 and word2) together (known as "concatenation") and print the result. 
//However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
