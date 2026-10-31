package com.app.min;

import org.springframework.stereotype.Component;

import com.app.max.IEmpDao;
@Component
public class EmpDaoImpl implements IEmpDao {

	@Override
	public void save() {
		System.out.println("From IEmpDao Interface");

	}

}
