package solutions;

import java.util.Scanner;

public class Repl_092_Parse_JSON_file {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String json = scan.nextLine();
		String firstName = json.substring(json.indexOf("firstName") + 13,
				json.indexOf("\",", json.indexOf("firstName")));
		String lastName = json.substring(json.indexOf("lastName") + 12, json.indexOf("\",", json.indexOf("lastName")));

		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);

	}
}
