package Part_14;

import java.util.Scanner;

public class Methods12_Time_Conversion_150 {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		    timeConversion(scan.nextLine());

}            //2:55:00PM

	public static void timeConversion(String s) {
	   
		if(s.length()==9) {s="0"+s;}
		
		if(s.contains("AM")){
			if(s.substring(0, 2).contentEquals("12")) {System.out.println("00:00:00");}
			System.out.println(s.substring(0, 8));
			
		}else {
			int time=Integer.parseInt(s.substring(0, 2))+12;
			String time1 = Integer.toString(time);
			System.out.println(time1+s.substring(2, 8));
		      } 		 
	  }	
}
