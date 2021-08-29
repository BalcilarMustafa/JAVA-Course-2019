package Part_17;

public class Methods_with_String9_Remove_First_Char_174 {

	public static void main(String[] args) {

		System.out.println(removeFirst("blabla"));
	}

	public static String removeFirst(String target) {
		   
		target=target.substring(1, target.length());
		return target;
	  }	
}
