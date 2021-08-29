package Part_16;

public class Methods_with_String4_Word_Count_169 {

	public static void main(String[] args) {

		 System.out.println( wordCount("one two three"));

	}

	 public static int wordCount(String words) {
		    
	     String [] arr=words.split(" ");
			 int count=arr.length;
			  return count;
	      
	  }
}
