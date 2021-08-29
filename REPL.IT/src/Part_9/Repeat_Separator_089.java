package Part_9;

import java.util.Scanner;

public class Repeat_Separator_089 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
	    String word = scan.next();
	    String separator = scan.next();
	    int count = scan.nextInt();
	    
	     for(int i=1;i<=count;i++) {
		    	
		    	System.out.print(word);
		    	if(!(i==count)) {
		    		System.out.print(separator);
		    	}
		    }
	}
}
