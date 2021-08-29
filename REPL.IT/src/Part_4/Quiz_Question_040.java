package Part_4;

import java.util.Scanner;

public class Quiz_Question_040 {

	public static void main(String[] args) {

		 Scanner s = new Scanner(System.in);
		    
		    System.out.println("what is the farthest planet in the solar system:" );
		    System.out.println("a)venus" );
		    System.out.println("b)pluto" );
		    System.out.println("c)neptune" );
		    
		    String str = s.nextLine();
		     
		 switch(str) {
				case "a":
					System.out.println(str+" is wrong");
					
					break;
				case "b":
					System.out.println(str+" is correct");
					
					break;
				case "c":
					System.out.println(str+" is wrong");
					
					break;
				default:
					System.out.println(str+" is not a valid answer");
					
		}
	}
}
