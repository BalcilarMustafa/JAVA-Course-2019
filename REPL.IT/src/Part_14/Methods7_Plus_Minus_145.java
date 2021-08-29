package Part_14;

import java.util.Scanner;

public class Methods7_Plus_Minus_145 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
	    int size = inp.nextInt();
	    int[] arr = new int[size];
	    
	    for(int i=0 ;i<=size-1;i++){
	        arr[i]=inp.nextInt();
	                               }
	    plus_minus(arr);
}

	public static void plus_minus(int[] array) {
		
		  int countpos=0, countneg=0, countzero=0;
		  
		for(int i=0 ;i<array.length;i++){
			if(array[i]>0) {countpos++;}
			if(array[i]<0) {countneg++;}
			if(array[i]==0) {countzero++;}
		                                   }
		System.out.println("positives:"+countpos+", "+ "negatives:"+countneg+", "+ "zeros:"+countzero);	
	}		
}
	




