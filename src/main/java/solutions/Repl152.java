package solutions;

import java.util.Scanner;

public class Repl152 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		String[] words = new String[size];
		for (int i = 0; i < size; i++) {
			words[i] = scan.next();
		}
		printUniqueWords(words);
	}

	public static void printUniqueWords(String[] words) {
		// WRITE YOUR CODE HERE
		for (int j = 0; j < words.length; j++) {
			int counter = 0;
			for (int k = 0; k < words.length; k++) {
				if (words[j].equals(words[k]))
					counter++;

			}
			if (counter == 1)
				System.out.println(words[j]);

		}

	}
}
