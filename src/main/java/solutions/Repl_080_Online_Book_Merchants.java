package solutions;

import java.util.Scanner;

public class Repl_080_Online_Book_Merchants {
	public static void main(String[] args) {
		int freeBooks = 0;
		Scanner scan = new Scanner(System.in);
		boolean isPremiumCustomer = scan.nextBoolean();
		int nbooksPurchased = scan.nextInt();

		if (isPremiumCustomer) {
			if (nbooksPurchased >= 8) {
				freeBooks += 2;
			} else if (nbooksPurchased >= 5) {
				freeBooks++;
			}
		} else {
			if (nbooksPurchased >= 12) {
				freeBooks += 2;
			} else if (nbooksPurchased >= 7) {
				freeBooks++;
			}
		}

		System.out.println(freeBooks);

	}
}
