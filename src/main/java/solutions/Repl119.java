package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class Repl119 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int decimal = input.nextInt();
		int[] binary = new int[8];

		// TODO: Write your code below.

		for (int i = binary.length - 1; i >= 0; i--) {
			binary[i] = decimal % 2;
			decimal = decimal / 2;
		}

		System.out.println(Arrays.toString(binary));

	}
}
