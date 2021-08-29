package Part_4;

import java.util.Scanner;

public class Video_Game_Coupons_034 {

	public static void main(String[] args) {

		int coupons;
		int candies;  //10 coupons
		int gumballs;  //3 coupons
		int remain;
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Enter number of coupons:");
		coupons=scan.nextInt();
		
		if(coupons<3) {
			System.out.println("Not enough coupons");
		}else {
		
		candies=coupons/10; 
		remain=coupons%10; 
		gumballs=remain/3;
		
		System.out.println("Number of Candies: "+candies);
		System.out.println("Number of Gumballs: "+gumballs);
		
		}
	}
}
