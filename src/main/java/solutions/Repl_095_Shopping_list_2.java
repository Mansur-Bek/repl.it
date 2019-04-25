package solutions;

import java.util.Scanner;

public class Repl_095_Shopping_list_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String continues = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;

		while (count <= 10 && !continues.equalsIgnoreCase("no")) {
			System.out.println("Enter Item" + count + " and its price:");
			item = scan.next();
			price = scan.nextDouble();
			totalPrice += price;
			System.out.println("Add one more item?");
			continues = scan.next();
			shoppingListReport += "Item" + count + ": " + item + " Price: " + price;
			if (!continues.equalsIgnoreCase("no")) {
				shoppingListReport += ", ";
			}
			count++;
		}
		System.out.println(shoppingListReport);
		System.out.println("Total price: " + totalPrice);
	}
}
