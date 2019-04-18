package solutions;

import java.util.Arrays;

public class PrintValues {
	public static void main(String[] args) {
		char[][] tictactoe = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
		int [][][] values = { 
				 {  {5,5,5,5}, {5,5,5,5}   },
				 {  {7,7,7,7}, {7,7,7,7}   },
				 {  {8,8,8,8}, {30,31,32,33}   }
			};
		System.out.println(Arrays.deepToString(values));
	}
}
