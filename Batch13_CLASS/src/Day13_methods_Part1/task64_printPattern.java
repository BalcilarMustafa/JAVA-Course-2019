package Day13_methods_Part1;

public class task64_printPattern {

	public static void main(String[] args) {
		printPattern(6);

	}

public static void printPattern(int stars) {


for(int i=1;i<=stars;i++) {
	
	for(int j=1;j<=i;j++) {
		
		System.out.print("*");
	
	}
	System.out.println();
	
	}
  }
}
