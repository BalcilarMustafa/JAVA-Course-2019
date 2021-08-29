package Day35_encapsulation;

public class Person {

	private String name;
	private int age;
	public char gender;
	
	public Person(String name, int age, char gender) {
		
		setName(name);
		setAge(age); //
		//this.age=age; // we can also use this way for the first time set (when invoking constructor)
		this.gender = gender;
	}
	
	public void setName(String name) {
		//condition
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
