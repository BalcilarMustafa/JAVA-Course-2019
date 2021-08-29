package Assignment_2;

public class LeapYear_Calculator {
	public static void main(String[] args) {

		int Year=1900;
		
		
		if(Year%100==0) {

				 if(Year%400==0) {

				 System.out.println("Year:" + Year+" is a Leap Year " );

				
						 }else 

				 System.out.println("Year: " + Year+" is not a Leap Year " );

			
				}else 


				if(Year%4==0) {
 
				System.out.println("Year:" + Year+" is a Leap Year " );

				
						}else 

				System.out.println("Year: " + Year+" is not a Leap Year " );

			
		}
		

}
