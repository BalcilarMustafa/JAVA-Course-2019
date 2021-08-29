package Assignment_2;

public class TaxCalculator {
public static void main(String[] args) {
		
		double income=400_000_000;
		double baseIncome=150_000_000;
		double extraIncome1=0;
		double extraIncome2=0;
		double extraIncome3=0;
		double extraIncome4=0;
		
		double tax_RATIO1=0.25; 
		double tax_RATIO2=0.30; 
		double tax_RATIO3=0.35; 
		double tax_RATIO4=0.40;
		double tax_RATIO5=0.50;  
		double tax_AMOUNT=0;

					
		if(income<=150_000_000) {
			tax_AMOUNT=(income*tax_RATIO1);
			
		}else if(income>150_000_000 && income<=300_000_000) {
			extraIncome1=income-baseIncome;
			tax_AMOUNT=(baseIncome*tax_RATIO1)+(extraIncome1*tax_RATIO2);
			
		}else if(income>300_000_000 && income<=600_000_000) {
			extraIncome1=150_000_000;
			extraIncome2=income-300_000_000;
			tax_AMOUNT=(baseIncome*tax_RATIO1)+(extraIncome1*tax_RATIO2)+(extraIncome2*tax_RATIO3);
			
		}else if(income>600_000_000 && income<=1_200_000_000) {
			extraIncome1=150_000_000;
			extraIncome2=300_000_000;
			extraIncome3=income-600_000_000;
			tax_AMOUNT=(baseIncome*tax_RATIO1)+(extraIncome1*tax_RATIO2)+(extraIncome2*tax_RATIO3)+(extraIncome3*tax_RATIO4);
		}else if(income>1_200_000_000) {
			extraIncome1=150_000_000;
			extraIncome2=300_000_000;
			extraIncome3=600_000_000;
			extraIncome4=income-600_000_000;
			tax_AMOUNT=(baseIncome*tax_RATIO1)+(extraIncome1*tax_RATIO2)+(extraIncome2*tax_RATIO3)+(extraIncome3*tax_RATIO4)+(extraIncome4*tax_RATIO5);
	}
		
		
		System.out.println("Your tax amount = " + tax_AMOUNT);
		}

}
