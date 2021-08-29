package Day13_methods_Part1;

public class task62__GreatestNumber {

	public static void main(String[] args) {
		
		calculateGreatest(5,6,9);

	}
	
	public static void calculateGreatest(int n1, int n2, int n3) {
	
	if(n1>n2 && n1>n3) {
		System.out.println("n1 is biggest");
	}else {
		if(n2>n3) {
			System.out.println("n2 is biggest");
		}else {
			System.out.println("n3 is biggest"); //n3>n2
		}
	 }
  }	
}
