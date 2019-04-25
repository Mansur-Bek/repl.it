package solutions;

import java.util.Scanner;

public class Repl_125_Arrays_Average_temperature {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = 0;
		double total = 0;
		double avgTemp = 0;
		double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
				scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble() };
		double[] temperture = new double[8];
		// System.out.println("Enter 7 temperatures:");
		// double total =0;
		for (k = 0; k < 8; k++) {

			total = total + temps[k];
		}
		avgTemp = total / 8;
		System.out.println(avgTemp);
	}
}
