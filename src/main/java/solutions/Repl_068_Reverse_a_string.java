package solutions;

import java.util.Scanner;

public class Repl_068_Reverse_a_string {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		// WRITE YOUR CODE HERE
		String reversed = "";

		if (word.length() > 5) {
			System.out.println("Too long!");

		}
		if (word.length() < 5) {

			System.out.println("Too short!");

		} else if (word.length() == 5) {
			System.out.println(word.charAt(4) + "" + word.charAt(3) + "" + word.charAt(2) + "" + word.charAt(1) + ""
					+ word.charAt(0));
		}

	}
}

//Write a program that will reverse a string. Your program should reverse a string only 5 characters long. If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!". Otherwise, reverse this word and print out result into the console. 
//
//Example:
//input: cat
//output: Too short!
//
//Example:
//input: singularity
//output: Too long!
//
//Example:
//input: apple
//output: elppa

