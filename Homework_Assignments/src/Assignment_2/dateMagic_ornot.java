package Assignment_2;

public class dateMagic_ornot {
	public static void main(String[] args) {
		

		int day=16;
		int month=5;
		int year=1980;
		int yearTwoDigit=year%100;
		int multiply=day*month;
		
		if(multiply==yearTwoDigit) {
			System.out.println("The date: "+ month+"/"+day+"/"+yearTwoDigit + " is magic");
		
		  }else {
			  System.out.println("The date: "+ month+"/"+day+"/"+yearTwoDigit + " is not magic");
			  
	}	
}
}	