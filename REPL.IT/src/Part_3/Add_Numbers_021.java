package Part_3;

import java.util.Scanner;

public class Add_Numbers_021 {

	public static void main(String[] args) {

		 int num1;
		 int num2;
		 int num3;
		 System.out.println("Enter 3 numbers:");
		 Scanner sc = new Scanner(System.in);
		   num1=sc.nextInt();
		   num2=sc.nextInt();
		   num3=sc.nextInt();
		    
		   int sum=num1+num2+num3;
		   System.out.println("Sum of numbers: "+sum);
	}
}
