package Part_16;

public class Methods_with_Return6_Water_Tax_161 {
	
	public double waterTax(double units) {
	    double bill = 0.0;   

	    if(units<=50) { bill = units * 0.60;}
	    if(units>50 && units<=100) { bill = units * 0.90;}
	    if(units>100 && units<=150) { bill = units * 0.90+50;}
	    if(units>150) { bill = units * 0.90+100;}
	    
	    return bill;
	  }
}
