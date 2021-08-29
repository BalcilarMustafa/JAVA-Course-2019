package Part_14;

public class Methods5_Simple_Print_Pattern_143 {

	 public static void printHollowRect() {
	         int rows=5;              
	         int colm=5; 
	                
	         for(int i=1 ;i<=rows;i++){                               
	                  for(int j=1;j<=colm;j++){                             

	                        if(i==1 || j==1 || i==rows || j==colm)     
	                              System.out.print("*");
	                          else
	                               System.out.print(" ");}

	                        System.out.println(); }
	                                        }
	  
	  public static void main(String[] args) {
	   
	    printHollowRect();
	                                          }
}