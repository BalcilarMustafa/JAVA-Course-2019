package Part_10;

import java.util.Scanner;

public class Arrays_Printing01_100 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i=0;i<5;i++) {
			arr[i] = input.nextLine();
		                      }
		
		for (int i=0;i<5;i++){
			String str=arr[i];
			System.out.println(str.substring(0, 3));
			                 }
	}
}
