package day40_methodHiding_composition;

public class MethodHidingTest {

	public static void main(String[] args) {
		
		Panda.eat();

	}

}

class Bear{
		
	public static void eat() {
		System.out.println("Bear is eating");
	}
	
	public static void sneeze() {
		System.out.println("Bear is sneezing");
	}
	
	public void hibernate() {
		System.out.println("Bear is hibernating");
	}
}


class Panda extends Bear{
	
	
	public static void eat() {
		System.out.println("Panda is eating");
	}
	
	/*
	public void sneeze() { // parent method static bu da static olmali. pga complaining.
	}
	*/
	
	@Override
	public void hibernate() {
		System.out.println("Panda is .....");
	}
}
