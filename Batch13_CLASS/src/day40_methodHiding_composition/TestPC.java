package day40_methodHiding_composition;

public class TestPC {  // COMPOSITION (HAS A RELATIONSHIP)

	public static void main(String[] args) {
		
		Dimensions dimensions = new Dimensions(20, 20, 5);
		
		Case theCase = new Case("220B", "Dell", "240", dimensions);
		
		Monitor theMonitor = new Monitor("27 inc beast"	, "Acer", 27, new Resolution(2540,1440));
		
		Motherboard theMotherboard = new Motherboard("bj-200", "Asus", 4, 6, "v2.44");
		
		
		PC thePC = new PC(theCase, theMonitor, theMotherboard);
		
		//theMonitor.drawPixel(1500, 1200, "red");	yerine thePC.getMonitor() Monitor class da uretilen objecti dondurur(theMonitor).
		thePC.getMonitor().drawPixel(1500, 1200, "red");	
		
		
		//call loadProgram() 
		thePC.getMotherboard().loadProgram("Windows 1.0"); // PC class daki getter mehodlarini kullaniyoruz kisacasi 
		
		//call pressPowerButton()
		thePC.getTheCase().pressPowerButton();
		
	}
}
