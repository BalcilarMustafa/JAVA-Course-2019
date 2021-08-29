package Part_12;

import java.util.Arrays;

public class To2D_Arrays_Multiplication_Table_128 {

	public static void main(String[] args) {

		 int [][] multiplicationTable = new int[10][10];
		    
		    
		     for(int i=0;i<10;i++) { 
						for(int j=0;j<10;j++) { 
							multiplicationTable[i][j]=((j+1)*(i+1));
						                       }
						            }
		    System.out.println(Arrays.deepToString(multiplicationTable) ) ;
	}
}
