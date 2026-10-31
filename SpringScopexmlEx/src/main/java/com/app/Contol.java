package com.app;

import java.util.Random;

public class Contol {

	private int name;

	public Contol() {

		name = new Random().nextInt();
		System.out.println("I AM Container");
	}

	@Override
	public String toString() {
		return "Contol [name=" + name + "]";
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

}
