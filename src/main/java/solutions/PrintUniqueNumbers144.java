package solutions;

public class PrintUniqueNumbers144 {
	public static void main(String[] args) {

		int[] nums = { 2, 5, 5, 6, 3, 6, 9, 34, 3 };

		printUniqueNumbers(nums);
	}

	public static void printUniqueNumbers(int[] nums) {
		int count = 0;
		int num = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					num = nums[i];
					count++;
				}
			}

			if (count == 1) {
				System.out.println(num);
			}
			count = 0;
		}
	}

	public static void printUniqueWords(String[] words) {
		// WRITE YOUR CODE HERE

		int count = 0;
		String word = "";
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					word = words[i];
					count++;
				}
			}

			if (count == 1) {
				System.out.println(word);
			}
			count = 0;
		}
	}
}
