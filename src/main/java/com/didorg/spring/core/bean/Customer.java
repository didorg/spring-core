package com.didorg.spring.core.bean;


public class Customer extends Person{

	public Customer(String firstName, String lastName) {
		super.firstName = firstName;
		super.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
