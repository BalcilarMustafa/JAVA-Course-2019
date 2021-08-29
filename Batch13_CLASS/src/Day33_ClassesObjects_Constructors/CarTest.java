package Day33_ClassesObjects_Constructors;

public class CarTest {

	public static void main(String[] args) {

		/*
		Car c1 = new Car();
		c1.color="white";
		c1.make="honda";
		c1.model="civic";
		c1.mile=10000;
		c1.year=2009;
		*/
		
		Car c1 = new Car("Civic", "Honda", 2000, 15000, "White");
		Car c2 = new Car("Q7", "Audi", 2009, 55000, "Red");
	}
}
