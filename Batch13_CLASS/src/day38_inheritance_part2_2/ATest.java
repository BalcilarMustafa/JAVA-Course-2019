package day38_inheritance_part2_2;

 import day38_inheritance_part2.A;  // we did import from A class. Otherwise we cannot access.

 public class ATest {

	public static void main(String[] args) {
		A obj = new A ();
		obj.model = "Kia";   // we did model variable public. Otherwise we cannot access when it is private or default.
		
		obj.display();
	}

}
