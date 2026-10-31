package com.app.min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.max.IEmpDao;
import com.app.sum.IEmpService;

@Component
public class EmpServiceImpl implements IEmpService {
	@Autowired
	private IEmpDao Dao;

	@Override
	public void checklogic() {

		Dao.save();
		System.out.println("From IEmpService Interface");

	}

}
