package com.didorg.spring.core.bean;

public class Hobby {
	private String hobbyName;

	public String getHobbyName() {
		return hobbyName;
	}

	public void setHobbyName(String hobbyName) {
		this.hobbyName = hobbyName;
	}

	@Override
	public String toString() {
		return hobbyName;
	}

}
