package com.app.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.min.EmpController;
import com.app.min.MyConfig;

public class Test {

	public static void main(String[] args) {
		ApplicationContext AC = new AnnotationConfigApplicationContext(MyConfig.class);
		EmpController X = AC.getBean("empController", EmpController.class);
		X.getInfo();
		System.out.println(X);

	}

}
