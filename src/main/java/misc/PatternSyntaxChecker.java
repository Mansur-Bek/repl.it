package misc;

import java.util.regex.Pattern;

public class PatternSyntaxChecker {
	public static void main(String[] args) {

		String pattern = "batcatpat(nat";
		// Write your code
		try{
            Pattern.compile(pattern);
            System.out.println("Valid");
        }catch(Exception e){
            System.out.println("Invalid");
        }

	}
}
