package Part_11;

import java.util.Scanner;

public class Arrays_Print_Shortest_Word_120 {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		 
		    String[] str = {scan.next(), scan.next(), scan.next(), 
		                    scan.next(), scan.next(), scan.next()};
		    
		        int min =str[0].length();
			    int n=0;
			    
			    for(int i=0;i<str.length;i++) {
					if(str[i].length()<min) {
						min=str[i].length();
						n=i;
											}
											  }
			    System.out.println(str[n]);
	}
}
