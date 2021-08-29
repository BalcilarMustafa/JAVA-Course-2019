package day40_methodHiding_composition;

public class KanngarooTest {

	public static void main(String[] args) {
		
		Kangaroo kg = new Kangaroo();
		kg.getMarsupialDescription();
		
		// methodlar static oldugunda hiding static olmadiginda overriding oluyor.
		// hiding oldugunda isBiped() sonucu(false) parent class dan, overriding oldugunda (true) child class dan geliyor.
	}
}
