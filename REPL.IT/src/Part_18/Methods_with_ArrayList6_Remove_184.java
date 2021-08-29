package Part_18;

import java.util.ArrayList;

public class Methods_with_ArrayList6_Remove_184 {

	public static void main(String[] args) {

		ArrayList<Double> nums = new ArrayList<>();
		nums.add(1.5);
		nums.add(4.1);
		nums.add(3.2);
		nums.add(5.4);
		 test(nums);
	
	}
	
	public static void test(ArrayList<Double> dubs){
		//write code here
		dubs.remove(0);
		dubs.remove(0);
		System.out.println(dubs);
	}
}
