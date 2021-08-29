package Part_6;

import java.util.Scanner;

public class Print_Last_Character_060 {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		   
		  System.out.println(word.substring(word.length()-1, word.length()));
		  System.out.println(word.length()-1);
	}
}
