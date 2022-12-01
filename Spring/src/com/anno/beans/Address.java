package com.anno.beans;

import org.springframework.stereotype.Component;

@Component
public class Address {
	private String city;
	private String state;

	public Address() {
		this.city = "Hyderabad";
		this.state = "Telangana";
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

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}

}
