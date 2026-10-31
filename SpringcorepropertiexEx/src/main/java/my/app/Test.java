package my.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac =new AnnotationConfigApplicationContext(MyConfigapp.class);
		ac.getBean("Con");
		System.out.println(ac.getBean("Con"));
	}
	

}
