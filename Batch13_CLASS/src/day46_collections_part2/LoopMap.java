package day46_collections_part2;

import java.util.*;

public class LoopMap {

	public static void main(String[] args) {
		
		Map<String,String> dataMap = new HashMap<>();
		dataMap.put("url","qa3.vytrack.com");
		dataMap.put("userName","user66");
		dataMap.put("password","abc66");
		dataMap.put("browser","chrome");
		dataMap.put("storemanager","Mike Smith");
		dataMap.put(null,"abc");
		
		
		//keySet() - > returns set with all the keys in the map
		//values() - > returns list with all the values in the map
		
		System.out.println("KEYS");
		for(String key : dataMap.keySet()) {
			System.out.print(key + "|");
		}
		System.out.println();
		System.out.println("VALUES");
		for(String value : dataMap.values()) {
			System.out.print(value + "|");
		}
		
		System.out.println();
		
		for(String key :  dataMap.keySet() ) {
			System.out.println( key + "|" + dataMap.get(key));
		}
		
		System.out.println(dataMap);
		
		Map<Integer,Student> studentsMap = new HashMap<>();
		Map<String,String[]> data = new HashMap<>();
		Map<Integer,List<String>> data2 = new HashMap<>();
		Map<String,Map<Integer,Integer>> data3 = new HashMap<>();
		Map<String,Map<Integer,City>> data4 = new HashMap<>();
	}
}