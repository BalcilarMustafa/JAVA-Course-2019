package Part_16;

public class Methods_with_String5_Clean_String_170 {

	public static void main(String[] args) {

		System.out.println(clean ("he said bla bla bla","bla"));

	}

	public static String clean (String text ,String badWord) {

	      text=text.replace(badWord, "");
	       return text;
	  }
}
