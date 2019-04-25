package solutions;

public class Repl_165_Methods_with_String_1_merge_them {
	public static String mergeStrings(String one, String two) {
		String merged = "";
		if (one.length() > two.length()) {
			for (int i = 0; i < two.length(); i++)
				merged += "" + one.substring(i, i + 1) + two.substring(i, i + 1);
			merged += one.substring(two.length());
		} else {
			for (int i = 0; i < one.length(); i++)
				merged += "" + one.substring(i, i + 1) + two.substring(i, i + 1);
			merged += two.substring(one.length());
		}
		return merged;
	}

}
