package Assignment_2;

public class BMI_Index {

	public static void main(String[] args) {
		
			
			int pounds=32;
			int inches=70;

			double mass_KG=pounds*2.2;               // kg
			double height_Meter=inches*0.0254;       // meter

			double BMI= mass_KG / (height_Meter * height_Meter);  

			
			
			if(BMI<18.5) {
				System.out.println("Underweight");

			}else if(BMI>=18.5 && BMI<25) {
				System.out.println("Normal Weight");

			}else if(BMI>=25 && BMI<30) {
				System.out.println("Overweight");

			}else if(BMI>=30) {
				System.out.println("Obese");
		}

	}

}
