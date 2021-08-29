package Day34_constructors_passingObjectToMethod;

public class AppleTest {

	public static void main(String[] args) {
		
		Apple a1 = new Apple();
		System.out.println(a1.color);
		
		changeApple(a1);
		System.out.println(a1.color);
	}
	
	public static void changeApple(Apple b1) {
		
	    b1.color="Orange";

	}
}
