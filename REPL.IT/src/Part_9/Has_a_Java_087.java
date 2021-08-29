package Part_9;

import java.util.Scanner;

public class Has_a_Java_087 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		boolean exists = false;
	    String word = scan.next();
	    
	     if(word.contains("java")) {
			    	if(word.indexOf("java")==0||word.indexOf("java")==1) {
			    		System.out.println(true);
			    	}else {
				    	System.out.println(false);
			    	      }
		}else {
		   System.out.println(false);
			   }
	}
}
