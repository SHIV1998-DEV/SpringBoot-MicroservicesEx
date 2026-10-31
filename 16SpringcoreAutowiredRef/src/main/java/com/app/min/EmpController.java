package com.app.min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.sum.IEmpService;

@Component
public class EmpController {

	@Autowired
	IEmpService sob;

	public void getInfo() {
		sob.checklogic();
		System.out.println("Get Info Printed");
	}

}
