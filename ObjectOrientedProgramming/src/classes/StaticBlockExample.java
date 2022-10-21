package classes;

class Employee {
	int empId;
	String name;
	static String company;
	
	static {
		Employee.company = "Wiley Edge";
	}
	
	public Employee(int id, String name) {
		this.empId = id;
		this.name = name;
	}
	
	public void displayDetails() {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Company: " + company);
	}
}

public class StaticBlockExample {

	public static void main(String[] args) {
		Employee emp = new Employee(100, "Geetika");
		emp.displayDetails();
	}
	
}
