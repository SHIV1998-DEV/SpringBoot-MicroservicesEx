package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.Myconfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext AC = new AnnotationConfigApplicationContext(Myconfig.class);
		AC.getBean("ePFO_Report_Monthly");
		
	}

}
