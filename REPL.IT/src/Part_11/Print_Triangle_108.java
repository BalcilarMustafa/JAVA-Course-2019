package Part_11;

import java.util.Scanner;

public class Print_Triangle_108 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		int j = 1;
		int n = scan.nextInt();
     
               for(i=1;i<=n;i++) {
				
				for(j=1;j<=i;j++) {
				System.out.print("*");
				                  }
				System.out.println();
			           }
	}
}
