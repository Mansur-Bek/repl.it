package solutions;

import java.util.Scanner;

public class Repl_051_Tip_Calculator {
	public static void main(String[] args) {
		int numberOfPeople;
		double checkAmount, tip = 0;
		String serviceQuality;
		String split;

		Scanner scan = new Scanner(System.in);
		System.out.println("Split:");
		split = scan.next();

		System.out.println("Number of people:");
		numberOfPeople = scan.nextInt();

		System.out.println("Check amount:");
		checkAmount = scan.nextDouble();

		System.out.println("Service Quality:");
		serviceQuality = scan.next();
		serviceQuality = serviceQuality.toLowerCase();

		switch (serviceQuality) {
		case "excellent":
			tip = ((25 * checkAmount) / 100);
			checkAmount += tip;
			break;
		case "great":
			tip = ((20 * checkAmount) / 100);
			checkAmount += tip;
			break;
		case "good":
			tip = ((15 * checkAmount) / 100);
			checkAmount += tip;
			break;
		case "fair":
			tip = ((10 * checkAmount) / 100);
			checkAmount += tip;
			break;
		case "poor":
			tip = ((5 * checkAmount) / 100);
			checkAmount += tip;
			break;
		default:
			System.out.println("invalid entry");
			break;
		}

		double tipPerPerson = tip / numberOfPeople;
		double totalPerPerson = checkAmount / numberOfPeople;
		String weird = "&";
		for (int i = 1; i < numberOfPeople; i++) {
			weird = weird + "&";
		}

		System.out.println("Number of people entered: " + weird);
		System.out.println("Total to pay: " + checkAmount);
		System.out.println("Total tip: " + tip);
		System.out.println("Total per person: " + totalPerPerson);
		System.out.println("Tip per person: " + tipPerPerson);
	}
}

//Write your code inside the method.
//Use the values given as method parameters.
//Assign final values.
//Then user should select service quality that will correspond to tip percent.
//Poor = 5%
//Fair = 10%
//Good = 15%
//Great = 20%
//Excellent = 25% 
//The program should display the following information based on the user input: 
//Split or No split
//Number of people entered: &&&&
//Service Quality: 
//Total to pay:
//Total tip:
//Total per person:
//Tip per person:
//https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8
//
//Input: 
//Split:Yes
//Number of people:4
//Check amount:476.0
//Service Quality:Excellent
//
//Output:
// 
//Number of people entered: &&&&
//Total to pay: 595.0
//Total tip: 119.0
//Total per person: 148.75
//Tip per person: 29.75
