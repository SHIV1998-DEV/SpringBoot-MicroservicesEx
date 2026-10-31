package com.app.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.Config.MyConfig;
import com.app.shiv.Student;
import com.app.shiv.Teacher;

public class Test {
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * ApplicationContext AC=new AnnotationConfigApplicationContext(MyConfig.class);
	 * Teacher L1= (Teacher) AC.getBean("teacher"); System.out.println(L1);
	 * 
	 * Teacher L2= (Teacher) AC.getBean("teacher"); System.out.println(L2);
	 * 
	 * 
	 * }
	 */
	
public static void main(String[] args) {
		
		ApplicationContext AC=new AnnotationConfigApplicationContext(MyConfig.class);
		Student L1= (Student) AC.getBean("student");
		System.out.println(L1.getLesson());
		
		Student L2= (Student) AC.getBean("student");
		System.out.println(L2.getLesson());
		
		
	}
	
	

}
