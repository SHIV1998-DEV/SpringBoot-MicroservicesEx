package com.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Con")
public class Control {
	@Value("SHIVRAj")
	private String Name;
	@Value("666")
	private Integer id;
	
	public Control() {
		super();
	}

	@Override
	public String toString() {
		return "Control [Name=" + Name + ", id=" + id + "]";
	}
	
	

}
