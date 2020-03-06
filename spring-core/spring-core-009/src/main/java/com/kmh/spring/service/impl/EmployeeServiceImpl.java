package com.kmh.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kmh.spring.dao.EmployeeDao;
import com.kmh.spring.dto.Employee;
import com.kmh.spring.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee getEmployee(int id) {
		return employeeDao.findById(id);
	}
}