package Part_6;

import java.util.Scanner;

public class Week_Days_055 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);  
		 
	    System.out.println("Enter number:");
			int day = scan.nextInt();
			
			switch(day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("No such a day");
        }
	}
}
