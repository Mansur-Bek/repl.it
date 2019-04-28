package solutions;

import java.util.Scanner;

public class Repl_054_Find_a_user {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// WRITE YOUR CODE HERE
		System.out.println("Enter full name:");
		String name = scan.nextLine();
		if (name.toLowerCase().equals("max payne")) {
			System.out.println("User found!");
		} else if (name.toLowerCase().equals("alan wake")) {
			System.out.println("User found!");
		} else {
			System.out.println("User not found!");
		}
	}
}

//Write a program that will look up for user. 
//
//Assume that you have only 2 users: Max Payne and Alan Wake.  First, ask user to enter full name. Display message: "Enter full name:". Then take input from user. If name is equals to either "Max Payne" or "Alan Wake",  display message: "User found!". Otherwise,  display message: "User not found!". Please make your search case insensitive!
//
//Example:
//Display message: Enter full name:
//input: Max Payne
//Display message: User found!
