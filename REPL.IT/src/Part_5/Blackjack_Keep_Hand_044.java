package Part_5;

import java.util.Scanner;

public class Blackjack_Keep_Hand_044 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
	    
	    int house = s.nextInt();
	    int player = s.nextInt();
	    
	if(player+house>21) {
			  System.out.println("output: bust");
			  
			            }else {
				                 if(player<house) {
				                	 System.out.println("output: player loss");
				                	 
				                 				}else if(player==house) {
				                 					System.out.println("output: its a tie");
					
				                 				}else if (player>house) {
				                 					System.out.println("output: player wins");
				                 											}		
			            	  }  
	}
}
