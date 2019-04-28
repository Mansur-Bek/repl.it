package solutions;

import java.util.Scanner;

public class Repl_064_Swap_first_and_last_characters {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();

		char first = word.charAt(0);
		char last = word.charAt(word.length() - 1);

		String mid = word.substring(1, word.length() - 1);

		System.out.println(last + mid + first);

	}
}

//Write a program that will swap first and last characters in the string. Use substring method to slice the string. Print out result into the console. 
//
//
//
//Example #1
//input: apple
//output: eppla
//
//Example #2
//input: pursuit
//output: tursuip
