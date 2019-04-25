package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_136_Arrays_Shift_Left {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		scan.close();
		int temp = 0;
		temp = nums[0];
		for (int i = 1; i < nums.length; i++) {

			nums[i - 1] = nums[i];
		}
		nums[nums.length - 1] = temp;
		System.out.println(Arrays.toString(nums));

	}
}
