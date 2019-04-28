package solutions;

import java.util.Scanner;

public class Repl_078_Alejandro2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();

		if (a.contains("project"))
			System.out.print("read this mail");
		else
			System.out.print("dont read");

		// your code here

	}
}

//as alejandros time is precious and even with his little knowledge of programming he manged to save some time. but still he had a lot of emails to read.
//
//he wants to add more conditions to his program, he wants only job related mails so he will narrow it down by also checking if the word "project" also appears beside his name, that way he will be sure its a job email that refers to him.
// 
//
//for example:
//
//a = "dear alejandro.....alot of text"
//
//outputs: "dont read"
//
//a = "thunder blaz is the best drink in the galaxy..."
//
//outputs: "dont read"
//
//a = "subject : important project, alejandro we refer to you  this ...."
//
//outputs: "read this mail"
//
//hint: you can use the && operator in an if to check for two conditions that must be true.
//or you can create a variable that will hold the  "dont read" or "read this mail" string
//and use it with two ifs that way you will have one output after checking two conditions (output the string after the two ifs).
