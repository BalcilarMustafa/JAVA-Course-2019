package Part_7;

import java.util.Scanner;

public class Verify_Contains_068 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
	    String word = scan.nextLine();
	    String sentence = scan.nextLine();
	    
	    if(sentence.contains(word)) {
					System.out.println(true);
				}else {
					System.out.println(false);
				}
	}
}
