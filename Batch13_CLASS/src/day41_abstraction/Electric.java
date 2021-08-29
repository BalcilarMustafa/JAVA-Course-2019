package day41_abstraction;

public interface Electric {
												
public static final boolean HAS_BATTERIES=true; // interface can have only  public static final field 
                                                 //(Before java 8.0 it was not field, only abstract methods)
	
	boolean HAS_BATTERIES2=false; //public final static (automatically. don't have to write)
	
	public abstract void charge(); // interface can have only  public abstract methods(Excluding default and static methods)
	
	void charge2(); //public abstract (automatically. don't have to write)
	
	
	public default void methodA() {  // interface can have also default method
		
		//code
		
	}
	
	public static void MethodB() {  // interface can have also static method. (Before java 8.0 it was only abstract methods)
		//code
	}
}
