package solutions;

import java.util.Scanner;

public class Repl_030_Seconds_Converter {
	public static void main(String[] args) {
		// YOUR CODE HERE:
		int seconds, minutes, hours, inputSeconds;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter seconds:");
		inputSeconds = keyboard.nextInt();
		hours = inputSeconds / 3600;
		inputSeconds %= 3600;

		minutes = inputSeconds / 60;
		seconds = inputSeconds % 60;

		System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");

	}
}

//Write a program that outputs the number of hours, minutes, and seconds that
//corresponds to input total seconds. 
//
//-create a Scanner object
//- declare int variables inputSeconds, hours, minutes, seconds
//-Ask user enter seconds by printing:
//"Enter seconds:"
//
//-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
//-Assign values to the hours, minutes, seconds variables
//-Display the result.
//
//Example run:
//Enter seconds:
//3695
//1 hours, 1 minutes, and 35 seconds