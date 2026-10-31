package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext AC = new AnnotationConfigApplicationContext(SpringConfig.class);

		Object D = AC.getBean("Object");

		System.out.println(D);
	}

}
