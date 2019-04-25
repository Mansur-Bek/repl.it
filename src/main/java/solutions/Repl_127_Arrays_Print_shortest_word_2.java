package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_127_Arrays_Print_shortest_word_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] words = str.split(", ");

		int x = words[0].length();
		String shorter = words[0];
		String shortest = "";
		for (int i = 0; i < words.length; i++) {

			if (words[i].length() < x) {
				shorter = words[i];
				x = words[i].length();
			}
		}

		for (int i = 0; i < words.length; i++) {

			if (words[i].length() == x) {

				shortest = shortest + " " + words[i];
			}
		}

		shortest = shortest.substring(1);
		String[] complete = shortest.split(" ");

		Arrays.sort(complete);
		System.out.println(Arrays.toString(complete));

	}
}
