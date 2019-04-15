package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class FrontPiece {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] num = new int[size];
		for(int i =0; i < size; i++) {
			num[i] = scan.nextInt();
		}
		int[] n = new int[2];
		if (num.length >= 2) {
			n[0] = num[0];
			n[1] = num[1];
			System.out.println(Arrays.toString(n));
			return;
		}
		System.out.println(Arrays.toString(num));
	}
}
