package Part_12;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Make_Last_125 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
	    int size = scan.nextInt();
	    int[] nums = new int[size];
	    
			for(int i =0; i<size; i++) {
				nums[i] = scan.nextInt();
			                           }
		
			int[] newnums = new int[2 * nums.length];
				
				newnums[newnums.length-1] = nums[nums.length-1];
				System.out.println(Arrays.toString(newnums));
	}
}
