package Assignment_2;

public class BankServiceFee_Calc {

	public static void main(String[] args) {
		
		int baseFee=10;
		int checks=62;
		double checkCharge=0;
		double totalFees=0;
		
				
	if(checks<20) {
		checkCharge=1.0;
	}else if(checks>=20&&checks<=39) {
		
		checkCharge=0.8;
		
	}else if(checks>=40&&checks<=59) {
		checkCharge=0.6;
		
	}else if(checks>=60) {
		checkCharge=0.4;
		
		}
	
	totalFees=baseFee+checkCharge*checks;
	
	System.out.println("Total Bank Service Fee is: $" + totalFees);
	
		}

}
