package solutions;

import java.util.Scanner;

public class Repl_126_Arrays_Print_shortest_word {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] str = { scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next() };
		String shorWort = str[0];
		for (int i = 0; i < str.length - 1; i++) {
			if (str[i].length() < shorWort.length()) {
				shorWort = str[i];
			}
		}

		System.out.println(shorWort);
	}
}
