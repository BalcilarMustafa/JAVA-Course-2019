package Day13_methods_Part1;

public class task63_calculateCelcius {

	public static void main(String[] args) {
		calculateCelcius(32);
		calculateCelcius(50);
					
	}

	public static void calculateCelcius(int F) {
		
	//T(°C) = (T(°F) - 32) / 1.8
	double C=(F - 32) / 1.8;
	System.out.println(C);
  }
}
