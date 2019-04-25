package solutions;

import java.util.Scanner;

public class Repl_118_Arrays_Split_email {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String email = input.nextLine();

		// Write your code below

		int count = 0;

		for (int i = 0; i < email.length(); i++) {

			if (email.charAt(i) == '@') {
				count++;
			}

		}

		if (count == 0) {
			System.out.println("invalid email");
		} else if (count >= 2) {
			System.out.println("invalid email");
		} else {

			String[] str = email.split("@");

			String id = str[0];
			String domain = str[1];
			System.out.println("Email id: " + id);
			System.out.println("Email domain: " + domain);

		}

	}
}
