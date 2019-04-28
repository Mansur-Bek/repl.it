package solutions;

import java.util.Scanner;

public class Repl_087_Count_Java {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int counter = 0;

		for (int i = 0; i < word.length() - 3; i++) {
			if (word.substring(i, i + 4).equals("java")) {
				counter++;

			}

		}
		System.out.println(counter);
	}
}
