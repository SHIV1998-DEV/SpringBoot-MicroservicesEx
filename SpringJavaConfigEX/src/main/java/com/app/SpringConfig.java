package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:JDBC.properties")
public class SpringConfig {
	@Autowired
	Environment env;

	@Bean
	public Drivermanager Object() {
		Drivermanager DM = new Drivermanager();
		/*
		 * DM.setDriverName("ORCALE"); DM.setUrl("WWW.ORCALE.COM");
		 */
		DM.setDriverName(env.getProperty("A1.DB"));
		DM.setUrl(env.getProperty("A2.DB"));

		return DM;

	}

}
