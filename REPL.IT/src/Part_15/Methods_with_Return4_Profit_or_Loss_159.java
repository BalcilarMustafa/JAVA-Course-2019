package Part_15;

public class Methods_with_Return4_Profit_or_Loss_159 {

	 public String c_profits (int buyPrice,int sellPrice){
		    //your code here
		   String str="";
		   if(buyPrice<sellPrice) {str="profit";}
		   if(buyPrice>sellPrice) {str="loss";}
		   if(buyPrice==sellPrice) {str="no loss";}
		   return str;
 }
}
