package Part_4;

import java.util.Scanner;

public class Nums_037 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
	    System.out.println("Enter 2 numbers:");
	    int num1 = input.nextInt();
	    int num2 = input.nextInt();
	    
	     if(num1>num2) {
		    	System.out.println(num1+" is greater than "+num2);
		   }else if(num2>num1) {
			   System.out.println(num2+" is greater than "+num1);
		   }else {
			   System.out.println(num1+" and "+num2+" are equal");
		   }
	}
}
