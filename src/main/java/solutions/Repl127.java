package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class Repl127 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		String[] words = str.split(", ");
		Arrays.sort(words);

		String shortest = words[0];
		int minLength = shortest.length();
		int count = 0;

		for (String word : words) {
			if (minLength > word.length()) {
				minLength = word.length();
				count = 0;
			}
			if (minLength == word.length()) {
				count++;
			}
		}

		String[] shortestWords = new String[count];
		int index = 0;
		for (String word : words) {
			if (word.length() == minLength) {
				shortestWords[index++] = word;
			}
		}

		System.out.println(Arrays.toString(shortestWords));

	}
}
