package day36_StaticClassMembers;

public class StudentTest {

public static void main(String[] args) {
		
		
		Student s1 = new Student("Mike", 30, 1234);
		Student s2 = new Student("Smith",35,999);
		Student s3 = new Student("Ozzy",15,001);
		
		s1.school = "Cybertek2"; //1 object de�i�tirince t�m objectler etkileniyor static sayesinde
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	
		System.out.println(Student.school); //static olunca class ad�yla da �a��rabiliyoruz hicbir object olusturmadan c�nk� school var. class a ait
		System.out.println(s1.school); //object ad�yla da ca�rabiliyoruz
		
		//instance variable lara sadece object �zerinden eri�ebiliriz.
	}
}
