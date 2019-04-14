package solutions;

import java.util.Arrays;

public class ReverseWord {
	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 42, 3, 4, 56 };
		System.out.println(Arrays.toString(numbers));
		String[] words = { "asd" };
		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].charAt(0) + "" + words[i].charAt(words[i].length() - 1);
		}

	}
}
