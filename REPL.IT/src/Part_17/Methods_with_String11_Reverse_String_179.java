package Part_17;

public class Methods_with_String11_Reverse_String_179 {

	public static void main(String[] args) {

		System.out.println(reverse("orange"));

	}
	
	public static String reverse(String input) {
		
		String revStr="";
		 for(int i=input.length()-1; i>=0; i--) {
			 revStr=revStr+input.charAt(i);
		 										}
		 return revStr;
	}
}
