package Part_15;

import java.util.Scanner;

public class Methods16_Check_if_Number_is_Palindrome_154 {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
		    isPalindrome(num);
		  }
		  
		  public static void isPalindrome(int num){
			  
			  int digit=0;
		        boolean flag=true;
		        double div=1;
		        double numd=num;

		        while (flag){
		           
		            if(numd/div>=1){
		                digit++;
		            }else{
		                flag=false;
		            }
		            div*=10;
		    }
		        System.out.println(digit);
		       
		        	  
		        	
}
}

		