package my.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		 Object DD = ac.getBean("notMain");
		System.out.println(DD);

	}

}