package Part_12;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Front_Piece_124 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		int[] num = new int[size];
		for(int i =0; i<size; i++) {
			num[i] = scan.nextInt();
		}
		
    int size1=2;
			  if(size<2) {
				size1=size;
			}
			
			int[] num1 = new int[size1];
			for(int i =0; i < size1; i++) {
				num1[i] = num[i];
			}
			System.out.println(Arrays.toString(num1));
	}
}
