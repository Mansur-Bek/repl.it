package solutions;

import java.util.Scanner;

public class Repl_098_Equals_java_python {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		int j = 0;
		int p = 0;
		for (int i = 0; i <= sentence.length() - 4; i++)
			if (sentence.substring(i, i + 4).equals("java"))
				j++;
		for (int i = 0; i <= sentence.length() - 6; i++)
			if (sentence.substring(i, i + 6).equals("python"))
				p++;
		System.out.println(j == p);
	}
}
