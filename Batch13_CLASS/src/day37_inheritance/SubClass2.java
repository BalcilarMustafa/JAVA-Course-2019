package day37_inheritance;

public class SubClass2 extends SuperClass2 {//child

	public SubClass2() {
		super(10); // biz bu ifadeyi yazmazsak java otomatik olarak "super();" yazar onun yerine default olarak biz gormeden
		System.out.println("This is the subclass constructor");	
	}
}

//this()  keywordü ile ayný class icindeki constructor larý caðýrabiliyorduk.

//super() keywordü ile de farklý bir class dan (inherited class dan) constructorlarý caðýrýyoruz.