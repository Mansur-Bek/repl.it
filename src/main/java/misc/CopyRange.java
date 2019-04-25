package misc;

import java.util.Arrays;

public class CopyRange {
	public static void main(String[] args) {
		int[] nums = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
		
		int[] nums2 = Arrays.copyOfRange(nums, 3, 8);
		System.out.println(Arrays.toString(nums2));
	}
}
