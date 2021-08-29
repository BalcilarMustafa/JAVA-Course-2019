package day36_StaticClassMembers;

import static java.lang.Math.*;

public class StaticImport {

	public static void main(String[] args) {
		
		System.out.println(Math.sqrt(16));
		
		System.out.println(sqrt(16));   // static import tan dolayý
									    //  classname i(Math) kullanmamýza gerek kalmýyor
		
		method(); //ayný paket içinde olduðu için methoddan önce class name yazmamýza gerek olmuyor.
					
	}           
	
	public static void method() {
		
		System.out.println("Test");
	}
}