package Part_15;

import java.util.Arrays;
import java.util.Scanner;

public class Methods_with_Return1_Count_Appearance_156 {

	public static void main(String[] args) {

				 Scanner scan = new Scanner(System.in);
				    int size = scan.nextInt();
				    String [] strs = new String [size];
				    for(int i=0; i < size; i++){
				      strs[i] = scan.next();
				    							}
				    String str=scan.next();
				    System.out.println(Arrays.toString(strs));
				    System.out.println(str);
				    
		System.out.println(count_appearance(strs, str));

	}

	 public static int  count_appearance(String[] arr, String t) {
	    
		 int count=0;
		 for(int i=0; i<arr.length; i++) {
			 if(arr[i].contentEquals(t)) {count++;}
		                                 }
		   return count;	  
	  } 
}
