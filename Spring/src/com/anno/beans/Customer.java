package com.anno.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// creates the beans with the de-capitalized class name as id as default
// value with set the id for the bean which can be used in Run class
@Component(value = "customer1")
public class Customer {
	private int custId;
	private String custName;

	// Autowired will call the constructor with itself
	// Qualifier will make the value of the id for that particular bean clean
	@Autowired
	// @Qualifier(value = "address1")
	private Address address;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
		custId = 101;
		custName = "Geetika Agarwal";
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
		return "Customer [custId=" + custId + ", custName=" + custName + "]";
	}

}
