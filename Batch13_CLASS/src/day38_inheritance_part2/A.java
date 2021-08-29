package day38_inheritance_part2;

public class A {  
	public String model; //default// public yerine private ya da default olursa erisilemez farkli package dan.
						 // protected olursa subclass olunca erisilebilir farkli package olsa da.
	
	public void display() {
		System.out.println("A model:" + model);
	}
}
