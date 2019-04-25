package misc;

import java.util.Scanner;

final public class PatientInfo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String firstName, lastName, fullName, email, street, state, city, address, contacts;
		int age, zipcode;
		double height, weight;
		boolean isMarried;
		long workPhoneNumber, personalPhoneNumber;
		
		System.out.println("Welcome to the patient portal!");
		System.out.println("Please enter your personal information");
		System.out.println("Enter your first name");
		firstName = scan.nextLine();
		System.out.println("Enter your last name");
		lastName = scan.nextLine();
		System.out.println("Enter your email");
		email = scan.nextLine();
		System.out.println("Enter your street");
		street = scan.nextLine();

		System.out.println("Enter your city");
		city = scan.nextLine();

		System.out.println("Enter your state");
		state = scan.nextLine();

		System.out.println("Enter your zip code");
		zipcode = scan.nextInt();
		
		System.out.println("Enter your work phone number");
		workPhoneNumber = scan.nextLong();

		System.out.println("Enter your personal phone number");
		personalPhoneNumber = scan.nextLong();

		System.out.println("Enter your age");
		age = scan.nextInt();

		System.out.println("Enter your height");
		height = scan.nextDouble();

		System.out.println("Enter your weight");
		weight = scan.nextDouble();

		System.out.println("Are you married?");
		isMarried = scan.nextBoolean();

		
		
		contacts = "work phone number - "+workPhoneNumber+", personal phone number - "+personalPhoneNumber+", email: "+email;
		address = street+", "+ city+", "+ state+" "+zipcode;
		fullName = lastName+", "+firstName;
		
		System.out.println("Patient personal information");
		System.out.println("Full name: "+fullName);
		System.out.println("Address: "+address);
		System.out.println("Contacts: "+contacts);
		System.out.println("Age: "+age);
		System.out.println("Height: "+height);
		System.out.println("Weight: "+weight+" pounds");
		System.out.println("Married?: "+isMarried);
		
		long x = 10;
		int y = 5;
		y = (int) (y *x);
		
//		-build contacts variable by concatenating Strings and 2 Long variables
//		-build fullName variable by concatenating Strings
//		-build address variable by concatenating Strings and int

//		"Patient personal information"
//		"Full name: May, James"
//		"Address: 7925 Jones Branch Dr, McLean, VA 22102"
//		"Contacts: work phone number - 7896542314, personal phone number - 2406542314, email: jamesmay@gmail.com"
//		"Age: 35"
//		"Height: 5.10"
//		"Weight: 173.2 pounds"
//		"Married?: true"
		
	

		
	}

}
