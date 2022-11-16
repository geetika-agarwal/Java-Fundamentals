package interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee {
	private String Id;
	private String firstName;
	private String lastName;
	private String gender;
	private Integer age;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String id, String firstName, String lastName, String gender, Integer age) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", age=" + age + "]";
	}

}

class EmployeePredicate {
	static Predicate<Employee> isAdultFemale() {
		return e -> e.getAge() > 18 && e.getGender().equalsIgnoreCase("F");
	}

	public static Predicate<Employee> isAdultMale() {
		return e -> e.getAge() > 18 && e.getGender().equalsIgnoreCase("M");
	}

	public static Predicate<Employee> isAgeMoreThan(Integer age) {
		return e -> e.getAge() > age;
	}

	public static List<Employee> filterEmployee(List<Employee> employees, Predicate<Employee> predicate) {
		return employees.stream().filter(predicate).collect(Collectors.<Employee>toList());
	}
}

public class MultiplePredicateExample {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();

		Employee e1 = new Employee("101", "Geetika", "Agarwal", "F", 22);
		employees.add(e1);
		employees.add(new Employee("102", "Dheeren", "Kumar", "M", 17));
		employees.add(new Employee("103", "Ravi", "Kumar", "M", 49));
		employees.add(new Employee("104", "Santosh", "Agarwal", "F", 43));

		System.out.println(EmployeePredicate.filterEmployee(employees, EmployeePredicate.isAdultFemale()));
		System.out.println(EmployeePredicate.filterEmployee(employees, EmployeePredicate.isAdultMale().negate())); // negate()
																													// is
																													// like
																													// not
																													// function
		System.out.println(EmployeePredicate.filterEmployee(employees, EmployeePredicate.isAgeMoreThan(16)));
	}
}
