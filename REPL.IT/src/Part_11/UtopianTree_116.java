package Part_11;

public class UtopianTree_116 {

	public static void main(String[] args) {

		int treesize=0;
		for(int i = 1; i <= 10;  i++) {

			if(i<=3) {
				treesize++;
				System.out.println("year"+ i +" - growth 1 cm" );
				System.out.println("tree size: " +treesize+"cm");
				
			}else if(i>=4 && i<=10 ) {
				treesize=treesize+2;
				System.out.println("year"+ i +" - growth 2 cm" );
				System.out.println("tree size: " +treesize+"cm");
				                      }
	                                    }
	}
}
