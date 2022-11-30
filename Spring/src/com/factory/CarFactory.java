package com.factory;

import com.beans.Car;

public class CarFactory {

	// Single Ton Design Pattern, where we make the Car object as private and get
	// the reference for the instance using the getCar() method

	private static Car c = new Car();

	public Car getCar() {
		System.out.println("Building Car...");
		return c;
	}
}
