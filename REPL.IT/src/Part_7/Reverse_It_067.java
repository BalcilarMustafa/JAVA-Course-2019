package Part_7;

import java.util.Scanner;

public class Reverse_It_067 {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		 
		    String word = scan.next();
		    
		    if(word.length()<5) {
						System.out.println("Too short!");
						
					}else if(word.length()>5) {
						System.out.println("Too long!");
						
						
					}else if(word.length()==5) {
						
						for(int i=word.length()-1;i>=0;i--) {  
							
							System.out.print(word.charAt(i));	
						}	
					}
	}
}
