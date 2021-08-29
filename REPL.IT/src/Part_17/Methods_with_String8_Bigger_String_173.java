package Part_17;

public class Methods_with_String8_Bigger_String_173 {

	public static void main(String[] args) {

		System.out.println(biggerS("blabla","a"));
	}

	public static String biggerS(String a ,String b) {
	    String c="";
	if(a.length()>b.length()) {c=a;}
	if(a.length()<b.length()) {c=b;}
	return c;
  }	
}
