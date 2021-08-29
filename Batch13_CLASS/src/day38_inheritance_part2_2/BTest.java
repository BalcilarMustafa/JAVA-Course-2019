package day38_inheritance_part2_2;

import day38_inheritance_part2.B; // we did import

public class BTest extends B  {   // we did extends (inheritance)

	public static void main(String[] args) {

		BTest obj = new BTest ();
		
		obj.display(); // we can access protected method in Class B

	}

}
