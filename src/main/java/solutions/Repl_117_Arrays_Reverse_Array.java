package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_117_Arrays_Reverse_Array {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
				input.nextInt(), input.nextInt() };

		// TODO: write your code below

		int a = nums.length - 1;

		for (int i = 0; i < nums.length / 2; i++) {

			int temp = nums[i];
			nums[i] = nums[a];
			nums[a] = temp;
			a--;
		}

		// Do not change below statement:
		System.out.println(Arrays.toString(nums));

	}
}
