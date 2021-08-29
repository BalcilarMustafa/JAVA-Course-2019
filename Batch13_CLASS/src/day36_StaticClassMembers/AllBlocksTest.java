package day36_StaticClassMembers;

public class AllBlocksTest {

	public static void main(String[] args) {

		AllBlocks o1 = new AllBlocks();
		AllBlocks o2 = new AllBlocks(8);

	}
}

/*                    //no argumen constructor
First static init   //static herseyden önce ve sadece 1 kere calýstýrýlýr
Second static init  // instance blok her constructor calýstýðýnda calýstýrýlr ama
First instance init  // constructors dan önce calýstýrýlýr.
Second instance init
No argument constructor

First instance init  //argument constructor
Second instance init
One argument constructor

 */