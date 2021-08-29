package Part_3;

import java.util.Scanner;

public class Phone_Num_023 {

	public static void main(String[] args) {

		 int areaCode;
		 int localNumber;
		 String phoneNumber;

		     Scanner scan = new Scanner(System.in);
		     
		      areaCode=scan.nextInt();
		      localNumber=scan.nextInt();
		      
		  phoneNumber=("("+areaCode+")-" +localNumber);
		   System.out.println("Calling number "+phoneNumber);
	}
}
