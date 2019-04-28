package solutions;

import java.util.Scanner;

public class Repl_083_Party {
	public static void main(String[] args) { // virgul meselesi cook onemli

		Scanner input = new Scanner(System.in);

		String yesOrno = "";
		String name = "";
		String nameStore = "";
		do {
			System.out.println("Please enter guest name:");
			name = input.next();
			nameStore = nameStore + name + ", ";
			System.out.println("Do you want to enter new guest name:");
			yesOrno = input.next();
		}

		while (yesOrno.equals("yes"));

		// if()

		System.out.println("Guest's list: " + nameStore.substring(0, nameStore.length() - 2));

	}
}
