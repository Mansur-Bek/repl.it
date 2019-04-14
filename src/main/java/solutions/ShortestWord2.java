package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestWord2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] words = str.split(", ");
		String shortest = words[0];
		for(String s: words) {
			if(shortest.length()>s.length()) {
				shortest = s;
			}
		}
		int lengthOfShort = shortest.length();
		int count = 0;
		for(String s: words) {
			if(lengthOfShort == s.length()) {
				count++;
			}
		}
		String[] arr = new String[count];
		int r = 0;
		for(String s: words) {
			if(lengthOfShort == s.length()) {
				arr[r] = s;
				r++;
			}
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}
}
