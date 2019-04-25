package solutions;

import java.util.Scanner;

public class Repl_115_Arrays_Finding_Max_Length_in_String_array {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for (int i = 0; i < 5; i++) {
			words[i] = input.nextLine();
		}

		// write your code below

		int max = 0;
		String sentence = "";
		for (int x = 0; x < words.length; x++) {
			if (words[x].length() > max) {
				max = words[x].length();
				sentence = words[x];
			}
		}
		System.out.println(sentence);

	}
}
