package solutions;

import java.util.Scanner;

public class Repl_112_Arrays_print_first_last_char_I {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] words = { input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine() };

		// TODO: Write your code below

		for (int x = 0; x < words.length; x++) {
			System.out.println(words[x].substring(0, 1) + words[x].substring(words[x].length() - 1));
		}

	}
}
