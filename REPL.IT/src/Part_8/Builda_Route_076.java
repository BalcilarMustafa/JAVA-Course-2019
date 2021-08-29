package Part_8;

import java.util.Scanner;

public class Builda_Route_076 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int first=0;
		int last=0;
		
		String start = scan.next();
		String end = scan.next();
		String[] letter= {"A","B","C","D","A","B","C"};
		
		for(int i=0;i<letter.length;i++)  {
			if(start.equals(letter[i])){
			first=i;
			break;
			                          }
			                              }
		for(int i=0;i<letter.length;i++) {
			if(end.equals(letter[i])) {
			last=i;
			break;
			                          }
		                                 }
		if(first>last) {
			for(int i=0;i<letter.length;i++) {
				if(end.equals(letter[i])) {
				last=i;
				                          }
			                                 }
		               }
		
			if(start.equals(end)) {
			System.out.println(end+" found");
			    return;}
			
			String[] route= {"right","down","left","up","right","down","left"};
		
			for(int i=first;i<last;i++) {
				
			System.out.print(route[i]);
			
			if(i!=last-1) {
				System.out.print(" > ");
				
			}else {System.out.print(": ");}
				}
			System.out.println(end+" found");
	}
}
