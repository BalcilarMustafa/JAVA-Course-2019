package Day34_constructors_passingObjectToMethod;

public class LightTest {

	public static void main(String[] args) {

		int watt =250;
		
		System.out.println("Creating Light object no.1");
		Light l1 = new Light();
		
		System.out.println("----------------------------");
		
		System.out.println("Creating Light object no.2");
		Light l2 = new Light(250, true);
		
		System.out.println("----------------------------");
		
		System.out.println("Creating Light object no.3");
		Light l3 = new Light(250,true,"attic");
		
		System.out.println("----------------------------");
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		System.out.println(l3.toString());
		
		
	}
}
