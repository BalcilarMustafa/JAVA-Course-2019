package day36_StaticClassMembers;

public class Dinner {

	static int pizzaSlice = 8; //static olmazsa her object(her aile ferdi) 8 dilim pizzaya sahip
							   //static olunca t�m aile 8 dilim pizzay� payla��yolar yedik�e azal�yo :)
	public void takeASlice() {
		pizzaSlice--;
	}
	
	public void takeASlice(int count) {
		pizzaSlice-=count;
	}
}
