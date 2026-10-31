package com.app.Service;

public class Service {
	
	private String Filename;
	private Double Time;
	
	public void setup() {
		System.out.println("HE I AM SETUP METHOD");
	}
	
	public void clean() {
		System.out.println("HE I AM CLOSE METHOD");
		
	}
	
	public Service() {
		
		System.out.println("Hey i am Constructer");
		super();
	}
	@Override
	public String toString() {
		return "Service [Filename=" + Filename + ", Time=" + Time + "]";
	}
	public String getFilename() {
		System.out.println("i am get method ");
		return Filename;
	}
	public void setFilename(String filename) {
		Filename = filename;
	}
	public Double getTime() {
		return Time;
	}
	public void setTime(Double time) {
		Time = time;
	}

}
