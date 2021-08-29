package Part_3;

import java.util.Scanner;

public class Shopping_ListII_028 {

	public static void main(String[] args) {

		String item1, item2, item3, report;
		double price1, price2, price3, totalPrice;
		int count1, count2, count3;
		String report1,report2,report3;
		Scanner scan = new Scanner(System.in);
		
		 System.out.println("Enter Item1, count and its price:");
		    item1=scan.nextLine(); 
		    count1=scan.nextInt();
		    price1=scan.nextDouble();
		
		    scan.nextLine();
		    System.out.println("Enter Item2, count and its price:");
		    item2=scan.nextLine(); 
		    count2=scan.nextInt();
		    price2=scan.nextDouble();
		    scan.nextLine();
		    
		    
		    System.out.println("Enter Item3, count and its price:");
		    item3=scan.nextLine();
		    count3=scan.nextInt();
		    price3=scan.nextDouble();
		    
		    report=("Item1: " + item1+" Price: "+price1*count1+","+" Item2: " + item2+" Price: "+price2*count2+","+" Item3: " + item3+" Price: "+price3*count3);
		   
		    if(count1==0) {
		    	
		    report=(" Item2: " + item2+" Price: "+price2*count2+","+" Item3: " + item3+" Price: "+price3*count3);
			    
		    }else if(count2==0) {
		    	
			report=("Item1: " + item1+" Price: "+price1*count1+","+" Item3: " + item3+" Price: "+price3*count3);
			
			    }else if(count3==0) {
			    	
			report=("Item1: " + item1+" Price: "+price1*count1+","+" Item2: " + item2+" Price: "+price2*count2);
			    
			    }

			   System.out.println(report);
			   totalPrice=price1*count1+price2*count2+price3*count3;
			    
			    System.out.println("Total price: "+totalPrice);	

	}
}
