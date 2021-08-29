package Part_16;

public class Methods_with_Return10_Thunder_Blazz_165 {

	public static void main(String[] args) {

     System.out.println(getThunderBlazz(true,false,1,2,3));

}

public static boolean getThunderBlazz(boolean available,boolean gift, int ingredient1, int ingredient2, int ingredient3){
	
	if((available==true) || (gift==true)) {return true;}  
	if(( ingredient1==1) && (ingredient2==2) && (ingredient3==3)) {return true;} 	    
	if(( ingredient1==3) && (ingredient2==1) && (ingredient3==2)) {return true;}
	else {return false;}
}
}
