package Part_10;

import java.util.Scanner;

public class Factorial_092 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
	    int n = scan.nextInt();
	    long fact=1;
		    for(int i=2;i<=n;i++) {
		    	fact=fact*i;
		    	}
		    System.out.println(fact);
	}
}
