package Assignment_2;

public class Weight_Calculator {
	
	public static void main(String[] args) {
	double mass=1;               
	double weight=mass*9.8;      
	
	
	if(weight>1000) {
		System.out.println("The object is too heavy");

	}else if(weight<=1000 && weight>=10) {
		System.out.println("The object is normal Weight");

	}else if(weight<10) {
		System.out.println("The object is too light");
		
	}
	}
}
