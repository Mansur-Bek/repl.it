package solutions;

import java.util.Scanner;

public class Repl_090_Parse_HTML {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String html = scan.nextLine();
		if (!html.contains("<html>")) {
			System.out.println("Invalid input!");
			System.exit(0);
		}
		String sub2 = html.substring(html.indexOf("id=") + 4);
		String myId = sub2.substring(0, sub2.indexOf("\""));
		System.out.println(myId);
	}
}
