package Part_16;

public class Methods_with_String1_Merge_Them_166 {

	public static void main(String[] args) {
		  String s1="java";
		  String s2="selenium";
		  System.out.println(mergeStrings(s1,s2));		
}

	public static String mergeStrings(String one, String two) {
        String merged="";
        String lng, shrt;
       
        if(one.length()>two.length()){ lng=one; shrt=two;}
        else { lng=two; shrt=one;}

        for(int i=0; i<lng.length(); i++){
            if(i<shrt.length()){
                merged=merged+one.charAt(i)+two.charAt(i);
            }else{
            	merged=merged+lng.charAt(i);
            }
        }
        return  merged;
    }
}
