package Part_10;

import java.util.Scanner;

public class Prefix_Again_093 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
	    String str = scan.next();
	    int n = scan.nextInt();
	    
	         int count=0;
			 String prefix="";
			 
			    if(str.length()==1) {
			    	System.out.println(false);
			    	
			    }else if(str.length()>1) {
			         
			    	prefix=str.substring(0, n);
			 
			    for(int i=0;i<str.length()-n;i++) {  
					
					if(str.substring(i, i+n).equals(prefix)) {  
						count++;
															 }
										          }
			                              }
			    if(count==1) {
			    	System.out.println(false);
			    	
			    }else if(count>1) {
			    	System.out.println(true);
			                      }
	}
}
