package misc;

import java.util.HashSet;
import java.util.Set;

/*
 * equals() and hashCode() Methods: 
 * - These methods have been defined in Object Class
 * 
 * equals():
 * - Verifies the equality of two objects.
 * - This methods checks whether two object reference of same class are equal or not.
 * - By default the two objects are equal if they refer to the same memory location.
 *  
 */

class Employee {
	private Integer id;
	private String firstName;
	private String lastName;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj == this)
			return true;
		if (this.getClass() != obj.getClass())
			return false;
		Employee emp = (Employee) obj;
		return (this.getId() == emp.getId());
	}

	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + this.getId();
		return result;
	}

	/**
	 * Conclusion, If e1.equals(e2) is true then e1.hashCode() == e2.hashCode() is
	 * always true. But, If e1.hashCode() == e2.hashCode(), then e1.equals(e2) is
	 * not always true.
	 */
}

public class EqualsAndHashCodeExample {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();

		e1.setId(101);
		e2.setId(101);

		System.out.println(e1.equals(e2));

		/**
		 * This will only add one employee in the set as both the employees have the
		 * same employee id.
		 */

		Set<Employee> set = new HashSet<Employee>();
		set.add(e1);
		set.add(e2);

		System.out.println(e1);
		System.out.println(e1.hashCode() == e2.hashCode());
	}
}
