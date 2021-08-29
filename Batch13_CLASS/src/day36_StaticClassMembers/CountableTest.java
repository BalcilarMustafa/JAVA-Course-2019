package day36_StaticClassMembers;

public class CountableTest {

	public static void main(String[] args) {
		
		int objectCount;
		
		Countable obj1 = new Countable(); // 0+1=1
		Countable obj2 = new Countable(); // 1+1=2
		Countable obj3 = new Countable(); // 2+1=3
		Countable obj4 = new Countable(); // 3+1=4

		objectCount = obj1.getInstanceCount();
		System.out.println(objectCount); //4
		System.out.println(obj2.getInstanceCount()); //4
		
		System.out.println(Countable.instanceCount); // 4 -class name ile çaðýrma
		
	}
}
