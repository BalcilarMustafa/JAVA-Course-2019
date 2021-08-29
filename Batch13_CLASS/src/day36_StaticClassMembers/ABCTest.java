package day36_StaticClassMembers;

public class ABCTest {

	public static void main(String[] args) {

		ABC.m1();  //call method thru ONLY static way
		
		
		//ABC o1 = new ABC();  //gives error because constructor is "private"
		//o1.m1(); // doesnt work
		
		//Whenever all of your methods in your class are static, and you want everyone to call them
		//static way(Classname.methodName(), then you can simply make your constructor private
			
	}
	
	public static void print() {
		//static int a  = 5; // Local variables can not be static (local variables: variables in a method)
          //Because static variables belong to class. (bir method içine hapsedemezsin) 
	}
}
