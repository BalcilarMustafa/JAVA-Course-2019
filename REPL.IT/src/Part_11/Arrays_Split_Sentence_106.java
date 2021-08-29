package Part_11;

import java.util.Scanner;

public class Arrays_Split_Sentence_106 {

	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);
		    String sentence = input.nextLine();
		    
		     String[] array = sentence.split(" ");
				    for(String value : array) {
						System.out.println(value);
					                          }
	}
}
