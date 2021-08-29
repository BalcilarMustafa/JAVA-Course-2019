package Day25_arrays_part2;

import java.util.Arrays;
import java.util.Scanner;

public class RainFall {

	public static void main(String[] args) {
		double [] rainfall=new double [12];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter in the following rainfall for the months ahead: " + rainfall.length);
		System.out.println("Month    Rainfall (In inches) ");
		
		
		System.out.println("January: ");
		rainfall[0] = sc.nextDouble();
		System.out.println("February: ");
		rainfall[1] = sc.nextDouble();
		System.out.println("March: ");
		rainfall[2] = sc.nextDouble();
		System.out.println("April: ");
		rainfall[3] = sc.nextDouble();
		System.out.println("May: ");
		rainfall[4] = sc.nextDouble();
		System.out.println("June: ");
		rainfall[5] = sc.nextDouble();
		System.out.println("July: ");
		rainfall[6] = sc.nextDouble();
		System.out.println("August: ");
		rainfall[7] = sc.nextDouble();
		System.out.println("September: ");
		rainfall[8] = sc.nextDouble();
		System.out.println("October: ");
		rainfall[9] = sc.nextDouble();
		System.out.println("November: ");
		rainfall[10] = sc.nextDouble();
		System.out.println("December: ");
		rainfall[11] = sc.nextDouble();
		
		totalRainfall(rainfall);
		avgRainfall(rainfall);
		mostRain(rainfall);
		leastRain(rainfall);
		
	}

	public static void totalRainfall(double[] array) {
		double sum=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+ array[i];	
		}System.out.println("The sum of all the rain is: "+sum+" inches");
	
	}
	
	public static void avgRainfall(double[] array) {
		double sum=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+ array[i];	
		}System.out.println("The average rainfall was: "+sum/array.length+" inches");
}
	
	public static void mostRain(double[] array) {
		double storage=array[0];
		for(int i=0;i<array.length;i++) {
			 if (array[i] > storage) {
				 storage = array[i];
	            }	
		}
		System.out.println("The max rain is: "+storage+" inches");
}
	
	public static void leastRain(double[] array) {
		double storage=array[0];
		for(int i=0;i<array.length;i++) {
			 if (array[i] < storage) {
				 storage = array[i];
	            }	
		}
		System.out.println("The min rain is: "+storage+" inches");
	}
}
