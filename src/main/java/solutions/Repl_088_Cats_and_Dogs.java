package solutions;

import java.util.Scanner;

public class Repl_088_Cats_and_Dogs {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int countOfCats = 0;
		int countOfDogs = 0;
		String word = scan.next();

		for (int i = 0; i < word.length() - 2; i++) {

			if (word.substring(i, i + 3).equals("cat")) {
				countOfCats++;
			}

		}

		for (int j = 0; j < word.length() - 2; j++) {

			if (word.substring(j, j + 3).equals("dog")) {
				countOfDogs++;
			}

		}

		System.out.println(countOfCats == countOfDogs);

	}
}
