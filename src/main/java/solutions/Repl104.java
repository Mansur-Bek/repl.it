package solutions;

public class Repl104 {
	public static void main(String[] args) {
		int total=0;
		int k=1;
		do{
		    total += k*k;
		    k++;
		}while (k<=50);
		System.out.println(total);
	}
}
