package solutions;

import java.util.Scanner;

public class Repl_072_Email_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String email = scan.next();
		int n1 = email.indexOf("_");
		int n2 = email.indexOf("@");
		int n3 = email.indexOf(".");
		System.out.println("First name: " + email.substring(0, 1).toUpperCase() + email.substring(1, n1));
		System.out.println("Last name: " + email.substring(n1 + 1, n1 + 2).toUpperCase() + email.substring(n1 + 2, n2));
		System.out.println("Domain: " + email.substring(n2 + 1, n3));
		System.out.println("Top-Level Domain: " + email.substring(n3 + 1));

	}
}

//Write a program that will print out information about user based on email. Print first and last name from the upper case.
//
//Example:
//Input: craig_federighi@apple.com
//Output: 
//First name: Craig
//Last name: Federighi
//Domain: apple
//Top-Level Domain: com
