package Assignment_2;

public class SizeOf_Numbers {

	public static void main(String[] args) {
		
		int numbers=5;  //numbers: 0, 1, 2, 3, 4, 5 etc.
		
		
				switch(numbers) {
				case 0 :case 1 :case 2:
							
					System.out.println("Low Number");
					break;
				
				case 3 :case 4 :case 5:
					
					System.out.println("Medium Number");
				
					break;
				    default:
					System.out.println("Other Number");
					}
	}

}
