package solutions;

import java.util.Scanner;

public class Repl_060_Verify_contains {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		String sentence = scan.nextLine();
		// WRITE YOUR CODE HERE

		System.out.println(sentence.contains(word));

	}
}

//Write a program that will verify if word contains in the sentence. Print out the result as boolean value. 