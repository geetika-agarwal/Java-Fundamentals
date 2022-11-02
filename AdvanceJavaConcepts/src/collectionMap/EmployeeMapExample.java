package collectionMap;

import java.util.HashMap;
import java.util.Map;

class Employee {
	int id;
	String name;
	double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}

public class EmployeeMapExample {
	public static void main(String[] args) {
		Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();

		Employee e1 = new Employee(101, "King", 20000.00);
		Employee e2 = new Employee(102, "Queen", 30000.00);
		Employee e3 = new Employee(103, "Prince", 25000.00);
		Employee e4 = new Employee(104, "John", 29000.00);
		Employee e5 = new Employee(105, "Smith", 35000.00);

		empMap.put(e1.getId(), e1);
		empMap.put(e2.getId(), e2);
		empMap.put(e3.getId(), e3);
		empMap.put(e4.getId(), e4);
		empMap.put(e5.getId(), e5);

		empMap.entrySet().forEach((emp) -> {
			System.out.println(emp.getKey() + " - " + emp.getValue());
		});
	}
}
