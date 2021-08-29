package Part_8;

import java.util.Scanner;

public class Email2_073 {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		 String email = scan.next();
		    
		     int a= email.indexOf("_");
				int b= email.indexOf("@");
				int c= email.indexOf(".");
				
				String firstname=email.substring(0, a);
				String lastname=email.substring(a+1, b);
				String domain=email.substring(b+1, c);
				String toplevdomain=email.substring(c+1, email.length());
				
				firstname = firstname.substring(0, 1).toUpperCase() + firstname.substring(1);
				lastname = lastname.substring(0, 1).toUpperCase() + lastname.substring(1);
				
				System.out.println("First name: "+firstname);
				System.out.println("Last name: "+lastname);
				System.out.println("Domain: "+domain);
				System.out.println("Top-Level Domain: "+toplevdomain);	    
	}
}
