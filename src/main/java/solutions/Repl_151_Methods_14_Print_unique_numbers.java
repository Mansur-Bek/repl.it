package solutions;

import java.util.Scanner;

public class Repl_151_Methods_14_Print_unique_numbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		printUniqueNumbers(nums);
	}

	public static void printUniqueNumbers(int[] nums) {
		// WRITE YOUR CODE HERE
		String temp = "";
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j])
					count++;
			}
			if (count == 1)
				temp += nums[i] + " ";
		}
		temp = temp.replaceAll(" ", "\n");
		System.out.print(temp);

	}
}
