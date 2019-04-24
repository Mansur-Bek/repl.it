package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_124_Arrays_Zombie_Attack_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		int[] inhabitants = { 3, 6, 0, 4, 3, 2, 7, 0 };
		int[] inhabitants = { 0, 20, 0, 20, 20, 10, 0, 10 };
//		int[] inhabitants = { 10, 0, 20, 4, 0, 1, 6, 0 };
//		for (int i = 0; i < inhabitants.length; i++) {
//			inhabitants[i] = input.nextInt();
//		}
//		[0, 0, 0, 0, 0, 1, 0, 0]
		// TODO. Write you code below this line.
		int day = 0;
		int sum = 1;
		boolean changedPrevious = false;
		System.out.println("Day " + day++ + " " + Arrays.toString(inhabitants));
		while (sum != 0) {
			sum = 0;
			for (int index = 0; index < inhabitants.length; index++) {
				if (index >= inhabitants.length - 1) {
					if (inhabitants[index - 1] == 0) {
						inhabitants[index] = inhabitants[index] / 2;
					}
				} else if (index == 0) {
					if (inhabitants[index + 1] == 0) {
						inhabitants[index] = inhabitants[index] / 2;
					}
				} else {
					if (inhabitants[index] != 0) {
						if (inhabitants[index + 1] == 0) {
							inhabitants[index] = inhabitants[index] / 2;
						} else if (inhabitants[index - 1] == 0 && !changedPrevious) {
							inhabitants[index] = inhabitants[index] / 2;
							if (inhabitants[index] == 0)
								changedPrevious = true;
						}
					}
				}
			}
			changedPrevious = false;
			sum = 0;
			for (int p : inhabitants) {
				sum += p;
			}
			System.out.println("Day " + day++ + " " + Arrays.toString(inhabitants));
			if (sum == 0) {
				break;
			}
			sum = 1;
		}
		System.out.println("---- EXTINCT ----");
	}

//	
}
