package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_129_Arrays_Front_Piece {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] num = new int[size];
		for (int i = 0; i < size; i++) {
			num[i] = scan.nextInt();
		}

		switch (size) {
		case 1:
			System.out.println(Arrays.toString(num));
			break;
		case 2:
			System.out.println(Arrays.toString(num));
			break;

		}
		if (size > 2) {
			System.out.println("[" + num[0] + ", " + num[1] + "]");
		}

	}
}
