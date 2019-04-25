package solutions;

import java.util.Scanner;

public class Repl_096_Zombie_Attack_1 {
	public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
		
		int inhabitants = scan.nextInt();
		
		int day = 0;
		
		while(inhabitants>0) {
			System.out.println("Day " + day+ " ["+ inhabitants+"]");
			inhabitants=inhabitants/2;
			day++;
		}
    System.out.println("---- EXTINCT ----");
  }
}
