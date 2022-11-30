package com.beans;

public class Customer {
	int custId;
	String custName;

	public Customer(int custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + "]";
	}

}
