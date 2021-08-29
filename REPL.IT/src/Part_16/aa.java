package Part_16;

public class aa {
	public static void main(String[] args) {
		
		int[] numbers = {5,10,15,20,50,30};
    
		/*int max=numbers[0];
		
		for(int i=0; i<numbers.length; i++) {
			
			if(numbers[i]>max) {max=numbers[i];}
		                                 }
		System.out.println(max);*/
		
		
	
	}

	public void findMax(int [] nums) {
         int max=nums[0];
		
		for(int i=0; i<nums.length; i++) {
			
			if(nums[i]>max) {max=nums[i];}
		                                 }
		System.out.println(max);
		
	}
}