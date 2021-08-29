package Part_7;

import java.util.Scanner;

public class Print_Half_Twice_069 {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		 String word = scan.next();
		      
				int a=word.length()/2;
				String dummy="";
				
				   for(int i=0;i<=a-1;i++) {  
						
					dummy=dummy+word.charAt(i);
						}
				   System.out.println(dummy+dummy);
	}
}
