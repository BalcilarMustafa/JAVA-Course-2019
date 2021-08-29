package Part_13;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Zombie_Attack2_138 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	                                            }
	       int j=0;
			   System.out.println( "Day "+ j+" " + Arrays.toString(inhabitants));
			   boolean flag=true;
			 while(flag) {
				 j++;
				 for(int i=0; i<inhabitants.length; i++) {
				   
				    if(i==0&&inhabitants[1]==0) { 
				    	inhabitants[i]=inhabitants[i]/2;}
				  
				    else if(i> 0 && i < inhabitants.length-1) {
				    	if(inhabitants[i-1]==0||inhabitants[i+1]==0)
				    	{inhabitants[i]=inhabitants[i]/2;}
				    }
				    else if(i==inhabitants.length-1&&inhabitants[inhabitants.length-2]==0) {
				    	inhabitants[i]=inhabitants[i]/2; }
										}
			  		
			 	System.out.println( "Day "+ j+" " + Arrays.toString(inhabitants));
			  		if(inhabitants[0]==0 && inhabitants[1]==0 && inhabitants[2]==0 && inhabitants[3]==0 && inhabitants[4]==0 && inhabitants[5]==0 && inhabitants[6]==0 && inhabitants[7]==0) {
			  		flag=false;
			  		System.out.println("---- EXTINCT ----");
			  		}
			  			 } 
	}
}
