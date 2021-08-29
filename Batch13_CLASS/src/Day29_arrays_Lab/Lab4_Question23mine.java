package Day29_arrays_Lab;

import java.util.Arrays;

public class Lab4_Question23mine {

	public static void main(String[] args) {

		create0to9arr(5);
		
	}
	
	public static void create0to9arr(int num) {

		int[] arr=new int[num];
		
		for(int i=0;i<num;i++) {
		arr[i]=i;
	}
		System.out.println(Arrays.toString(arr));
	}
}
