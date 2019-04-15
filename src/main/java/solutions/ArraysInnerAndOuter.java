package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysInnerAndOuter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sizeInner = scan.nextInt();
		int sizeOuter = scan.nextInt();
		int[] inner = new int[sizeInner];
		int[] outer = new int[sizeOuter];
		for (int i = 0; i < sizeInner; i++) {
			inner[i] = scan.nextInt();
		}
		for (int j = 0; j < sizeOuter; j++) {
			outer[j] = scan.nextInt();
		}
		Arrays.sort(inner);
		Arrays.sort(outer);
		// WRITE YOUR CODE HERE
		for (int i : inner) {
			if (Arrays.binarySearch(outer, i) < 0) {
				System.out.println(false);
				return;
			}
		}
		System.out.println(true);
	}
}
