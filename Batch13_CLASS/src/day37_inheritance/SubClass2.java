package day37_inheritance;

public class SubClass2 extends SuperClass2 {//child

	public SubClass2() {
		super(10); // biz bu ifadeyi yazmazsak java otomatik olarak "super();" yazar onun yerine default olarak biz gormeden
		System.out.println("This is the subclass constructor");	
	}
}

//this()  keyword� ile ayn� class icindeki constructor lar� ca��rabiliyorduk.

//super() keyword� ile de farkl� bir class dan (inherited class dan) constructorlar� ca��r�yoruz.