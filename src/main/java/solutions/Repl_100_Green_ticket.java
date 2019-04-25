package solutions;

import java.util.Scanner;

public class Repl_100_Green_ticket {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int prize = 0;
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int count = 0;
		int[] ticket = { a, b, c, d };
		for (int i = 0; i < ticket.length; i++) {
			count = 0;
			for (int j = 0; j < ticket.length; j++) {
				if (ticket[i] == ticket[j]) {
					count++;

					if (count > 1)

						prize = (count - 1) * 10;

				}

			}
		}
		System.out.println(prize);
	}
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int prize = 0;
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int c = scan.nextInt();
//		int d = scan.nextInt();
//		if (a == b && b == c && c == d)
//			prize += 30;
//		else if ((a == b && b == c && c != d) || (a != b && b == c && c == d) || (a == c && b != c && c == d))
//			prize += 20;
//		else if (a == b || a == c || a == d || b == c || b == d || c == d)
//			prize += 10;
//		else
//			prize = 0;
//		System.out.println(prize);
//	}
}
