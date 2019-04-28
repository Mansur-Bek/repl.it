package solutions;

public class Repl_171_Methods_with_String_7_at_3rd_char {
	public static String at3(String target, String word) {
		return target.substring(0, 3) + word + target.substring(3);
	}
}
