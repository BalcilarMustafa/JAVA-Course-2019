package Assignment_2;

public class Monthly_InternetBill {

	public static void main(String[] args) {
		
		String medium="A";  //Package A, B or C
		int hours=3;
		int chargePerHour=0;
		double constantCharge=0;
		double bill;
		
				
				switch(medium) {
				case "A":
					constantCharge=9.95;
					chargePerHour=2;
					bill=constantCharge+hours*chargePerHour;	
					
					System.out.println("Total charges in Package A with extra " +hours + " hours use is: $ " + bill);
					break;
				case "B":
					constantCharge=13.95;
					chargePerHour=1;
					bill=constantCharge+hours*chargePerHour;
					
					System.out.println("Total charges in Package B with extra " +hours + " hours use is: $ " + bill);
					break;
				case "C":
					constantCharge=19.95;
					chargePerHour=0;
					bill=constantCharge+hours*chargePerHour;
					
					System.out.println("Total charges in Package C with extra " +hours + " hours use is: $ " + bill);
					break;
				default:
					System.out.println("The input is invalid ");
					
				}

			

	}

}
