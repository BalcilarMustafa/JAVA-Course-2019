package Part_11;

import java.util.Scanner;

public class Arrays_Has_55_104 {

	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);
		 
		    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		  
		     boolean flag=false;
				    for (int i=0;i<4;i++){
						if(nums[i]==nums[i+1]&& nums[i]==5){
							flag=true;
							                               }
						                  }
				   System.out.println(flag);
	}
}
