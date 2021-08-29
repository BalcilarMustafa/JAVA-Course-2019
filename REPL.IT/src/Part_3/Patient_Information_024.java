package Part_3;

import java.util.Scanner;

public class Patient_Information_024 {

	public static void main(String[] args) {

		String firstName;
	    String lastName;
	    String fullName;
	    String email;
	    String street;
	    String state;
	    String city;
	    String address;
	    String contacts;
	    int age;
	    int zipcode;
	    double height;
	    double weight;
	    boolean isMarried;
	    long workPhoneNumber;
	    long personalPhoneNumber;
	    
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Welcome to the patient portal!");
	    System.out.println("Please enter your personal information");
	    
	    System.out.println("Enter your first name");
	         firstName=scan.nextLine();
	         
	          System.out.println("Enter your last name");
	        lastName=scan.nextLine();
	         
	         
	          System.out.println("Enter your email");
	         email=scan.nextLine();
	         
	          System.out.println("Enter your street");
	         street=scan.nextLine();
	         
	          System.out.println("Enter your city");
	         city=scan.nextLine();
	         
	          System.out.println("Enter your state");
	         state=scan.nextLine();
	         
	          System.out.println("Enter your zip code");
	         zipcode=scan.nextInt();
	         
	           System.out.println("Enter your work phone number");
	         workPhoneNumber=scan.nextLong();
	         
	          System.out.println("Enter your personal phone number");
	         personalPhoneNumber=scan.nextLong();
	         
	          System.out.println("Enter your age");
	         age=scan.nextInt();
	         
	          System.out.println("Enter your height");
	         height=scan.nextDouble();
	         
	         System.out.println("Enter your weight");
	         weight=scan.nextDouble();
	    
	    System.out.println("Are you married?");
	         isMarried=scan.nextBoolean();
		   
		   //-build contacts variable by concatenating work phone, personal phone and email
	         // -build fullName variable by concatenating first name and last name
	         //  -build address variable by concatenating street, city, state, zip code
	         
	         contacts=("work phone number - "+ workPhoneNumber+"," +" personal phone number - "+ personalPhoneNumber+","+ " email: "+email);
	         fullName=(lastName+", "+firstName);
	         address=(street+","+ " "+city+","+" " +state+" "+ zipcode);
	
	         System.out.println("Patient personal information");
	         System.out.println("Full name: "+fullName);
	         System.out.println("Address: "+ address);
	         System.out.println("Contacts: "+contacts);
	         System.out.println("Age: "+age);
	         System.out.println("Height: "+height);
	         System.out.println("Weight: "+weight+" pounds");
	         System.out.println("Married?: "+isMarried);
	}
}
