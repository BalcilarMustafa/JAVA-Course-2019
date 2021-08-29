package Part_18;

import java.util.ArrayList;

public class Methods_with_ArrayList8_CombineAll_187 {

	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<>();
		 str.add("apple");
		 str.add("orange");
		 str.add("cherry");
		 
		 ArrayList<String> strs = new ArrayList<>();
		 strs.add("elma");
		 strs.add("armut");
		 strs.add("kiraz");
		 
		 System.out.println(combineAL(str,strs));
	}

	
	public static ArrayList<String> combineAL(ArrayList<String>wordList1,ArrayList<String>wordList2 ){
		//write code here
		
		ArrayList<String> List = new ArrayList<>();

		List.addAll(wordList1);
		List.addAll(wordList2);
		
		return List;
	}
}
