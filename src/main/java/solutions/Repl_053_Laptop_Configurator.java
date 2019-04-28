package solutions;

import java.util.Scanner;

public class Repl_053_Laptop_Configurator {
	public static void main(String[] args) {
		double price = 0;
		String storageType, screenType, cpu, resolution;
		int ram = 0;
		String screenSize;
		int memorySize;
		Scanner scan = new Scanner(System.in);
		// WRITE YOUR CODE HERE

		System.out.println("Select screen size:");
		screenSize = scan.nextLine();
		System.out.println("Select CPU type:");
		cpu = scan.nextLine();
		System.out.println("Select RAM size:");
		ram = scan.nextInt();
		scan.nextLine();

		System.out.println("Select storage type:");
		storageType = scan.nextLine();
		System.out.println("Enter memory size:");
		memorySize = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter screen resolution:");
		resolution = scan.nextLine();
		screenSize = screenSize.toLowerCase();
		switch (screenSize) {
		case "13.3":
			price += 200;
			break;

		case "15.0":
			price += 300;
			break;

		case "17.3":
			price += 400;
			break;

		default:
			System.out.println("not a valid screenSize");
			break;

		}

		cpu = cpu.toLowerCase();
		switch (cpu) {
		case "i3":
			price += 150;
			break;

		case "i5":
			price += 250;
			break;

		case "i7":
			price += 350;
			break;

		default:
			System.out.println("not a valid screenSize");
			break;

		}

		price += (ram / 4) * 50;

		storageType = storageType.toUpperCase();
		switch (storageType) {
		case "HDD":
			price += (memorySize / 500) * 50;
			break;

		case "SSD":
			price += (memorySize / 500) * 100;
			break;

		default:
			System.out.println("not a valid storageType");
			break;

		}

		resolution = resolution.toLowerCase();
		switch (resolution) {
		case "fullhd":
			price += 100;
			break;

		case "4k":
			price += 200;
			break;

		default:
			System.out.println("not a valid resolution");
			break;

		}

		System.out.println("Laptop price is: $" + price);

	}
}

//Write a program that will calculate laptop price based on the components. 
//
//First ask user for a screen size. If screen size is equals to 13.3, add  $200 to the laptop price. If screen size is equals to  15.0 - add  $300 to the laptop price. If screen size is equals to  17.3 - add  $400 to the laptop price.  Then ask user for CPU type. If CPU type equals to i3, add  $150 to the laptop price. If CPU type equals to i5, add  $250 to the laptop price. If CPU type equals to i7, add  $350 to the laptop price. Then ask user for RAM size. Add  $50 for every 4GB of ram to the laptop price. Then, ask user for storage type. There are 2 options: SSD and HDD. If it's HDD - add $50 to the laptop price for every 500gb.  If it's SSD - add $100 to the laptop price for every 500GB. Then ask user for for screen resolution. There are 2 options: FULLHD and 4K. Add $100 if it's FULLHD screen and $200 if it's 4K screen.
//Example:
// 
//Display message: Select screen size:
//input: 13.3
//Display message: Select CPU type:
//input: i7
//Display message: Select RAM size:
//input: 8
//Display message: Select storage type:
//input: SSD
//Display message: Enter memory size:
//input: 1000
//Display message: Enter screen resolution:
//input: 4K
//Display message: Laptop price is: $1050.0
//Example #2
// 
//Display message: Select screen size:
//input: 13.3
//Display message: Select CPU type:
//input: i3
//Display message: Select RAM size:
//input: 4
//Display message: Select storage type:
//input: HDD
//Display message: Enter memory size:
//input: 500
//Display message: Enter screen resolution:
//input: FULLHD
//Display message: Laptop price is: $550.0
