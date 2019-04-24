package solutions;

public class CheckIfNumberIsPalindrome {
	public static void main(String[] args) {
		int num = 9987899;
		isPalindrome(num);
	}

	public static void isPalindrome(int num){
	    //WRITE YOUR CODE HERE
	    int reversedNum = 0;
	    int original = num;
	    while (num!=0){
	      reversedNum = reversedNum*10 + num%10;
	      num = num/10;
	      System.out.println(reversedNum);
	    }
	    System.out.println("Reversed: "+reversedNum+" Original: "+original);
	    System.out.println(reversedNum == original);
	  }
}
