package misc;

import java.util.Scanner;

public class ReplfirstAndLastLetter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		String[] arr = { "hello", "why", "by", "apple", "note" };
		String[] arr = { scan.next(), scan.next(), scan.next(), scan.next(), scan.next() };
//		word.length()-1 - index of last letter
		for (String word : arr) {
			System.out.println(word.charAt(0) + "" + word.charAt(word.length() - 1));
		}
		System.out.println();
//		public final int = 5;
		for (int index = 0; index < arr.length; index++) {
			System.out.println(arr[index].charAt(0) + "" + arr[index].charAt(arr[index].length() - 1));
		}
	}
}
