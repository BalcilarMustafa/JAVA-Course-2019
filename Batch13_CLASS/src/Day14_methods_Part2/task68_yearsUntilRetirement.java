package Day14_methods_Part2;

public class task68_yearsUntilRetirement {

	public static void main(String[] args) {
		
		yearsUntilRetirement("John", 1975);

	}
	
public static int ageCalculator(int yearBirth) {
	
		int yearCurrent=2020;
		int age = yearCurrent - yearBirth;
		return age;
}

public static void yearsUntilRetirement(String name, int year) {
	
	int retirementAge;
	
	retirementAge = 65 - ageCalculator(year);
	System.out.println(name + " retires in " + retirementAge + " years" );
	}
}
