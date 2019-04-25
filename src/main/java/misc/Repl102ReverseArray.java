package misc;

import java.util.Arrays;

public class Repl102ReverseArray {
	public static void main(String[] args) {
		String sentence = "Java is fun";
		String[] words = sentence.split(" ");
//		for (String word : words) {
//			System.out.println(word);
//		}
		System.out.println(Arrays.toString(words));
		System.out.println();
		
		
		
		
		for (int index = words.length-1; index >= 0; index--) {
			System.out.println(words[index]);
		}
		
		
		
		System.out.println();
		for(int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}

	}
}
