package solutions;

import java.util.Scanner;

public class Repl_116_Arrays_Split_Sentence {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		// type your code below

		String[] words = sentence.split(" ");
		for (int x = 0; x < words.length; x++) {
			String eachOne = words[x];
			System.out.println(eachOne);
		}

	}
}
