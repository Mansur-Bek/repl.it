package solutions;

import java.util.Scanner;

public class Repl_073_Build_a_route {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String start = scan.next();
		String end = scan.next();

		if (start.equalsIgnoreCase(end)) {
			System.out.println(end + " found");
		} else {

			switch (start.toUpperCase()) {
			case "A":
				System.out.println(end.equalsIgnoreCase("B") ? "right: B found"
						: end.equalsIgnoreCase("C") ? "right > down: C found"
								: end.equalsIgnoreCase("D") ? "right > down > left: D found" : "");
				break;
			case "B":
				System.out.println(end.equalsIgnoreCase("C") ? "down: C found"
						: end.equalsIgnoreCase("D") ? "down > left: D found"
								: end.equalsIgnoreCase("A") ? "down > left > up: A found" : "");
				break;
			case "C":
				System.out.println(end.equalsIgnoreCase("D") ? "left: D found"
						: end.equalsIgnoreCase("A") ? "left > up: A found"
								: end.equalsIgnoreCase("B") ? "left > up > right: B found" : "");
				break;
			case "D":
				System.out.println(end.equalsIgnoreCase("A") ? "up: A found"
						: end.equalsIgnoreCase("B") ? "up > right: B found"
								: end.equalsIgnoreCase("C") ? "up > right > down: C found" : "");
				break;

			}
		}

	}
}

//Write a program that will print out rout instructions. Your program should take 2 parameters: start point and end point. Use left, right, up and down for navigation. Insert ">" between commands. If start point equals to end point - display: "start/end(start or end variable!) found".
//Note: you may move only clock wise.
//
//Example:
//Input: A
//Input: D
//Output: right > down > left: D found
//
//Example:
//Input: C
//Input: C
//Output: C found