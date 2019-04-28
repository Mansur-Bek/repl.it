package solutions;

import java.util.Scanner;

public class Repl_071_Email {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String email = scan.next();

		System.out
				.println((email.indexOf("_") != -1)
						? ((email.substring(email.indexOf("_") + 1, email.indexOf("@"))) + "" + "_"
								+ email.substring(0, email.indexOf("_"))) + (email.substring(email.indexOf("@")))
						: email);

	}
}

//In this task, you need to swap first name with last name in the email. If email doesn't contains underscore - do not anything. 
//
//Example:
//input: mike_tyson@gmail.com
//output: tyson_mike@gmail.com
//
//Example:
//input: viktoryakubovich@gmail.com
//output: viktoryakubovich@gmail.com
