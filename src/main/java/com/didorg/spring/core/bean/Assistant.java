package com.didorg.spring.core.bean;

import java.util.List;

public class Assistant extends Person{
	
	public Assistant(String firstName, String lastName) {
		super(firstName, lastName);
		
		super.firstName = firstName;
		super.lastName = lastName;
	}
	
	private String id;
	private Address address;
	private List<Hobby> hobbies;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public List<Hobby> getHobbies() {
		return hobbies;
	}
	
	public void setHobbies(List<Hobby> hobbies) {
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "Assistant [id=" + id + ", address=" + address + ", hobbies=" + hobbies + "]";
	}

}
