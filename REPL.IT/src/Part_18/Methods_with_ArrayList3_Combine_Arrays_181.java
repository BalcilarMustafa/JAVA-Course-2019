package Part_18;

import java.util.ArrayList;

public class Methods_with_ArrayList3_Combine_Arrays_181 {

	public static void main(String[] args) {
		String [] ar1={"f","o","o"};
		String [] ar2={" b","a","r"};
		System.out.println(combineRs(ar1,ar2));
		
	}

	 public static String combineRs(String[] r1,String[] r2) {
	  
		 ArrayList<String> r1r2 = new ArrayList<String>();
	   
		 for(int i=0; i<r1.length; i++) {
			 r1r2.add(r1[i]); 
			 }
		 for(int i=0; i<r2.length; i++) {
			 r1r2.add(r2[i]); 
			 }
		 String result="";
		 for(int i=0; i<r1r2.size(); i++) {
			 result=result+r1r2.get(i);
	         }
		 return result;
}
}
