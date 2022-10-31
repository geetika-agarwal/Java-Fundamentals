package collectionSet;

import java.util.Iterator;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {
	private int empId;
	private String empName;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

	@Override
	public int compareTo(Employee e1) {
		return this.getEmpId() - e1.getEmpId();
	}
}

public class EmployeeTreeSetAssessment {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpId(27);
		e1.setEmpName("ABC");

		Employee e2 = new Employee();
		e2.setEmpId(75);
		e2.setEmpName("DEF");

		Employee e3 = new Employee();
		e3.setEmpId(196);
		e3.setEmpName("GHI");

		Employee e4 = new Employee();
		e4.setEmpId(259);
		e4.setEmpName("JKL");

		Employee e5 = new Employee();
		e5.setEmpId(17);
		e5.setEmpName("XYZ");

		TreeSet<Employee> treeSet = new TreeSet<Employee>();
		treeSet.add(e1);
		treeSet.add(e2);
		treeSet.add(e3);
		treeSet.add(e4);
		treeSet.add(e5);

		Iterator<Employee> itr = treeSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
