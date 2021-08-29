package Part_11;

import java.util.Scanner;

public class Arrays_Print_First_Last_CharI_101 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   
	     for (int i=0;i<5;i++){
			String str=words[i];
			System.out.println(str.substring(0, 1)+str.substring(str.length()-1));
					          }
	}
}
