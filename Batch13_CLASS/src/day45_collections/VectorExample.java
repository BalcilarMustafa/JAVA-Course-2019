package day45_collections;

import java.util.*;

public class VectorExample {

	public static void main(String[] args) {
		
		List<String> v = new Vector<>();
		
		v.add("water");
		v.add("tea");
		v.add("tea");
		v.add("green tea");
		
		System.out.println(v.size());
		System.out.println(v.get(3));
		System.out.println(v);
		
		v.remove("tea");
		System.out.println(v);
		
		
		
		
	}

}