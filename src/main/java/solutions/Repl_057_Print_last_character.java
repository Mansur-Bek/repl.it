package solutions;

import java.util.Scanner;

public class Repl_057_Print_last_character {
	public static void main(String[] args) {
	    //DO NOT CHANGE
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //WRITE YOUR CODE HERE
	    int lastChar = word.length()-1;
	    System.out.println(word.charAt(lastChar));
	  }
}

//Write a program that will print out last letter of the word (string).
