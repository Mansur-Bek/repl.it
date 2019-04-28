package solutions;

import java.util.Scanner;

public class Repl_066_Print_half_twice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String str = word.substring(0, 3);
		String str1 = word.substring(0, 2);
		String str2 = word.substring(0, 4);
		if (word.length() == 6) {
			System.out.println(str + str);
		}
		if (word.length() == 5) {
			System.out.println(str1 + str1);
		}
		if (word.length() > 6) {
			System.out.println(str2 + str2);
		}

	}
}

//Write a program that will print out first half of the word twice. 
//
//Example:
//
//input: Rabbit
//output: RabRab
