package Day16_classObejcts;

public class CellPhone {
	
	String brand;
	double screenSize;
	String color;
	double price;
	
	public void call() {
		System.out.println(brand+" Calling....");
	}
	
	public void message() {
		System.out.println(brand+" Sending txt message....");
	}
	
	public void takeAphoto() {
		System.out.println(brand+" Taking a photo");
	}
}
