package problems;

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
			this.salary = 0.0;
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
			this.salary = 0.0;
		else
			this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
	}

}

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee("King", "Smith", 3000.0);
		Employee e2 = new Employee("Queen", "Eli", 2000.0);
		System.out.println("Before Raise..");
		System.out.println("Salary of Employee 1: " + e1.getSalary());
		System.out.println("Salary of Employee 2: " + e2.getSalary());

		double sal1 = e1.getSalary();
		double sal2 = e2.getSalary();

		e1.setSalary(sal1 + 0.1 * sal1);
		e2.setSalary(sal2 + 0.1 * sal2);

		System.out.println("----------------------------------------");
		System.out.println("After Raise...");

		System.out.println("Salary of Employee 1: " + e1.getSalary());
		System.out.println("Salary of Employee 2: " + e2.getSalary());
	}
}
