package day36_StaticClassMembers;

public class Calculator {

	 int x; //bu local var.  static method i�inde kullan�lamaz
	 //eger method i�inde local yada instance var. kullanacaksak static yapamay�z.
	 // static int x; dersek static method i�inde kullanabiliriz ama o zaman x var class a 
	 // ait olur object e ait olmaz!
		
		public static double plus(double num1,double num2) {//bunlar utility method
			return num1+num2; //burda mesela return num1+num2-x; diyemeyiz
			
		}
		
		public static double minus(double num1,double num2) {//bunlar utility method
			return num1-num2;
		}
		
		public static double multiply(double num1,double num2) {//bunlar utility method
			return num1*num2;  //utility methodlarda static kullan�labilir
		}
		
		public int m1() {// iki method ayn� class i�indeyse static de olsa bir methoddan
			return x+4;  // static method u dogrudan(sadece method ad�yla) cag�rabiliriz
			// ayn� class i�inde degilse classname.methodname seklinde yada object olusturularak ca��r�l�r
		}
}
