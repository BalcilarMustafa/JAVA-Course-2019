package Day35_encapsulation;

import java.util.ArrayList;

public class JobTest {

	public static void main(String[] args) {
		
		Job job1 = new Job();
		Job job2 = new Job("Java Developer");
		Job job3 = new Job("SDET", "Amazon", 130000);
		System.out.println(job3);
		System.out.println("-------------------------------------------------------------");
		System.out.println(job3.toString());
		System.out.println(job2.toString());
		System.out.println(job1.toString());
		System.out.println(job3.getCompany());
		System.out.println("-------------------------------------------------------------");
		//create a list of Jobs
		//add 5 different jobs with company salary title
		
		ArrayList<Job> jobList = new ArrayList<>();
		System.out.println(jobList);
		jobList.add(job3);
		System.out.println(jobList);
		System.out.println("-------------------------------------------------------------");
		jobList.add(new Job("SM", "abc", 190000));
		System.out.println(jobList);
		jobList.add(new Job("BA", "xxx", 98000));
		jobList.add(new Job("FT", "kkk", 100000));
		System.out.println(jobList);
		System.out.println("-------------------------------------------------------------");
		
		System.out.println(jobList.toString());
		System.out.println(jobList.size());
		System.out.println(jobList.get(1));
		System.out.println(jobList.get(1).getCompany());  // jobList.get(0) = job3
		
		//find the highest paying job and print it 		
		double maxSalary = 0;
		int heighestIndex=0;
		
		
		for(int i=0;i<jobList.size();i++) {
			if(jobList.get(i).getAnnualSalary()>maxSalary) {
				maxSalary=jobList.get(i).getAnnualSalary();
				heighestIndex=i; //which index has the highest salary
			}
		}
		
		System.out.println("Max Salary is: "+ jobList.get(heighestIndex).getAnnualSalary());

	}

}
