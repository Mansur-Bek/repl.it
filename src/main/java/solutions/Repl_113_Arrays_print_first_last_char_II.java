package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_113_Arrays_print_first_last_char_II {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] words = { input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine() };
		String[] wordy = new String[words.length];

		// TODO: Write your code below
		for (int i = 0; i < words.length; i++) {
			wordy[i] = (words[i].charAt(0) + "" + (words[i].charAt(words[i].length() - 1)));

		}
		System.out.println(Arrays.toString(wordy));
	}
}
