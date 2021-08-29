package day38_inheritance_part2;

public class StaticTest {
	public static void main(String[] args) {
		

		StaticSub obj = new StaticSub();
		obj.num = 5;
		obj.print();
		
		StaticSuper.num = 10; //reassigning with classname.staticvariable
		//StaticSub.num = 10; // we can reassign also this way
		obj.print();  // print with method
		System.out.println(StaticSub.num); //print with subclassname.staticvariable
		//System.out.println(StaticSuper.num); //print with superclassname.staticvariable
		
		//StaticSub.m2();  // error because m2 is not static.can not be called with className
		obj.m2();
		
		
		 StaticSub.m1(); // compile because m1 static (call static way)
		 obj.m1();       // (call object way)
}
	      
}
