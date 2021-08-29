package Part_18;

public class Methods_with_String12_Extract_Number_From_String_186 {

	public static void main(String[] args) {

		
		System.out.println(extractNum("aa!!%$#.10aa"));
		
	}

	public static String extractNum(String s) {
		
	    String dummy="";
      for(int i=0;i<s.length(); i++) {
			
			if( Character.isDigit(s.charAt(i)))
				dummy=dummy +s.charAt(i);
		}  
                return dummy;
	  }
}
