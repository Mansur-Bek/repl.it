package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_123_Arrays_Zombie_Attack_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] inhabitants = new int[8];
		for (int i = 0; i < inhabitants.length; i++) {
			inhabitants[i] = input.nextInt();
		}

		// TODO. Write you code below this line.
		int day = 0;
		int sum = 0;

		do {
			System.out.println("Day " + day + " " + Arrays.toString(inhabitants));

			for (int i = 0; i < inhabitants.length; i++) {
				inhabitants[i] = inhabitants[i] / 2;
			}
			sum = 0;
			for (int i = 0; i < inhabitants.length; i++) {
				sum = sum + inhabitants[i];
			}
			day++;
			if (sum == 0) {
				System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
			}

		} while (sum != 0);

		System.out.println("---- EXTINCT ----");

	}
}
