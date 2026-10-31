package my.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("my.app")
@PropertySource("classpath:Constant.properties")
public class MyConfigapp {
	
	

}
