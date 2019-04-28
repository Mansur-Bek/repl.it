package solutions;

import java.util.Scanner;

public class Repl_070_Without_X_x {
	public static void main(String[] args) {
		String word1;
		Scanner scan = new Scanner(System.in);
		word1 = scan.next();
		int length = word1.length();

		if ((word1.charAt(0) == 'x' || word1.charAt(0) == 'X')
				&& (word1.charAt(length - 1) == 'x' || word1.charAt(length - 1) == 'X')) {
			System.out.println(word1.substring(1, length - 1));
		} else if (word1.charAt(0) == 'x' || word1.charAt(0) == 'X') {
			System.out.println(word1.substring(1));
		} else if (word1.charAt(length - 1) == 'x' || word1.charAt(length - 1) == 'X') {
			System.out.println(word1.substring(0, length - 1));
		} else
			System.out.println(word1);

	}
}

//Given a string, if the first or last chars are 'x' or 'X', return the string without those 'x' or 'X' chars,  otherwise return the string unchanged. 
//
//Example: 
//input: xHiX 
//output: Hi
//
//Example:
//input: apple 
//output: apple
