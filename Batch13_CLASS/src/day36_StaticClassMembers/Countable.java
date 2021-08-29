package day36_StaticClassMembers;

public class Countable {

	    // int instanceCount; yazarsak var. object e ait cunku statik de�il, art�rma olmaz
    static int instanceCount = 0;  // var. class a ait object e de�il (static den dolay�)
	
	public Countable() {
		instanceCount++;
	}
	
	public int getInstanceCount() {
		return instanceCount;
	}
}
