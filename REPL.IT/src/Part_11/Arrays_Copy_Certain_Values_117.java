package Part_11;

import java.util.Arrays;

public class Arrays_Copy_Certain_Values_117 {

	public static void main(String[] args) {

		 System.out.println("-----EXAMPLE RUN ---------");
		 
		    String[] numbers = {"zero", "one", "two","three","four"};
		    System.out.println(Arrays.toString(getWithE(numbers)));
		    
	}

	 public static String[] getWithE(String[] arr) {
		    
		    int counter=0;
				for(String str : arr)   {	
				if(str.contains("e")) {
						counter++;
					                  }
		                                }
				String[] fewValues= new String[counter];
				int n=0;
				for(int i=0;i<arr.length;i++) {
					if(arr[i].contains("e")) {
						fewValues[n]=arr[i];
						n++;
								             }
				                              }
		    return fewValues;
		                                            }
}
