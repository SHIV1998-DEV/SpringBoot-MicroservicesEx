package com.app;

public class MyRepository {
	
	String Name;

	public MyRepository() {
		super();
	}

	public String getName() {
		return Name;
	}

	@Override
	public String toString() {
		return "MyRepository [Name=" + Name + "]";
	}

	public void setName(String name) {
		Name = name;
	}

}
