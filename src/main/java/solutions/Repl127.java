package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class Repl127 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] words = str.split(", ");
		String shortest = words[0];
		for (String s : words) {
			if (shortest.length() > s.length()) {
				shortest = s;
			}
		}
		int counter = 0;
		for (String s : words) {
			if (shortest.length() == s.length()) {
				counter++;
			}
		}
		String[] shortWords = new String[counter];
		for (int i = 0, j = 0; i < words.length; i++) {
			if (shortest.length() == words[i].length()) {
				shortWords[j] = words[i];
				j++;
			}
		}
		// print new array
		Arrays.sort(shortWords);
		System.out.println(Arrays.toString(shortWords));

	}
}
