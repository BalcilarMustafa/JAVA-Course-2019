package Part_8;

import java.util.Scanner;

public class Car_Insurance_Quote_078 {

	public static void main(String[] args) {

		    double premium = 0;
			int accidentsAmount = 0;
			int daysDrivenToWorkOrSchool = 0;
			int milesToWorkOrSchool = 0;
			String vehicleOwnership = "";
			String vehicleUsage = "";
			String continuousInsurance = "";
			String education = "";
			String name = "";
			String referenceNumber = "";
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Welcome to the CountyFarm car insurance!");
	    
	  	    System.out.println("Enter your name");
			name = scan.nextLine();
			
			System.out.println("Do you have a US driver license?");
			
			if (scan.nextLine().equalsIgnoreCase("yes")) {
				
				System.out.println("Enter your zip code");
				int zipCode = scan.nextInt();
				scan.nextLine();
				
				if (zipCode == 20910 || zipCode == 20740) {
					premium += 60;
					
				} else if (zipCode == 22102 || zipCode == 22103) {
					premium += 30;
					
				} else {
					premium += 50;
				}
				
				System.out.println("Is this vehicle Owned, Financed, or Leased?");
				vehicleOwnership = scan.nextLine();
			
				if (vehicleOwnership.equalsIgnoreCase("owned")) {
					premium += 10;
					
				} else {
					premium += 20;
				}

				System.out.println("How is this vehicle primarily used?");
				vehicleUsage = scan.nextLine();
				
				if (vehicleUsage.equalsIgnoreCase("business")) {
					premium += 50;
					
				} else if (vehicleUsage.equalsIgnoreCase("Pleasure")) {
					premium += 10;
					

				} else if (vehicleUsage.equalsIgnoreCase("Commute")) {
					premium += 20;
					System.out.println("Days Driven To Work And/Or School");
					
					daysDrivenToWorkOrSchool = scan.nextInt();
					scan.nextLine();
					premium += daysDrivenToWorkOrSchool * 5;
					
					System.out.println("Miles Driven To Work And/Or School");
					milesToWorkOrSchool = scan.nextInt();
					scan.nextLine();
					premium += milesToWorkOrSchool * 1;

				}
				
				System.out.println("How old are you?");
				
				int age = scan.nextInt();
				if (age < 16) {
					System.out.println("Invalid data!");
					System.exit(0);

				} else if (age >= 16 && age < 18) {
					premium += premium * 20;

				} else if (age >= 18 && age <= 21) {
					premium += premium * 6;
					
				} else if (age > 21 && age < 25) {
					premium += premium * 2;
				}

			  System.out.println("How many years you've been driving?");
				int experience = scan.nextInt();
				scan.nextLine();
				
				if ((experience + 16) > age || age <= 0) {
					System.out.println("Invalid data!");
					System.exit(0);
					
				} else {
					premium -= experience * 5;
				}
				
				System.out.println("Have you had any accidents in the last 5 years?");
				
				if (scan.nextLine().equalsIgnoreCase("yes")) {
					System.out.println("How many?");
					accidentsAmount = scan.nextInt();
					scan.nextLine();
					premium += (premium / 5) * accidentsAmount;
				}
			
				System.out.println("Have you had continuous insurance for the past 12 months?");
				continuousInsurance = scan.nextLine();
				
				if (continuousInsurance.equalsIgnoreCase("no")) {
					premium = premium * 2;
				}
				
				System.out.println("What is the highest level of education you have completed?");
				education = scan.nextLine();
			
				if (education.equalsIgnoreCase("phd") || education.equalsIgnoreCase("masters")
						|| education.equalsIgnoreCase("bachelors")) {
					premium -= (premium * 0.05);
					
				} else if (education.equalsIgnoreCase("doctors")) {
					premium -= (premium / 10);
					
				} else if (education.equalsIgnoreCase("Less than High School")) {
					premium += (premium * 0.05);
				}

				System.out.println(name + ", here's your quote!");
			    String educationWithoutSpace = "";
			    
					for (int i = 0; i < education.length(); i++) {
						if (String.valueOf(education.charAt(i)).equals(" ")) {
							continue;
						}else {
							educationWithoutSpace += String.valueOf(education.charAt(i));
						}
					}
				
				System.out.println("Start Your Policy Today For: $" + premium);
				referenceNumber = (name.substring(0, 2) + Integer.toString(age)
						+ name.substring(name.length() - 2, name.length()) + Integer.toString(zipCode)
						+ educationWithoutSpace).toUpperCase();
				System.out.println("Reference number: " + referenceNumber);
				
			} else {
				
				System.out.println("Invalid data!");
				System.exit(0);
			}
	}
}
