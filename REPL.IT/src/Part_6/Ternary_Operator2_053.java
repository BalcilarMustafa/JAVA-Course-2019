package Part_6;

import java.util.Scanner;

public class Ternary_Operator2_053 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
	    System.out.println("Enter number1:");
			int num1 = scan.nextInt();
			
			System.out.println("Enter number2:");
			int num2 = scan.nextInt();
			
			System.out.println(num1>num2 ? num1 : num2);
	}
}
