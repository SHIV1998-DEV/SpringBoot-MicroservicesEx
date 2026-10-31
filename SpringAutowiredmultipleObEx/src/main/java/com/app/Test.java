package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.Sub.MyConfig;

public class Test {
	public static void main(String[] args) {

		ApplicationContext AC = new AnnotationConfigApplicationContext(MyConfig.class);
		Object Z = AC.getBean("service");
		System.out.println(Z);
	}

}
