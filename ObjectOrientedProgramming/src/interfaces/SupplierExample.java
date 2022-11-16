package interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

class Employee1 {
	private String Id;
	private String firstName;
	private String lastName;
	private String gender;
	private Integer age;

	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee1(String id, String firstName, String lastName, String gender, Integer age) {
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

public class SupplierExample {
	public static void main(String[] args) {

		// This interface will not take any parameters and will return one value when
		// called using the get() method

		Supplier<Double> getRandom = () -> Math.random();
		System.out.println(getRandom.get());

		Supplier<List<Employee1>> emp = () -> {
			ArrayList<Employee1> employees = new ArrayList<Employee1>();

			Employee1 e1 = new Employee1("101", "Geetika", "Agarwal", "F", 22);
			employees.add(e1);
			employees.add(new Employee1("102", "Dheeren", "Kumar", "M", 17));
			employees.add(new Employee1("103", "Ravi", "Kumar", "M", 49));
			employees.add(new Employee1("104", "Santosh", "Agarwal", "F", 43));

			return employees;
		};

		System.out.println(emp.get());

	}
}
