package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class AllTestForClasses extends TestCase {

	public void testAllClasses() {
		
		Person person = new Person();
		assertEquals("In class Person, setEverything() does not work propertly", "Unknown", person.getFirstName());
		assertEquals("In class Person, setEverything() does not work propertly", "Unknown", person.getSecondName());
		assertEquals("In class Person, setEverything() does not work propertly", 0, person.getAge());
		
		person = new Person("Mary", "Poppins", 43);
		assertEquals("In class Person, setEverything() does not work propertly", "Mary", person.getFirstName());
		assertEquals("In class Person, setEverything() does not work propertly", "Poppins", person.getSecondName());
		assertEquals("In class Person, setEverything() does not work propertly", 43, person.getAge());
		
		person.setFirstName("John");
		assertEquals("In class Person, getFirstName() or setFirstName() does not work propertly", "John", person.getFirstName());

		person.setSecondName("Lennon");
		assertEquals("In class Person, getSecondName() or setSecondName() does not work propertly", "Lennon", person.getSecondName());

		person.setAge(55);
		assertEquals("In class Person, getAge() or setAge() does not work propertly", 55, person.getAge());

		assertEquals("In class Person, announce() method does not work propertly", "I am John Lennon", person.announce());

		assertEquals("In class Person, introduce() method does not work propertly", "My name is John Lennon and I am 55 years old",
				person.introduce());

		////////////////////////////////////////////////////////////////

		Employee employee = new Employee();
		assertEquals("In class Employee, setEverything() does not work propertly", "Unknown", employee.getFirstName());
		assertEquals("In class Employee, setEverything() does not work propertly", "Unknown", employee.getSecondName());
		assertEquals("In class Employee, setEverything() does not work propertly", 0, employee.getAge());
		
		employee = new Employee("Darth", "Vader", 56);
		assertEquals("In class Employee, setEverything() does not work propertly", "Darth", employee.getFirstName());
		assertEquals("In class Employee, setEverything() does not work propertly", "Vader", employee.getSecondName());
		assertEquals("In class Employee, setEverything() does not work propertly", 56, employee.getAge());
		
		employee = new Employee("Bob", "Bobson", 38, 3, "Driver", "USA", 456.85);
		assertEquals("In class Employee, setEverything() does not work propertly", "Bob", employee.getFirstName());
		assertEquals("In class Employee, setEverything() does not work propertly", "Bobson", employee.getSecondName());
		assertEquals("In class Employee, setEverything() does not work propertly", 38, employee.getAge());
		assertEquals("In class Employee, setEverything() does not work propertly", 3, employee.getEmpId());
		assertEquals("In class Employee, setEverything() does not work propertly", "Driver", employee.getJobTitle());
		assertEquals("In class Employee, setEverything() does not work propertly", "USA", employee.getCompanyName());
		assertEquals("In class Employee, setEverything() does not work propertly", 456.85, employee.getSalary());
				
		employee.setFirstName("Marylin");
		assertEquals("In class Employee, getFirstName() or setFirstName() does not work propertly", "Marylin", employee.getFirstName());

		employee.setSecondName("Monroe");
		assertEquals("In class Employee, getSecondName() or setSecondName() does not work propertly", "Monroe", employee.getSecondName());

		employee.setAge(19);
		assertEquals("In class Employee, getAge() or setAge() does not work propertly", 19, employee.getAge());

		employee.setEmpId(8);
		assertEquals("In class Employee, getAge() or setAge() does not work propertly", 8, employee.getEmpId());

		employee.setJobTitle("Cleaner");
		assertEquals("In class Employee, getAge() or setAge() does not work propertly", "Cleaner", employee.getJobTitle());

		employee.setCompanyName("Sony");
		assertEquals("In class Employee, getAge() or setAge() does not work propertly", "Sony", employee.getCompanyName());

		employee.setSalary(1000);
		assertEquals("In class Employee, getAge() or setAge() does not work propertly", 1000.0, employee.getSalary());

		assertEquals("In class Employee, announce() method does not work propertly", "I am Marylin Monroe", employee.announce());

		assertEquals("In class Employee, introduce() method does not work propertly",
				"My name is Marylin Monroe and I am 19 years old, I work as Cleaner in Sony", employee.introduce());

		employee.setEverything("Anna", "Karenina", 28, 5, "Unemployed", "Russia", 888.55);
		assertEquals("In class Employee, setEverything() does not work propertly", "Anna", employee.getFirstName());
		assertEquals("In class Employee, setEverything() does not work propertly", "Karenina", employee.getSecondName());
		assertEquals("In class Employee, setEverything() does not work propertly", 28, employee.getAge());
		assertEquals("In class Employee, setEverything() does not work propertly", 5, employee.getEmpId());
		assertEquals("In class Employee, setEverything() does not work propertly", "Unemployed", employee.getJobTitle());
		assertEquals("In class Employee, setEverything() does not work propertly", "Russia", employee.getCompanyName());
		assertEquals("In class Employee, setEverything() does not work propertly", 888.55, employee.getSalary());
		
		////////////////////////////////////////////////////////////////
		
		Student student = new Student();
		assertEquals("In class Student, setEverything() does not work propertly", "Unknown", student.getFirstName());
		assertEquals("In class Student, setEverything() does not work propertly", "Unknown", student.getSecondName());
		assertEquals("In class Student, setEverything() does not work propertly", 0, student.getAge());
		
		student = new Student("Laila", "Berzina", 20);
		assertEquals("In class Student, setEverything() does not work propertly", "Laila", student.getFirstName());
		assertEquals("In class Student, setEverything() does not work propertly", "Berzina", student.getSecondName());
		assertEquals("In class Student, setEverything() does not work propertly", 20, student.getAge());
		
		student = new Student("Zemgus", "Pauls", 22, "LLU");
		assertEquals("In class Student, setEverything() does not work propertly", "Zemgus", student.getFirstName());
		assertEquals("In class Student, setEverything() does not work propertly", "Pauls", student.getSecondName());
		assertEquals("In class Student, setEverything() does not work propertly", 22, student.getAge());
		
		student.setFirstName("Janis");
		assertEquals("In class Student, getFirstName() or setFirstName() does not work propertly", "Janis", student.getFirstName());

		student.setSecondName("Ozols");
		assertEquals("In class Student, getSecondName() or setSecondName() does not work propertly", "Ozols", student.getSecondName());

		student.setAge(21);
		assertEquals("In class Student, getAge() or setAge() does not work propertly", 21, student.getAge());
				
		assertEquals("In class Student, announce() method does not work propertly", "I am Janis Ozols", student.announce());

		assertEquals("In class Student, introduce() method does not work propertly", "I study in university LLU",
				student.introduce());

	}
}