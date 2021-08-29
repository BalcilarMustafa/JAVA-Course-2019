package Day27_arrays_part4;

import java.util.Arrays;

public class Length {

	public static void main(String[] args) {

		int[][] numbers = {
				
				{1,2,3,4},            //row-0
				{5,6},                //row-1
				{9,10,11,23,30,50,60} //row-2
		};
		
		//display the number of rows
		System.out.println(numbers.length);
		
		//display the number of columns in each row
		
		for(int i=0;i<numbers.length;i++) {
			
			System.out.println("The number of columns in row " + i + " is " + numbers[i].length);
			
		}
		System.out.println("==============FIRST SHOWING===================");
		System.out.println("---------");
		
		for(int i=0;i<numbers.length;i++) {   
			for(int j=0;j<numbers[i].length;j++) { 
				System.out.print(numbers[i][j]+", ");  
				  
			}
			System.out.println();
		}
		
		System.out.println("==================SECOND SHOWING==================");
		
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i].length + "-");
			System.out.println(Arrays.toString(numbers[i]));
		}
		System.out.println("================THIRD SHOWING====================");
		
		for(int [] number : numbers) {
			System.out.print(number.length + "-");
			System.out.println(Arrays.toString(number));
		}
	}
}
