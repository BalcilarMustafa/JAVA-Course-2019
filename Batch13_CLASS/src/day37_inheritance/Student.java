package day37_inheritance;

public class Student extends Person {//Person:Student-Employee-->>School-Company

	int studentID;
	String termClass;
	
	public void code(String lang) {
		System.out.println(name + " is coding " + lang);
	}
	
	public void attendClass() {
		System.out.println(name + " is attending " + termClass + " class");
	}
}
