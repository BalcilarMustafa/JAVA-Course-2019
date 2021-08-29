package Day35_encapsulation;

public class PersonTest {

	public static void main(String[] args) {

		//Person p1 = new Person(); 
		//p1.setAge(20);  
		Person p1 = new Person("Mike",-25,'M'); 
		System.out.println(p1.getAge());        
		System.out.println(p1.getName());
		
		p1.setAge(30);                          
		System.out.println(p1.getAge()); 
		
		
	};
}
