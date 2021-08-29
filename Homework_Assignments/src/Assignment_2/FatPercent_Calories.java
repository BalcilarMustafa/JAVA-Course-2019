package Assignment_2;

public class FatPercent_Calories {
	public static void main(String[] args) {

	double fatCalori=29;
	double totalCalori=80;
	double percentFatCalori=0;
	percentFatCalori=fatCalori/totalCalori;
	
	if(fatCalori>totalCalori) {
		System.out.println("The input is invalid ");
	
	  }else {
		  
		  
		  		if(percentFatCalori<0.30) {
		  			
			  System.out.println("The percentage of calories is: " + percentFatCalori + " and the food is low in fat");
			
		  			}else {
		  				
			  System.out.println("The percentage of calories is: " + percentFatCalori + " and the food is high in fat");  
				  
		}	 
		  
}	
	
}
}