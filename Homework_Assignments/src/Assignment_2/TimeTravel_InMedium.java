package Assignment_2;

public class TimeTravel_InMedium {

	public static void main(String[] args) {
		
double   distance=32800;
String medium="steel";  //air, water or steel
double time=0;
		
		switch(medium) {
		case "air":
			 time=distance/1100;
			System.out.println("The travel time in air for " +distance + " feet distance is: " + time+ " seconds ");
			break;
		case "water":
			 time=distance/4900;
			 System.out.println("The travel time in water for " +distance + " feet distance is: " + time+ " seconds ");
			break;
		case "steel":
			 time=distance/16400;
			 System.out.println("The travel time in steel for " +distance + " feet distance is: " + time+ " seconds ");
			break;
		default:
			System.out.println("The input is invalid ");
				
		}


	}

}
