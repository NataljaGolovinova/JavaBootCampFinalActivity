package sef.ATestTask.FirstActivity;

//TODO Implement class Student with parent Person

public class Student extends Person {
	String schoolName;

	public Student() {
		super();
	}

	public Student(String firstName, String secondName, int age) {
		super(firstName, secondName, age);
	}

	public Student(String firstName, String secondName, int age, String schoolName) {
		super(firstName, secondName, age);
		this.schoolName = schoolName;
	}

	public String introduce() {
		return "I study in university " + schoolName;
		
	}
}
