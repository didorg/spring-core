package com.didorg.spring.core.bean;

public class Address {
	
	private String id;
	private String street;
	private String area;
	private String zipCode;
	
	public Address(String street, String area, String zipCode) {
		this.street = street;
		this.area = area;
		this.zipCode = zipCode;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "[street=" + street + ", area=" + area + ", zipCode=" + zipCode + "]";
	}

}
