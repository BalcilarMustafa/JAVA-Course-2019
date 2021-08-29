package Part_3;

import java.util.Scanner;

public class Seconds_Converter_30 {

	public static void main(String[] args) {

		int seconds;
		int minute;
		int hour;
		int remain;
		Scanner scan = new Scanner(System.in);	
		
		System.out.println("Enter seconds:");
	    seconds=scan.nextInt();
	    
		if(seconds<60) {
			 System.out.println(seconds+" seconds" );
		
		}else if(seconds>=60&&seconds<3600) {
			
			minute=(seconds-(seconds%60))/60;
			 seconds=seconds%60;
			
			System.out.println(minute+" minutes, "+seconds+" seconds" );
			
		}else if(seconds>=3600) {
			hour=(seconds-(seconds%3600))/3600;
   	 	 remain=seconds%3600;
   	 	 minute=(remain-(remain%60))/60;
   	 	 seconds=remain%60;
   	 	System.out.println(hour+" hours, "+ minute+" minutes, and "+seconds+" seconds" );
   	 	
		}
	}
}
