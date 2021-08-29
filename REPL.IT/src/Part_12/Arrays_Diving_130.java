package Part_12;

import java.util.Scanner;

public class Arrays_Diving_130 {

	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);
		 
		    float[] score = new float[7];
		   
		    for(int i=0;i<score.length;i++) {
				    	System.out.println("Enter score for judge "+(i+1)+ ":");
				    	score[i]=input.nextFloat(); }
				    System.out.println("Enter difficulty:");
				    float difficulty=input.nextFloat();
				  
					// FINAL OUTPUT
				  float max=score[0];
				  float min=score[0];
				  
				   for(int i=0;i<score.length;i++) {
					   if(score[i]>max){max=score[i];}
					   if(score[i]<min){min=score[i];}
				                                   }   
				   float totalarr=0;
				   for(int i=0;i<score.length;i++) {
					   totalarr=totalarr+score[i];       }
				   totalarr=totalarr-(max+min);
				   
				   float Total= totalarr*difficulty*6/10;
				   System.out.printf("Total: %.2f",Total);
	}
}
