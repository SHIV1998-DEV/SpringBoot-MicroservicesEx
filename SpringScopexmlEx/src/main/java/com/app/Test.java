package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext AC = new ClassPathXmlApplicationContext("Config.xml");
		Object Coin = AC.getBean("F1", Contol.class);
		System.out.println(Coin);
	}

}
