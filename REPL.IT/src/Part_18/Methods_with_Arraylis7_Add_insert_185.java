package Part_18;

import java.util.ArrayList;

public class Methods_with_Arraylis7_Add_insert_185 {

	public static void main(String[] args) {

		ArrayList<String> strs = new ArrayList<>();
		 strs.add("apple");
		 strs.add("orange");
		 strs.add("cherry");
	     
		 test(strs); 

	}

	public static void test(ArrayList<String> words){
		//write code here
		
		words.add(0, "hey");
		words.add(3, "yo");
		System.out.println(words);
	}
}
