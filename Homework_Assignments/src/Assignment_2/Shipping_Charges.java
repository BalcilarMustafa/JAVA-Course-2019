package Assignment_2;

public class Shipping_Charges {

	public static void main(String[] args) {

		int shipDistance=600;
		double weightOf_Pack=10;
		double charge_RATE=0;
		double charge=0;
		
if(shipDistance<=500) {

			if(weightOf_Pack<=2) {
			charge_RATE=1.10;
			
			}else if(weightOf_Pack>2 &&weightOf_Pack<=6) {
			
			charge_RATE=2.20;

			}else if(weightOf_Pack>6 &&weightOf_Pack<=10) {
			charge_RATE=3.70;
			
								
			}else if(weightOf_Pack>10) {
			charge_RATE=3.80;
							
			}
			
} else	{
	
			if(weightOf_Pack<=2) {
			charge_RATE=2.20;
		
			}else if(weightOf_Pack>2 &&weightOf_Pack<=6) {
		
			charge_RATE=4.40;

			}else if(weightOf_Pack>6 &&weightOf_Pack<=10) {
			charge_RATE=7.40;
		
							
			}else if(weightOf_Pack>10) {
			charge_RATE=7.60;
		
			}
	
		 }	

	charge=weightOf_Pack*charge_RATE; 
	System.out.println("Your Item is:"+ weightOf_Pack+" pounds and");
	System.out.println("Total Shipping Amount is: $"+ charge);	
}
}
