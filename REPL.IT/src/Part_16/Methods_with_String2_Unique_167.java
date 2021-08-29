package Part_16;

public class Methods_with_String2_Unique_167 {

	public static void main(String[] args) {

		 System.out.println( uniqueChars("wooden-spoon") ) ;

	}

	public static String uniqueChars(String str) {
	   
		 String[] chars=str.split("");
			String unique="";
			 for(int i=0; i < chars.length; i++){
				 if(!unique.contains(chars[i])) {unique=unique+chars[i];}    
			 }
			   return unique;  
}
}	