package day36_StaticClassMembers;

public class Calculator {

	 int x; //bu local var.  static method içinde kullanýlamaz
	 //eger method içinde local yada instance var. kullanacaksak static yapamayýz.
	 // static int x; dersek static method içinde kullanabiliriz ama o zaman x var class a 
	 // ait olur object e ait olmaz!
		
		public static double plus(double num1,double num2) {//bunlar utility method
			return num1+num2; //burda mesela return num1+num2-x; diyemeyiz
			
		}
		
		public static double minus(double num1,double num2) {//bunlar utility method
			return num1-num2;
		}
		
		public static double multiply(double num1,double num2) {//bunlar utility method
			return num1*num2;  //utility methodlarda static kullanýlabilir
		}
		
		public int m1() {// iki method ayný class içindeyse static de olsa bir methoddan
			return x+4;  // static method u dogrudan(sadece method adýyla) cagýrabiliriz
			// ayný class içinde degilse classname.methodname seklinde yada object olusturularak caðýrýlýr
		}
}
