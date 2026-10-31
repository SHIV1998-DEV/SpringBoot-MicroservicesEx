package com.app;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Student {

	private int id;

	public Student() {
		System.out.println("Hey i am Constructer");
		id = new Random().nextInt();
		super();
	}

	public int getId() {

		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}

}
