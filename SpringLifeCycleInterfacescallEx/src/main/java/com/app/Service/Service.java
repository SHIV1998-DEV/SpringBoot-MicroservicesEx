package com.app.Service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Service implements InitializingBean ,DisposableBean {

	
	private String Filename;;
	private Double Time;

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("afterPropertiesSet()");

	}

	@Override
	public void destroy() throws Exception {

		System.out.println("destroy()");

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
