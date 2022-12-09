package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Address {
	String houseNo;
	String locality;
	String city;
	String state;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String houseNo, String locality, String city, String state) {
		super();
		this.houseNo = houseNo;
		this.locality = locality;
		this.city = city;
		this.state = state;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
