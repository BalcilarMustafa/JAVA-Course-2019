package Part_10;

import java.util.Scanner;

public class Get_Sandwich_095 {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		 
	     String str = scan.next();
	     int brfirst = str.indexOf("bread");
		 int brlast = str.lastIndexOf("bread");
		     
		     if(!(str.contains("bread"))) {
		    	 System.out.println("nothing");
		    	 
		     }else if(brfirst==brlast) {
		     	System.out.println("nothing"); 
		     	
		     }else {
		    
		      if (brfirst == -1 || brlast == -1){
		    	  System.out.println("nothing");
		    }
		    
		    String sandwich = str.substring(brfirst+5, brlast);
		     System.out.println(sandwich);
		     }
	}
}
