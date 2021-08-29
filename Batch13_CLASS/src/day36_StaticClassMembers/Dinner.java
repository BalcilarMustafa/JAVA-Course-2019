package day36_StaticClassMembers;

public class Dinner {

	static int pizzaSlice = 8; //static olmazsa her object(her aile ferdi) 8 dilim pizzaya sahip
							   //static olunca tüm aile 8 dilim pizzayý paylaþýyolar yedikçe azalýyo :)
	public void takeASlice() {
		pizzaSlice--;
	}
	
	public void takeASlice(int count) {
		pizzaSlice-=count;
	}
}
