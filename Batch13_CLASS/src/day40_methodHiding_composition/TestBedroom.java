package day40_methodHiding_composition;

public class TestBedroom {

	public static void main(String[] args) {
		
		Wall wall1 = new Wall("East");
		Wall wall2 = new Wall("West");
		Wall wall3 = new Wall("South");
		Wall wall4 = new Wall("North");
		
		Ceiling ceiling = new Ceiling(12, 55);
		
		Bed bed = new Bed("Modern", 4, 3, 2, 1);
		
		Lamp lamp = new Lamp("Classic", false, 75);
		
		Bedroom bedroom = new Bedroom("Ozzy", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
		
		bedroom.makeBed();           // Bedroom class da olunca direkt cagiriyoruz
		bedroom.getBed().make();     // Bed class da olunca Bedroom class daki getter methodunu kullanarak cagiriyoruz.
		bedroom.getLamp().turnOn();			
	}
}