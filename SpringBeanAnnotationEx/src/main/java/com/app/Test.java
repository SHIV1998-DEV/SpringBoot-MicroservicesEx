package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac =new AnnotationConfigApplicationContext(Basepackege.class);
		ac.getBean("Con");
		System.out.println(ac.getBean("Con"));
	}
	

}
