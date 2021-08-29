package Part_12;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Convert_Decimal_to_Binary_123 {

	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);
		    
		    int decimal = input.nextInt();
		    int[] binary = new int[8];
		    
		     for(int i=0;decimal>0;i++) {
			    	   binary[i] = decimal % 2; 
			            decimal = decimal / 2;    
			                            }
			        int n=0;
				    for(int j=0;j<binary.length/2;j++) {
				    	int temp = binary[j];
				    	binary[j]=binary[binary.length-1-n];
				    	binary[binary.length-1-n]=temp;
				    	n++;
				                                        }
				    System.out.println(Arrays.toString(binary));
	}
}
