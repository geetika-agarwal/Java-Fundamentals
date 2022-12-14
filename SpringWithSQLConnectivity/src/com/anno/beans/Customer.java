package com.anno.beans;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	private int custId;
	private String custName;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
		this.custId = 102;
		this.custName = "ABC";
	}

	public Customer(int custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
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

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + "]";
	}

}
