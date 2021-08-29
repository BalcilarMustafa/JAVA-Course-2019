package Part_6;

import java.util.Scanner;

public class Ternary_Operator1_052 {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		 
		    System.out.println("Enter number:");
				int x = scan.nextInt();
				
				System.out.println(x>=5 ?  x : -x);
	}
}
