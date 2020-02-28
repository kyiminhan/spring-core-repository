package com.kmh.spring.service.impl;

import com.kmh.spring.dao.EmployeeDao;
import com.kmh.spring.dto.Employee;
import com.kmh.spring.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;

	@Override
	public Employee getEmployee(int id) {
		return employeeDao.findById(id);
	}
}