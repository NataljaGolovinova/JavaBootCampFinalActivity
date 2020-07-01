package sef.ATestTask.FirstActivity;

public class Employee extends Person {

	private int empId;
	private String jobTitle;
	private String companyName;
	private double salary;

	// TODO 1 create different constructors
	public Employee() {
		super();
	}

	public Employee(String firstName, String secondName, int age) {
		super(firstName, secondName, age);
	}

	public Employee(String firstName, String secondName, int age, int empId, String jobTitle, String companyName,
			double salary) {
		super(firstName, secondName, age);
		this.empId = empId;
		this.jobTitle = jobTitle;
		this.companyName = companyName;
		this.salary = salary;
		
	}

	// TODO 2 add getters and setters

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// TODO 3 override method announce()
	public String introduce() {
		return super.introduce() + ", I work as " + jobTitle + " in " + companyName;
	}

	public void setEverything(String firstName, String secondName, int age, int empId, String jobTitle, String companyName,
			double salary) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
		this.empId = empId;
		this.jobTitle = jobTitle;
		this.companyName = companyName;
		this.salary = salary;
	}
}