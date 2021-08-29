package Part_18;

import java.util.ArrayList;

public class Methods_with_ArrayList4_Set_182 {

	public static void main(String[] args) {

		ArrayList<String> strs = new ArrayList<>();
		 strs.add("apple");
		 strs.add("orange");
		 strs.add("cherry");
	     
		 test(strs); 
	
	}
	
	
	public static void test(ArrayList<String> words) {
		//write code here
		words.set(0,"git");
		words.set(2,"gud");
		System.out.println(words);
	}
}
