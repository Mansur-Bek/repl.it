package misc;

import java.util.Arrays;

public class IsAnagram {
	public static void main(String[] args) {
		String a = "abcde";
		String b = "xyzabwf";
		System.out.println(isAnagram(a, b));
		System.out.println(sort(b));
		System.out.println(selectionSort(b));
	}

	static boolean isAnagram(String a, String b) {
		// Complete the function
		if (a.length() != b.length() || a.length() < 1) {
			return false;
		}
		int counter = 0;

		System.out.println(counter);
		return counter % 2 > 0;
	}

	public static String sort(String word) {
		char[] arr = word.toLowerCase().toCharArray();
		for (int i = 0; i < arr.length - 1; i++) {
			while (arr[i] > arr[i + 1]) {
				char temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				i = 0;
			}
		}
		return new String(arr);
	}

	public static String selectionSort(String word) {
		char[] arr = word.toLowerCase().toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return new String(arr);
	}

}
