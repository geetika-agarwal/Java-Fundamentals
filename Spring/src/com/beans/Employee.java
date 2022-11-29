package com.beans;

public class Employee {
	int empId;
	String empName;
	int deptId;
	String deptName;
	double salary;

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", deptId=" + deptId + ", deptName=" + deptName
				+ ", salary=" + salary + "]";
	}

	public Employee(int empId, String empName, int deptId, String deptName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptId = deptId;
		this.deptName = deptName;
		this.salary = salary;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee() {
		super();
		System.out.println("Employee Class Object is instantiated..");
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

}
