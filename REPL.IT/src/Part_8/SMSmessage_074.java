package Part_8;

import java.util.Scanner;

public class SMSmessage_074 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
	    String message = scan.nextLine();
	    String sender;
	    String phoneNumber;
	    String messageBody;
	    
	            int a= message.indexOf("<");
				int b= message.indexOf(">");
				int c= message.indexOf("[");
				int d= message.indexOf("]");
				int e= message.indexOf("{");
				int f= message.indexOf("}");
				
				sender=message.substring(a+1, b);
				phoneNumber=message.substring(c+1, d);
				messageBody=message.substring(e+1, f);
				
				System.out.println("Sender: "+sender);
				System.out.println("Phone Number: "+phoneNumber);
				System.out.println("Message body: "+messageBody);
	}
}
