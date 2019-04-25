package solutions;

import java.util.Scanner;

public class Repl_114_Arrays_has_55 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() };

		// TODO Type your code below:
		boolean z = false;
		for (int x = 0; x < nums.length - 1; x++) {
			if (nums[x] == 5 && nums[x + 1] == 5) {
				z = true;
				break;

			}
		}
		System.out.println(z);
	}
}
