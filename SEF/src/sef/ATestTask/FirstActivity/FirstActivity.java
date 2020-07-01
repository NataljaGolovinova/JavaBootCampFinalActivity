package sef.ATestTask.FirstActivity;

import java.util.*;

public class FirstActivity {
	public static void main(String[] args) {
		// TODO 1 Create collection of employee (more than 5) list or map
		// System.out.println() result
		List<Employee> employeeList = new ArrayList<Employee>();
		Employee a = new Employee("Bob", "Marley", 45, 15, "Developer", "Apple", 1058.20);
		employeeList.add(a);

		a = new Employee("Bon", "Jovi", 64, 21, "Tester", "Google", 2001.05);
		employeeList.add(a);

		a = new Employee("Elton", "John", 71, 9, "Singer", "Sony", 111111.11);
		employeeList.add(a);

		a = new Employee("Axel", "Rose", 67, 11, "Rockstar", "Guns", 6587.55);
		employeeList.add(a);

		a = new Employee("Freddy", "Mercury", 29, 32, "Seller", "Karcher", 109.20);
		employeeList.add(a);

		a = new Employee("David", "Gylmor", 19, 8, "Cashier", "McDonalds", 99.43);
		employeeList.add(a);

		// TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		// System.out.println() result

        for (int i = employeeList.size() - 1; i > 0; i--) 
        {
            for (int j = 0; j < i; j++) 
            {
                if (employeeList.get(j).getSalary() > employeeList.get(j + 1).getSalary()) 
                { 
                    Employee v = employeeList.get(j);
                    employeeList.set(j, employeeList.get(j + 1));
                    employeeList.set(j + 1, v);
                }
            }
        }
		
		for (Employee e : employeeList) {
			System.out.println(e.introduce() + " and I earn " + e.getSalary() + " EUR");
		}
				
		System.out.println("**********");
		
		// TODO 3 create instance of a Student as a Person ->
		Person p = new Student("Mik", "Jagger", 38, "of Alabama");
		
		// than ask him introduce()
		System.out.println(p.introduce());
		
		// than make them Student
		Student s = (Student)p;
		
		// than ask him introduce()
		System.out.println(s.introduce());
		
		
		System.out.println("**********");

		
		// TODO 4 Create method for full change of employee information
		// for example some employee change his work

		Employee e4 = new Employee("Sarah", "Brightman", 18, 666, "CEO", "N. Y. H.", 293487.34);
		System.out.println(e4.introduce());
		e4.setEverything("Sarah", "Brightman", 18, 666, "Team leader", "Accenture", 293487.34);
		System.out.println(e4.introduce());
	
	}

}
