package Day16_classObejcts;

public class ContactObjects {

	public static void main(String[] args) {

		Contact cont1= new Contact();
		
		cont1.name="Fredrik Johnson";
		cont1.phoneNumber="+4745678932";
		cont1.email="fredjohns@gmail.com";
		
		Contact cont2= new Contact();
		
		cont2.name="Adrian Olsen";
		cont2.phoneNumber="+4723459879";
		cont2.email="adrianolsen@gmail.com";
		
		cont1.ContactInfo();
		
		cont1.call();
		
		cont1.sendMessage();
		
		cont1.sendEmail();
		
		cont2.ContactInfo();
		
		cont2.call();
		
		cont2.sendMessage();
		
		cont2.sendEmail();
	}
}
