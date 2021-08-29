package Part_9;

import java.util.Scanner;

public class Party_083 {

	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);

		    String dec;
				System.out.println("Please enter guest name:");
				String name=input.nextLine();
				String namelist=name;
				
				do {	
				System.out.println("Do you want to enter new guest name:");
				dec=input.nextLine();
				
				if(dec.equals("no")) {
					break;
				}else {
					System.out.println("Please enter guest name:");
					name=input.nextLine();
					namelist=namelist+", "+name;
				      }
				}while(dec.equals("yes"));
				
				System.out.println("Guest's list: "+namelist);
	}
}
