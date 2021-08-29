package Part_3;

import java.util.Scanner;

public class Shopping_ListI_022 {

	public static void main(String[] args) {

		String item1;
	    String item2;
	    String item3;
	    String report;
	    Double price1;
	    Double price2;
	    Double price3;
	    Double totalPrice;
	   
	     Scanner scan = new Scanner(System.in);
	      System.out.println("Enter Item1 and its price:");
	      item1=scan.nextLine();
	      price1=scan.nextDouble();
	      scan.nextLine();
	       System.out.println("Enter Item2 and its price:");
	      item2=scan.nextLine();
	      price2=scan.nextDouble();
	      scan.nextLine();
	       System.out.println("Enter Item3 and its price:");
	      item3=scan.nextLine();
	      price3=scan.nextDouble();
	     
	    
	      totalPrice=price1+price2+price3;
	             
	      report=("Item1: "+item1+" Price: "+price1+","+" Item2: "+item2+" Price: "+price2+","+" Item3: "+item3+" Price: "+price3);
	       System.out.println(report);
	      System.out.println("Total price: "+ totalPrice);

	}
}
