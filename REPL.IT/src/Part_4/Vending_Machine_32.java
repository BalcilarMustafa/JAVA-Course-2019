package Part_4;

import java.util.Scanner;

public class Vending_Machine_32 {

	public static void main(String[] args) {

		int itemPrice;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int remain;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter price in cents:");
		itemPrice=keyboard.nextInt();
		System.out.println("");
		
		if(itemPrice%5!=0) {
		System.out.println("Invalid price!");
		
	                    }else {
				               if(itemPrice<25||itemPrice>100) {
					              System.out.println("Invalid price!");
					                  
				                                }else {
				                                  remain=100-itemPrice;
				                                  quarters=remain/25; 
				                                  remain=remain%25; 
				                                  dimes=remain/10; 
				                                  remain=remain%10;     
				                                  nickels=remain/5;  	
				                                                    	
System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, and "+nickels+" nickels.");
				                                        }
			
	                           }
	}
}
