package Part_10;

import java.util.Scanner;

public class Equals_Java_Python_097 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
	    String sentence = scan.nextLine();
	    int countOfJava = 0;
	    int countOfPython = 0;
		    
			for(int i=0;i<sentence.length()-3;i++) {  
				
				if(sentence.substring(i, i+4).equals("java")) {  
					countOfJava ++;
				                                              }
			                                        }
				for(int i=0;i<sentence.length()-5;i++) { 
				if(sentence.substring(i, i+6).equals("python")) {
					countOfPython++;
				                                                }
				                                        }
			if(countOfJava==countOfPython) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
	}
}
