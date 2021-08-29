package Day14_methods_Part2;

public class task67_lastDigit {

	public static void main(String[] args) {

		lastDigit(7,17);
		lastDigit(6,17);
		lastDigit(3,113);		
	}

	public static void lastDigit(int num1,int num2) {
		
		if (num1%10==num2%10) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
