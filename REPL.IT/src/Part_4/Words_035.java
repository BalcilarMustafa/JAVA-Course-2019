package Part_4;

import java.util.Scanner;

public class Words_035 {

	public static void main(String[] args) {

		 Scanner s = new Scanner(System.in);
		    String word1 = s.next();
		    String word2 = s.next();
		    
		 
		     if(word1.contentEquals(word2)) {
				    	
				    System.out.println("word1 equals word2");
				}else {
				    System.out.println("word1 does not equal word2");
			}
	}
}
