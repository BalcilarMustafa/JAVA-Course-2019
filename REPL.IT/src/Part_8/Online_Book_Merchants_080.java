package Part_8;

import java.util.Scanner;

public class Online_Book_Merchants_080 {

	public static void main(String[] args) {

		    Scanner scan = new Scanner(System.in);
		    
		    int freeBooks = 0;
		    boolean isPremiumCustomer = scan.nextBoolean();
		    int nbooksPurchased = scan.nextInt();
		    
				    if(isPremiumCustomer==true) {
				    	if(nbooksPurchased>=5&&nbooksPurchased<8) {
				    		freeBooks=1;
				    	}else if(nbooksPurchased>=8) {
				    		freeBooks=2;
				    	}
				    	
				    }else {
				    	if(nbooksPurchased>=7&&nbooksPurchased<12) {
				    		freeBooks=1;
				    	}else if(nbooksPurchased>=12) {
				    		freeBooks=2;
				    	}
				    	
				    }
				    System.out.println(freeBooks);
	}
}
