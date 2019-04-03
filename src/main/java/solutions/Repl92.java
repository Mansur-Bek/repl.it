package solutions;

import java.util.Scanner;

public class Repl92 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String json = scan.nextLine();

		String json2 = json.replace(":", "").replace("\"", "").replace(",", "");

		String name = json2.substring(json2.indexOf("firstName") + 10, json2.indexOf("lastName"));
		String surname = json2.substring(json2.indexOf("lastName") + 9, json2.indexOf("role"));

		System.out.println("First name: " + name.trim());
		System.out.println("Last name: " + surname.trim());
	}
}
