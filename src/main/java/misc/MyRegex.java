package misc;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.function.Predicate;

public class MyRegex implements Predicate<MyRegex>{

//	public static String pattern = "([0-2])([0-5])([0-5]).([0-2][0-5][0-5]).([0-2][0-5][0-5]).([0-2][0-5][0-5])";
	public static String pattern = "[0-2][0-5][0-5].[0-2][0-5][0-5].[0-2][0-5][0-5].[0-2][0-5][0-5]";

	public static void main(String[] args) {

		String IP = "000.122.234.233";
		System.out.println(IP.matches(new MyRegex().pattern));
		StringBuilder s = new StringBuilder("yoodler");
		s.append(false);
		System.out.println(s);
		LocalDateTime.now();
		int y=-Integer.MAX_VALUE;
		System.out.println(y);
		int i = 123123123;
		float ii = i;

	}

	@Override
	public boolean test(MyRegex t) {
		// TODO Auto-generated method stub
		return false;
	}

}
