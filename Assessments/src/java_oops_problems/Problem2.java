package java_oops_problems;

/*2. Create a class called Employee that includes three pieces of information as instance variables—
 * a first name (type String), a last name (type String) and a monthly salary (double). 
 * Your class should have a constructor that initializes the three instance variables. 
 * Provide a set and a get method for each instance variable. 
 * If the monthly salary is not positive, set it to 0.0. 
 * Write a test application named EmployeeTest that demonstrates class Employee’s capabilities. 
 * Create two Employee objects and display each object’s yearly salary. 
 * Then give each Employee a 10% raise and display each Employee’s yearly salary again.*/

class Employee {
	String firstName;
	String lastName;
	double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstName, String lastName, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		if (salary < 0)
			this.salary = 0;
		else
			this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary < 0)
			this.salary = 0;
		else
			this.salary = salary;
	}
}

public class Problem2 {
	public static void main(String[] args) {
		Employee e1 = new Employee("Geetika", "Agarwal", 35000.0);
		Employee e2 = new Employee("Dheeren", "Kumar", 29000.0);

		System.out.println("Salary of " + e1.getFirstName() + " is: " + e1.getSalary());
		System.out.println("Salary of " + e2.getFirstName() + " is: " + e2.getSalary());

		e1.setSalary(1.1 * e1.getSalary());
		e2.setSalary(1.1 * e1.getSalary());

		System.out.println(e1.getFirstName() + "'s salary after 10% raise: " + e1.getSalary());
		System.out.println(e2.getFirstName() + "'s salary after 10% raise: " + e2.getSalary());
	}
}
