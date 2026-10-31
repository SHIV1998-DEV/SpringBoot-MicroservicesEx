package com.app.Sub;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.app.MyRepository;

@Configuration
@ComponentScan("com.app")
public class MyConfig {
	@Bean
	@Primary
	public MyRepository M1() {
		MyRepository M=new MyRepository();
		M.setName("A");
		return M;
		
	}
	@Bean
	public MyRepository M2() {
		MyRepository M=new MyRepository();
		M.setName("B");
		return M;
		
	}
	
	
	
	

}
