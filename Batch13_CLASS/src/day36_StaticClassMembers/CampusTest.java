package day36_StaticClassMembers;

public class CampusTest {

	public static void main(String[] args) {
		
		Campus c1 = new Campus("McLean");
		Campus c2 = new Campus("Arlington");
		
		System.out.println(Campus.country);	//static oldugu icin country e once USA sonra UK yuklenir.
	}                            // son durumda UK olduðu icin UK yazýdýrýlýr. (reassign country)
}
