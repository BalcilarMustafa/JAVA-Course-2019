package Part_7;

import java.util.Scanner;

public class Middle_One_064 {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		   
		    
				if(word.length()%2==1) {
					
					  if(word.length()==1) {
						  System.out.println(word+word+word);
						  
					  	}else if(word.length()>=3)   {
					  		int c=word.length()/2;
					  		System.out.println(word.substring(c,c+1));
					 								 }
				                       }
				
				if(word.length()%2==0) {
					
					  if(word.length()==2) {
						  System.out.println(word+word);
						  
					  	}else if(word.length()>=4)   {
					  		int c=word.length()/2-1;
					  		System.out.println(word.substring(c,c+2));
					 								 }
				                       }
	  }
  }
