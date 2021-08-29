package Part_11;

import java.util.Scanner;

public class Arrays_Find_non_Duplicate_114 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
	    for(int j=0;j<nums.length;j++) {
						int a=nums[j];
						int count=0;
						for(int i=0;i<nums.length;i++) {
							if(nums[i]==a) {
								count++;}
												       }
						if(count==1) {
						System.out.println(nums[j]);
						break;
						             }
						                 }	
	}
}
