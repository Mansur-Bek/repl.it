package misc;

public class TimeConversion {
	public static void main(String[] args) {
//		System.out.println(timeConversion("06:40:03AM"));
		System.out.println(primeDigitSums(6));
	}
	static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String time = "";
        int  hour = Integer.valueOf(s.substring(0, s.indexOf(":")));
        if(s.endsWith("AM")){
             if(hour == 12){
                time = "00"+":"+s.substring(s.indexOf(":")+1, s.indexOf("AM"));
            }else{
                time = "0"+hour+":"+s.substring(s.indexOf(":")+1, s.indexOf("AM"));
            }
        }else{
            if(hour ==12){
                time = hour+":"+s.substring(s.indexOf(":")+1, s.indexOf("PM"));
            }else{
                time = (12+hour)+":"+s.substring(s.indexOf(":")+1, s.indexOf("PM"));
            }
        }
        return time;
    }
	
	   static int primeDigitSums(int n) {
	        /*
	         * Write your code here.
	         */
	        int num = 1;
	        for(int i=0; i < n;i++){
	            num*=10;
	        }
	        int primes = 0;
	        int num2 = num*n;
	        boolean isPrime = true;
	        while(num<num2){
	            for(int i =2; i < num; i++){
	                if(num%i==0){
	                    isPrime= false;
	                    break;
	                }
	            }
	            if(isPrime)
	            	primes++;
	            isPrime = true;
	            num++;
	        }
			return primes;
	    }
}
