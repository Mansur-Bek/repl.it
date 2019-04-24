package solutions;

import java.util.Scanner;

public class Repl_153_Methods_16_Check_if_number_is_palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		isPalindrome(num);
	}

	public static void isPalindrome(int num) {
		int reversedNum = 0;
		int originalNum = num;
		while (num != 0) {
			reversedNum = reversedNum * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(originalNum == reversedNum);

	}
}
