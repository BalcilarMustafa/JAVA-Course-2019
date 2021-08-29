package Day35_encapsulation;

public class Job {

	private String title;
	private String company;
	private double annualSalary;
	
	public Job() {
		System.out.println("No-args constructor");
		this.title="undefined";
		this.company="undefined";
	}
	
	public Job(String title) {
		System.out.println("One-arg constructor");
		this.title=title;
		this.company="undefined";
	}

	public Job(String title, String company, double annualSalary) {
		System.out.println("Three-args constructor");
		setTitle(title);
		setCompany(company);
		this.annualSalary = annualSalary;
	}

	public String getTitle() {
		return title;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}
	
	public String getCompany() {
		return company;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public void setTitle(String title) {
		//condition
		this.title = title;
	}

	public void setCompany(String company) {
		//condition
		this.company = company;
	}
	
	public String toString() {
		return "Job [title=" + title + ", company=" + company + ", annualSalary=" + annualSalary + "]";
	}	
}
