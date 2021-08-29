package Part_6;

import java.util.Scanner;

public class Tip_Calculator_051 {

	public static void main(String[] args) {

		 double checkAmount;
		 double totalPay;
		 double personPay;
		 double totalTip=0;
		 double personTip;
		 String split;
		 String servQuality;
		 int numofPeople=0;
			
		Scanner scan = new Scanner(System.in);
			
		System.out.println("Split:");
		split= scan.nextLine();
		
		if(split.equalsIgnoreCase("Yes")) {
			System.out.println("Number of people:");
			numofPeople= scan.nextInt();
			
		}else if(split.equalsIgnoreCase("No")) {
			numofPeople=1;
		}
		
		System.out.println("Check amount:");
		checkAmount=scan.nextDouble();
		
		System.out.println("Service Quality:");
		servQuality= scan.next();
		
		if(servQuality.equalsIgnoreCase("Poor")) {
			totalTip=5*checkAmount/100;
			
		}else if(servQuality.equalsIgnoreCase("Fair")) {
			totalTip=10*checkAmount/100;
			
		}else if(servQuality.equalsIgnoreCase("Good")) {
			totalTip=15*checkAmount/100;
			
		}else if(servQuality.equalsIgnoreCase("Great")) {
			totalTip=20*checkAmount/100;
			
		}else if(servQuality.equalsIgnoreCase("Excellent")) {
			totalTip=25*checkAmount/100;
		}
		
		totalPay=checkAmount+ totalTip;
		String dummy="";
        for(int i=1; i<=numofPeople; i++) {
			
			dummy = dummy +"&";                                     
		}
        
		System.out.println("Number of people entered: " + dummy);
		System.out.println("Total to pay: "+totalPay);
		System.out.println("Total tip: " +totalTip);
		System.out.println("Total per person: " +(checkAmount+ totalTip)/numofPeople);
		System.out.println("Tip per person: " +totalTip/numofPeople );
	}
}
