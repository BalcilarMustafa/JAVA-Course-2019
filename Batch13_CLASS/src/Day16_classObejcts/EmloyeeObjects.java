package Day16_classObejcts;

public class EmloyeeObjects {

	public static void main(String[] args) {

		Employee Emp1=new Employee();
		
		Emp1.name="Michael Night";
		Emp1.jobTitle="Accountant";
		Emp1.salary=10000;
		
		Employee Emp2=new Employee();
		
		Emp2.name="Knight Rider";
		Emp2.jobTitle="Black Lightning";
		Emp2.salary=12000;

		Emp1.attendMeeting();
		Emp1.work();
		Emp1.introduce();
		
		Emp2.attendMeeting();
		Emp2.work();
		Emp2.introduce();
	}
}
