package solutions;

public class CountClamps {
	public static void main(String[] args) {
		int[] nums = {1, 2, 2, 3, 4, 4};
		int size = 0;
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					counter++;
				}
			}
			if (counter > 0) {
				size++;
			}
			counter = 0;
		}
		System.out.println(size);
	}
}
