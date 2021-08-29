package Part_17;

public class Methods_with_String6_Limit_String_171 {

	public static void main(String[] args) {

		System.out.println(limit("bla bla",3));
	}

	 public static String limit(String text, int maxLength){
		 
	    text=text.substring(0, maxLength);
			return text;
	  }
}
