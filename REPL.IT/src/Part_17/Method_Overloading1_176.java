package Part_17;

public class Method_Overloading1_176 {

	
	  public void findMax(int [] nums) {
			
			int max=nums[0];
			
			for(int i=0; i<nums.length; i++) {
				if(nums[i]>max) {max=nums[i];}
			}
			System.out.println(max);
		}
		
		
	public double findMax(double [] nums) {
			
		double max=nums[0];
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>max) {max=nums[i];}
		                                 }
		return max;
	}
}
