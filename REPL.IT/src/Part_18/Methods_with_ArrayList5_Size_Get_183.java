package Part_18;

import java.util.ArrayList;

public class Methods_with_ArrayList5_Size_Get_183 {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(4);
		nums.add(1);
		nums.add(3);
		nums.add(2);
		nums.add(5);
		
	System.out.println(	sum(nums));
}

	public static int sum(ArrayList<Integer> ints)	{
		//write code here
		int sum=0;
		for(int i=0;i<ints.size(); i++) {
			
			sum=sum+ints.get(i);
		}
		return sum;	
	}
}
