package misc;

public class ReverseVowels {
	public String reverseVowels(String str1) {
		int j = 0;
		// Storing the vowels separately
		char[] str = str1.toCharArray();
		String vowel = "";
		for (int i = 0; i < str.length; i++) {
			char c = str[i];
			if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
					|| c == 'U') {
				j++;
				vowel += str[i];
			}
		}

		// Placing the vowels in the reverse
		// order in the string
		for (int i = 0; i < str.length; i++) {
			char c = str[i];
			if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
					|| c == 'U') {
				str[i] = vowel.charAt(--j);
			}
		}

		return String.valueOf(str);
	}

}
