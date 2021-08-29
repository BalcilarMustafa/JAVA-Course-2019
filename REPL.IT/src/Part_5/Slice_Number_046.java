package Part_5;

import java.util.Scanner;

public class Slice_Number_046 {

	public static void main(String[] args) {

		int num, digit1, digit2, digit3, digit4, digit5;
	   
	    int remain1, remain2, remain3;
	    
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter your number:");
		 	num = scan.nextInt();
	
			digit1=num/10000;
			remain1 = num%10000;
			
			System.out.println(digit1);
			
			num=remain1;
		
			digit2=num/1000;
			remain2=num%1000;
			
			System.out.println(digit2);
			
			num=remain2;
			
			digit3=num/100;
			remain3 = num%100;
			
			System.out.println(digit3);
			
			num=remain3;
			
			digit4=num/10;
			digit5 = num%10;
			
			System.out.println(digit4);
			System.out.println(digit5);
	}
}
