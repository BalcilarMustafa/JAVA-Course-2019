package Part_10;

import java.util.Scanner;

public class Parse_HTML_094 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
	    String html = scan.nextLine();
	   if(!(html.contains("html"))) {
		    	System.out.println("Invalid input!");
		    	}else {
		 
		    		String[] arr =html.split(" id=\"");
		    		String[]array=arr[1].split("\">");
		    		System.out.println(array[0]);
		 				}
	}
}
