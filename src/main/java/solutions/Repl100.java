package solutions;

import java.util.Scanner;

public class Repl100 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int prize = 0;
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		if (a == b && b == c && c == d)
			prize += 30;
		else if ((a == b && b == c && c != d) || (a != b && b == c && c == d) || (a == c && b != c && c == d))
			prize += 20;
		else if (a == b || a == c || a == d || b == c || b == d || c == d)
			prize += 10;
		else
			prize = 0;
		System.out.println(prize);
	}
}
