package Part_13;

import java.util.Arrays;

public class To2D_Arrays_Chess_Board_134 {

	public static void main(String[] args) {

		 String[][] chessBoard = new String[8][8];
		  
		     for(int i=0;i<8;i++) {
					 char ch='a';
				    for(int j=0;j<8;j++) {
				    	chessBoard[i][j]=i+1+""+ch;
				    	   ch++;	     }
				                      }
		  
		    System.out.println(Arrays.deepToString(chessBoard));
	}
}
