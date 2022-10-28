package serialization;

public class Employee extends Person {

	double salary;
	String designation;

	public Employee(int id, String name, double salary, String designation) {
		super(id, name);
		this.salary = salary;
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", designation=" + designation + ", id=" + id + ", name=" + name + "]";
	}
}
