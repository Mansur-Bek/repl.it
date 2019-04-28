package solutions;

public class Repl_166_Methods_with_String_2_unique {
	public static String uniqueChars(String str) {

		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			if (!newStr.contains("" + str.charAt(i)))
				newStr += str.charAt(i);
		}
		return newStr;
	}
}
