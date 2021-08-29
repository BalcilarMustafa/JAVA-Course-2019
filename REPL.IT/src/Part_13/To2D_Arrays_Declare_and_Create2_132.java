package Part_13;

import java.util.Arrays;

public class To2D_Arrays_Declare_and_Create2_132 {

	public static void main(String[] args) {

		char[][] tictactoe=new char[3][3];
		
		 for(int i=0;i<3;i++) { 
				for(int j=0;j<3;j++) { 
					tictactoe[i][j]=(' ');}
				}
   
         System.out.println(Arrays.deepToString(tictactoe));
	}
}
