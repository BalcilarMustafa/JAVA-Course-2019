package Part_12;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class To2D_Array_Largest_Number_127 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
	    int rows = inp.nextInt(), cols = inp.nextInt();
	    
	    int[][] arr = new int[rows][cols];
	    for(int i=0 ;i<=rows-1;i++) {
	      for(int j=0 ;j<=cols-1;j++) {
	        arr[i][j]=inp.nextInt();
	                                   }
	                                }
	     int max =arr[0][0];
			    for(int i=0;i<arr.length;i++) {   
					for(int j=0;j<arr[i].length;j++) {  
						if(arr[i][j]>max) {
				    		max=arr[i][j];
	                                      }
					                                  }
					System.out.println();
				                               }
			    	System.out.println(max);
	}
}
