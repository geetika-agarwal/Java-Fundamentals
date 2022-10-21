package polymorphism;

// This is a simple program for method overriding. Method 
// Overriding can be implemented by using inheritance.
// Sub class is used for overriding the methods in the
// Parent class.

class Person {
	String name;
	String city;

	Person(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public void showData() {
		System.out.println("Name: " + name);
		System.out.println("City: " + city);
	}
}

class Employee extends Person {
	String designation;
	float salary;

	Employee(String name, String city, String designation, float salary) {
		super(name, city);
		this.designation = designation;
		this.salary = salary;
	}

	@Override
	public void showData() {
		super.showData();
		System.out.println("Designation: " + designation);
		System.out.println("Salary: " + salary);
	}

}

class Course extends Person {
	String courseName;
	double courseFee;

	Course(String name, String city, String courseName, double courseFee) {
		super(name, city);
		this.courseName = courseName;
		this.courseFee = courseFee;
	}

	@Override
	public void showData() {
		super.showData();
		System.out.println("Course Name: " + courseName);
		System.out.println("Course Fee: " + courseFee);
	}
}

public class Overriding {
	public static void main(String[] args) {
		Employee emp = new Employee("Geetika", "Hyderabad", "Software Developer", 700000.0F);
		emp.showData();
		System.out.println("===========================");
		Course cour = new Course("Ravi", "Mumbai", "Computer Science", 300000.00);
		cour.showData();
	}
}
