package Part_6;

import java.util.Scanner;

public class Laptop_Configurator_056 {

	public static void main(String[] args) {

		    double price = 0;
		    double screenSize;
			String storageType, screenType, cpu;
			int ram = 0 ;
			int memorysize;
			
			Scanner scan = new Scanner(System.in);

            System.out.println("Select screen size:");
			screenSize= scan.nextDouble();
			
			if(screenSize==13.3) {
				price=price+200;
				
			}else if(screenSize==15.0) {
				price=price+300;
				
			}else if(screenSize==17.3) {
				price=price+400;
			}
			
			System.out.println("Select CPU type:");
			cpu= scan.next();
		
			
			if(cpu.equals("i3")) {
				price=price+150;
				
			}else if(cpu.equals("i5")) {
				price=price+250;
				
			}else if(cpu.equals("i7")) {
				price=price+350;
			}
			
			System.out.println("Select RAM size:");
			ram= scan.nextInt();
			price=price+50*ram/4;
			
			System.out.println("Select storage type:");
			storageType= scan.next();
			
			System.out.println("Enter memory size:");
			memorysize= scan.nextInt();
			
			if(storageType.equals("HDD")) {
				price=price+(memorysize/500)*50;
				
			}else if(storageType.equals("SSD")) {
				price=price+(memorysize/500)*100;
			}
			
			System.out.println("Enter screen resolution:");
			screenType= scan.next();
			
			if(screenType.contentEquals("FULLHD")) {
				price=price+100;
				
			}else if(screenType.contentEquals("4K")) {
				price=price+200;
			}
			
			System.out.println("Laptop price is: $"+ price);
	}
}
