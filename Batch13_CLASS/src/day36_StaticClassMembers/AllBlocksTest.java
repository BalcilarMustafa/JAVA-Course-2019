package day36_StaticClassMembers;

public class AllBlocksTest {

	public static void main(String[] args) {

		AllBlocks o1 = new AllBlocks();
		AllBlocks o2 = new AllBlocks(8);

	}
}

/*                    //no argumen constructor
First static init   //static herseyden �nce ve sadece 1 kere cal�st�r�l�r
Second static init  // instance blok her constructor cal�st���nda cal�st�r�lr ama
First instance init  // constructors dan �nce cal�st�r�l�r.
Second instance init
No argument constructor

First instance init  //argument constructor
Second instance init
One argument constructor

 */