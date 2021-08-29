package Part_10;

import java.util.Scanner;

public class Print_Letters_096 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    char start = scan.next().charAt(0);
	    char end = scan.next().charAt(0);
	    
	     char ch;
			    for(ch=start; ch<= end; ch++)
	            System.out.print(ch);
	}
}
