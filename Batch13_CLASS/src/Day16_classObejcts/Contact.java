package Day16_classObejcts;

public class Contact {
	
	String name;
	String phoneNumber;  
	String email;
	
	public void ContactInfo() {
		String Info;
		Info="name: "+name+ "  phoneNumber: "+phoneNumber+"  email: "+email;
		System.out.println(Info);
	}
	
	public void call() {
		System.out.println("Calling " + name + " ....");
	}
	
	public void sendMessage() {
		System.out.println("Sending message to " + phoneNumber + " | name: " + name);
	}
	
	public void sendEmail() {
		System.out.println("Sending email to " + email + " ....");
	}
}
