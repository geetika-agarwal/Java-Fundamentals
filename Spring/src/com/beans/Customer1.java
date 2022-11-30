package com.beans;

public class Customer1 {
	int custId;
	String custName;
	Address address;

	public Customer1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer1 [custId=" + custId + ", custName=" + custName + ", address=" + address + "]";
	}

}
