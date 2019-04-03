package solutions;

import java.util.Scanner;

public class Repl103 {
	public static void main(String[] args) {
		int count = 0;
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int i = 0;
		while (i <= str.length() - 4) {
			if (str.substring(i, i + 4).matches("co(\\w)e")) {
				count++;
			}
			i++;
		}
		System.out.println(count);

	}
}
