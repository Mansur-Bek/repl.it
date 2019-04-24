package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_119_Arrays_convert_decimal_to_binary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int decimal = input.nextInt();
		int[] binary = new int[8];

		// TODO: Write your code below.
		for (int j = binary.length - 1; j >= 0; j--) {
			binary[j] = decimal % 2;
			decimal = decimal / 2;
		}
		System.out.println(Arrays.toString(binary));

	}
}
