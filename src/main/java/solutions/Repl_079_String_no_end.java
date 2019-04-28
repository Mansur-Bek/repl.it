package solutions;

import java.util.Scanner;

public class Repl_079_String_no_end {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String txt = s.next();
		String i = txt.substring(0, txt.length() - 1);
		System.out.println(i);

	}
}
