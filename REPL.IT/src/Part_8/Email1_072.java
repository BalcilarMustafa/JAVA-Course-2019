package Part_8;

import java.util.Scanner;

public class Email1_072 {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		 String email = scan.next();
		 
		      if(!(email.contains("_"))) {
			    	  System.out.println(email);
			    	  
				}else {
					int a= email.indexOf("_");
					int b= email.indexOf("@");
					
					String firstname=email.substring(0, a);
					String lastname=email.substring(a+1, b);
					
					String newEmail =lastname+"_"+firstname+email.substring(b, email.length());
					
					System.out.println(newEmail);  
				                                    }
	}
}
