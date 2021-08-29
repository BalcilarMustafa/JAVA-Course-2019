package Part_5;

import java.util.Scanner;

public class Burger_Chicken_045 {

	public static void main(String[] args) {

		 Scanner s = new Scanner(System.in);
		    
		    String in = s.next();
		    float price;
				 
				 if (in.equals("burger")||in.equals("chicken")) {
					 price=10;
					 System.out.println("output:"+ price);
				 												} 
				 if (in.equals("soda")) {
					 price=2;
					 System.out.println("output:"+ price);
				 						} 
	}
}
