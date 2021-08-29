package Part_8;

import java.util.Scanner;

public class Without_X_x_075 {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		 String word = scan.next();
		    
		    if((word.substring(0, 1).equals("X")||word.substring(0, 1).equals("x"))&&(word.substring (word.length()-1).equals("X")||word.substring (word.length()-1).equals("x"))) {
			    	
					 word=word.substring(1,word.length()-1);
			    	 System.out.println(word);
			    	 
				}else if(word.substring (word.length()-1).equals("X")||word.substring (word.length()-1).equals("x")) {

					 word=word.substring(0,word.length()-1);
					 System.out.println(word);
					 
				}else if((word.substring(0, 1).equals("X")||word.substring(0, 1).equals("x"))) {
						word=word.substring (1);
						 System.out.println(word);
						 
				}else {System.out.println(word);}
	}
}
