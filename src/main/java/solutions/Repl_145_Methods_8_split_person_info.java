package solutions;

import java.util.Scanner;

public class Repl_145_Methods_8_split_person_info {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String s = inp.next();
		person(s);
	}

	public static void person(String info) {
		String arr[] = info.split(",");
		System.out.println("person name: " + arr[0] + " last name: " + arr[1] + " age: " + arr[2]);
		// your code here

	}// end person

}
