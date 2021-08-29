package Part_18;

import java.util.ArrayList;
import java.util.Arrays;

public class Methods_with_ArrayList_RemoveAll_188 {

	public static void main(String[] args) {

	ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
	
	System.out.println(removeAll(wordList,"hi"));
	
}

	public static ArrayList<String> removeAll(ArrayList<String>wordList1, String str ){
	
		ArrayList<String> strList = new ArrayList<String>(Arrays.asList(str));
  
		wordList1.removeAll(strList);
		return wordList1;
	}
}