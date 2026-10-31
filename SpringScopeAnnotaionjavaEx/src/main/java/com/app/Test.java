package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("before container creation");
		AnnotationConfigApplicationContext AC=new AnnotationConfigApplicationContext(Myconfig.class);
		System.out.println("After container creation");
		Object AA=AC.getBean("student");
		System.out.println(AA);
		Object AA1=AC.getBean("student");
		System.out.println(AA1);
	} 

}
