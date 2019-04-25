package solutions;

import java.util.Scanner;

public class Repl_094_Count_Hi {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		String findStr = "hi";
		int lastIndex = 0;
		int count = 0;

		while (lastIndex != -1) {
			lastIndex = str.indexOf(findStr, lastIndex);

			if (lastIndex != -1)
				count++;
			else
				break;

			lastIndex += findStr.length();

		}

		System.out.println(count);
	}
}
