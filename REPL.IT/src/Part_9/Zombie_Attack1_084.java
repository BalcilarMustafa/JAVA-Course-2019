package Part_9;

import java.util.Scanner;

public class Zombie_Attack1_084 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    int inhabitants = scan.nextInt();
	
	    for(int i=0;inhabitants>=1;i++) {
	    	System.out.println("Day "+i+" ["+inhabitants+"]");
	    	inhabitants=inhabitants/2;
	    								}
	    	System.out.println("---- EXTINCT ----");
											}
}
