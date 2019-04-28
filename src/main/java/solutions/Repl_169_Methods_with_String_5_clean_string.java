package solutions;

public class Repl_169_Methods_with_String_5_clean_string {
	public static String clean(String text, String badWord) {
		text = text.replace(badWord, "");
		return text;

	}
}
