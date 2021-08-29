package Assignment_2;

public class soft_Discount_Calc {

	public static void main(String[] args) {
		
		
		int quantity=100;
		double discount_RATE=0;
		double discount=0;
		double amount=100;
		double total_Amount=0;
		
		
		if(quantity<10) {
			
		}else if(quantity>=10 && quantity<=19) {
			discount_RATE=0.2;
			

		}else if(quantity>=20 &&quantity<=49) {
			discount_RATE=0.3;
			
		}else if(quantity>=50 &&quantity<=99) {
			discount_RATE=0.4;
						
		}else if(quantity>=100) {
			discount_RATE=0.5;
		}
		amount=quantity*99; 
		discount=amount*discount_RATE; 
		total_Amount=amount-discount;
		System.out.println("Total Amount is: $"+ total_Amount);

	}

}
