package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_128_Arrays_Make_Last {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int size = scan.nextInt();

		int[] nums = new int[size];
		// int last=0;
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		// WRITE YOUR CODE HERE
		int len = size * 2;
		int[] arr = new int[len];
		arr[len - 1] = nums[nums.length - 1];
		System.out.println(Arrays.toString(arr));

	}
}
