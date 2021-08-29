package Part_7;

import java.util.Scanner;

public class Middle_Three_065 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	   
		if(word.length()%2==1) {
			
				  if(word.length()>=5) {
					  int c=word.length()/2-1;
				  		System.out.println(word.substring(c,c+3));
				  		
				  	} else {
						System.out.println("invalid");
					}
				  
		}else {
				System.out.println("invalid");
			}
	}
}
