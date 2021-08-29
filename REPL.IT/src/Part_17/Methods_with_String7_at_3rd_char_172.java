package Part_17;

public class Methods_with_String7_at_3rd_char_172 {

	public static void main(String[] args) {

		System.out.println(at3("blabla","a"));
	}
	
	 public static String at3(String target,String word) {
		    
			target=target.substring(0, 3)+word+target.substring(3, target.length());
			return target;
		  }	

}
