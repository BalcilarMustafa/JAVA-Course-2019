package Part_11;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Reverse_Array_118 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    int n=0;
		    for(int i=0;i<nums.length/2;i++) {
		    	int temp = nums[i];
		    	nums[i]=nums[nums.length-1-n];
		    	nums[nums.length-1-n]=temp;
		    	n++;
		                                     }
	    System.out.println(Arrays.toString(nums));
	}
}
