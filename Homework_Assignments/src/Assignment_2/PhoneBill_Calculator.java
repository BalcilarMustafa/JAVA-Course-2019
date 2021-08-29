package Assignment_2;

public class PhoneBill_Calculator {
	public static void main(String[] args) {
		int callNumber=201;
		int baseAmount=200;
		int extraCall=callNumber-100;
		
		double phoneBill =0;
		double amountPerCall=0;
		double extraAmount=0;
		
		
	if(callNumber<=100) {
		
	}else if(callNumber>100&&callNumber<=150) {
		
		amountPerCall=0.60;
		
	}else if(callNumber>150&&callNumber<=200) {
		amountPerCall=0.50;
		
	}else if(callNumber>200) {
		amountPerCall=0.40;
		
		}
	
	extraAmount=(amountPerCall*extraCall);
	phoneBill=(baseAmount+extraAmount);
	System.out.println("Your Phone Bill is: $" + phoneBill);
	
	}
}
