package com.app.Service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
         Object ob=ac.getBean("vobj");
         ac.close();
         System.out.println(ob);
	}
}
	