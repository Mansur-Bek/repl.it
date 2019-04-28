package solutions;

public class Repl_167_Methods_with_String_3_cover {
	public static String coverString(String main, String coverME) {
		if (main.contains(coverME))
			return main.replaceAll(coverME, "[" + coverME + "]");
		else
			return "[" + main + "]";

	}
}
