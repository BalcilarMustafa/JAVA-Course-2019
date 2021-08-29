package Part_16;

public class Methods_with_Return9_Simple_Room_Booking_164 {
	
public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
	    
	 if((isAvailable==false) || !(year==2018)) {return false;} 
	 
	 if((month==7) && (day>=1 && day<=7)) {return false;}
	 else {return true;}
 }

public static void main(String[] args) {

	System.out.println(simpleRoomBook(false,2,1,2018));
	
}
}

