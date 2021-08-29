package Day29_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question28 {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(fizzArray3(5, 10)));   //[5, 6, 7, 8, 9]
		System.out.println(Arrays.toString(fizzArray3(11, 18)));  //[11, 12, 13, 14, 15, 16, 17]
		System.out.println(Arrays.toString(fizzArray3(1, 3)));    //[1, 2]

	}
	public static int[] fizzArray3(int num1,int num2) {

		int[] arr=new int[num2-num1];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=num1;
			num1++;
		}
			return arr;
	}
}
