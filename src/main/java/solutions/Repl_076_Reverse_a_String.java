package solutions;

import java.util.Scanner;

public class Repl_076_Reverse_a_String {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();

		int length = sentence.length() - 1;
		while (length >= 0) {
			System.out.print(sentence.charAt(length));
			length--;
		}
	}
}

//In this task, you need to write a program that will reverse a string. Reverse a sentence variable and print the result.
//
//Example:
//input: red
//output: der

