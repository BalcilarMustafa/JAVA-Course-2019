package Assignment_2;

public class Time_Calculator {

	public static void main(String[] args) {
		
		int seconds=1997793;
		int minute=0;
		int hour=0;
		int day=0;
		int remain=0;
				
		
		if(seconds<60) {
			 System.out.println(seconds+" seconds" );
		
		}else if(seconds>=60&&seconds<3600) {
			
			minute=(seconds-(seconds%60))/60;
			 seconds=seconds%60;
			
			System.out.println(minute+" minutes "+seconds+" seconds" );
			
		}else if(seconds>=3600&&seconds<86400) {
		hour=(seconds-(seconds%3600))/3600;
   	 	remain=seconds%3600;
   	 	minute=(remain-(remain%60))/60;
   	 	seconds=remain%60;
   	 	System.out.println(hour+" hour "+ minute+" minutes "+seconds+" seconds" );
		
			
		}else if(seconds>=86400) {
		day=(seconds-(seconds%86400))/86400;
       	remain=seconds%86400;
       	hour=(remain-(remain%3600))/3600;
       	remain=seconds%3600;
       	minute=(remain-(remain%60))/60;
       	seconds=remain%60;
       	System.out.println(day+" days "+hour+" hours "+ minute+" minutes "+seconds+" seconds" );
			}
				
	}
	}

