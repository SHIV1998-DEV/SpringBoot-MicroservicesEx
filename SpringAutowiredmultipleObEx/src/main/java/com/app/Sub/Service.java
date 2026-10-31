package com.app.Sub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.app.MyRepository;
@Component
public class Service {
	@Autowired
	//@Qualifier("M1")
	MyRepository Repo;

	@Override
	public String toString() {
		return "Service [Repo=" + Repo + "]";
	}
	

}
