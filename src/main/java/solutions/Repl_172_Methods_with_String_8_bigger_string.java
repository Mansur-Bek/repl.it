package solutions;

public class Repl_172_Methods_with_String_8_bigger_string {
	public static String biggerS(String a, String b) {
		return (a.length() > b.length()) ? a : b;
	}
}

//the method gets two strings and return the longest one
//
//biggerS("apple","orange") ==> "orange"