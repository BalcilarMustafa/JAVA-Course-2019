package Day13_methods_Part1;

public class task65_calculateGrade {

	public static void main(String[] args) {
		
		calculateGrade(70);
		
	}
		public static void calculateGrade(int mark) {

			if(mark>=90&& mark<=100) {
				System.out.println("Your Grade is: A");
			}else if(mark>=80 && mark<90) {
				System.out.println("Your Grade is: B");
			}else if(mark>=70 && mark<80) {
				System.out.println("Your Grade is: C");
			}else if(mark>=60 && mark<70) {
				System.out.println("Your Grade is: D");
			}else if(mark>=0 && mark<60) {
				System.out.println("Your Grade is: F");
			
			}else  {
				System.out.println("Invalid Score");
		}
	}
}
