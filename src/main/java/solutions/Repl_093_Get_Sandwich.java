package solutions;

import java.util.Scanner;

public class Repl_093_Get_Sandwich {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		// str= str.replaceAll("bread","");
		String jam = "";
		String str1 = str.substring(str.indexOf("bread") + 5);

		if (str.contains("bread") && str1.contains("bread")) {

			str = str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread"));
			System.out.println(str);

		} else
			System.out.println("nothing");
	}
}
