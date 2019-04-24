package solutions;

import java.util.Scanner;

public class Repl_149_Methods_12_Time_Conversion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		timeConversion(scan.nextLine());
	}

	public static void timeConversion(String s) {
		String pmOrAm = s.substring(0, s.length() - 2);

		int hour = Integer.parseInt(pmOrAm.substring(0, pmOrAm.indexOf(':')));
		if (s.contains("PM") && hour == 12)
			System.out.println("00" + pmOrAm.substring(pmOrAm.indexOf(':')));
		else if (s.contains("PM"))
			System.out.println((hour + 12) + pmOrAm.substring(pmOrAm.indexOf(':')));
		else
			System.out.println(pmOrAm);

	}
	
}
