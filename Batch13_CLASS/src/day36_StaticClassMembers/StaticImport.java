package day36_StaticClassMembers;

import static java.lang.Math.*;

public class StaticImport {

	public static void main(String[] args) {
		
		System.out.println(Math.sqrt(16));
		
		System.out.println(sqrt(16));   // static import tan dolay�
									    //  classname i(Math) kullanmam�za gerek kalm�yor
		
		method(); //ayn� paket i�inde oldu�u i�in methoddan �nce class name yazmam�za gerek olmuyor.
					
	}           
	
	public static void method() {
		
		System.out.println("Test");
	}
}