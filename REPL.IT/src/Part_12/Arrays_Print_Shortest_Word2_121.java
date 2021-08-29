package Part_12;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Print_Shortest_Word2_121 {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		    String str = scan.nextLine();
		    
		   String[] array = str.split(", ");
				   
				    int min =array[0].length();
				    for(int i=0;i<array.length;i++) {
				    	if(array[i].length()<min) {
							min=array[i].length();
					                              }
				                                    }
				    
				    int count=0;
				    for(int i=0;i<array.length;i++) {
				    	if(array[i].length()==min) {
							count++;
					                               }
				                                    }
				  
				    String[] arr=new String[count];
				    int n=0;
				    for(int i=0;i<array.length;i++) {
				    	if(array[i].length()==min) {
							arr[n]=array[i];
							n++;
					                               }
				                                    }
				  Arrays.sort(arr); 
				  System.out.println(Arrays.toString(arr));
	}
}
