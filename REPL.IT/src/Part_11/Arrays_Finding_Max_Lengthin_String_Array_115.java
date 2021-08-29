package Part_11;

import java.util.Scanner;

public class Arrays_Finding_Max_Lengthin_String_Array_115 {

	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);
			
		 String[] words = new String[5];
		 
			for(int i = 0; i < 5;  i++) {
			   words[i] = input.nextLine(); 
										}
			int max= words[0].length();
			int n=0;
			
			for(int i = 0; i < 5;  i++) {
				  if(words[i].length()>max) {
					  max=words[i].length();
					  n=i;
				  							}
										}
			System.out.println(words[n]);		
	}
}
