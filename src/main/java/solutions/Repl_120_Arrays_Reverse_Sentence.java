package solutions;

import java.util.Scanner;

public class Repl_120_Arrays_Reverse_Sentence {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		// TODO: Type your code below
		String[] reversed = sentence.split(" ");

		for (int i = reversed.length - 1; i >= 0; i--) {
			System.out.println(reversed[i]);

		}
	}
}
