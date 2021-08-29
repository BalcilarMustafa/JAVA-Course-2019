package Part_9;

import java.util.Scanner;

public class Count_Java_090 {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		
	    String word = scan.next();
	    int count=0;
		    for(int i=0;i<word.length()-3;i++) {  
				
				if(word.substring(i, i+4).equalsIgnoreCase("java")) {  
					count++;
				                                                    }
				                                }
		    System.out.println(count);
	}
}
