package day37_inheritance;

public class Employee extends Person { //Person:Student-Employee-->>School-Company

	String jobTitle;
	
	
	public void work() {
		System.out.println(name + " is working as " + jobTitle);
	}

	public String toString() {
		return "Employee [jobTitle=" + jobTitle + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}


}
