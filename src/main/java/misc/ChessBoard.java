package misc;

import java.util.Arrays;

public class ChessBoard {
	public static void main(String[] args) {
		String[][] chessBoard = new String[8][8];
		int counter = 0;
		for(int i=0; i < 8; i++) {
			for(char j = 'a'; j <='h' ; j++) {
				chessBoard[i][counter++] = (i+1)+String.valueOf(j);
			}
			counter=0;
		}
		// DO NOT CHANGE
		System.out.println(Arrays.deepToString(chessBoard));
	}
}
