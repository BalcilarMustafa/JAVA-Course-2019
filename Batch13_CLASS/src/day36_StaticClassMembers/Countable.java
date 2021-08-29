package day36_StaticClassMembers;

public class Countable {

	    // int instanceCount; yazarsak var. object e ait cunku statik deðil, artýrma olmaz
    static int instanceCount = 0;  // var. class a ait object e deðil (static den dolayý)
	
	public Countable() {
		instanceCount++;
	}
	
	public int getInstanceCount() {
		return instanceCount;
	}
}
