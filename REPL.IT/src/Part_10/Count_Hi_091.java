package Part_10;

import java.util.Scanner;

public class Count_Hi_091 {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		 
		    String str = scan.nextLine();
		     int count=0;
				    for(int i=0;i<str.length()-1;i++) {  
						
						if(str.substring(i, i+2).equals("hi")) {  
							count++;
															   }
						                               }
				    System.out.println(count);
	}
}
