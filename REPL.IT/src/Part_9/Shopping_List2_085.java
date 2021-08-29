package Part_9;

import java.util.Scanner;

public class Shopping_List2_085 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String item="";
	    double price=0;
	    double totalPrice=0;
	    String decision;
	    int i=1;
	    String output="";
	 
	 	      do {
	 	    	  if(i==11) {break;}
	 	   	  System.out.println("Enter Item"+i+ " and its price:");
	 	         item=scan.nextLine();
	 	         price=scan.nextDouble();
	 	         scan.nextLine();
	 	         
	 	        output=output+"Item"+ i +": " + item+ " Price: "+price;
	 	       totalPrice=totalPrice+price;
	 	       
	          System.out.print("Add one more item?");
	          decision=scan.nextLine();
	          
	          if (decision.equals("yes")) {
	        	  output=output+", ";
	        	 i++;  
	                      }else {
	                    	  System.out.println();
	                    	  break;       
	                      		}
	          System.out.println();
	          }while(decision.equals("yes"));
	 	    
	      System.out.println(output);
	      System.out.println("Total price: "+totalPrice);
	}
}
