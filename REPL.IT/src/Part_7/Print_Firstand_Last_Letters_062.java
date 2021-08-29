package Part_7;

import java.util.Scanner;

public class Print_Firstand_Last_Letters_062 {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    
		    System.out.println(word.substring(0,1)+word.substring(word.length()-1,word.length()));
	}
}
