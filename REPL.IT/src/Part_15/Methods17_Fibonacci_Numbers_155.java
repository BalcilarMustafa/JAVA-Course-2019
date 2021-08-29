package Part_15;

import java.util.Scanner;

public class Methods17_Fibonacci_Numbers_155 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    fib(num);
	 }
	  
	  public static void fib(int num){
	  
		    int num1=0;
			int num2=1;
			int sum;
			int[] arr=new int[num];
			for(int i=0;i<num;i++) {
		
				arr[i]=num1;
				sum=num1+num2;
				num1=num2;
				num2=sum;	
			                       }
	System.out.println(arr[num-1]);
}
}
