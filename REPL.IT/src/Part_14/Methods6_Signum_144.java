package Part_14;

import java.util.Scanner;

public class Methods6_Signum_144 {

	 public static void sign(int n){
		 
	     if(n>0) {System.out.println(1);}
			 if(n<0) {System.out.println(-1);}
			 if(n==0) {System.out.println(0);}
	  											}
	  
	  public static void main(String[] args) {
	    
		  Scanner inp = new Scanner(System.in);
	     int n = inp.nextInt();
	    
	    sign(n);
	                                         }
}
