package solutions;

import java.util.Scanner;

public class Repl_121_Arrays_Reverse_Sentence_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		String reversed = "";
		// TODO: start your code here
		String[] split = sentence.split(" ");
		for (int i = split.length - 1; i >= 0; i--) {
			reversed = reversed + " " + split[i];
		}

		// End your code here. do not modify below statement
		System.out.println(reversed.trim());

	}
}
