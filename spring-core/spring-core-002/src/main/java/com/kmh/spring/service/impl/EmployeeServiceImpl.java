package com.kmh.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kmh.spring.dao.EmployeeDao;
import com.kmh.spring.dto.Employee;
import com.kmh.spring.service.EmployeeService;

/**
 * @author ECW-PC-103
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	/**
	 * @param id
	 * @return
	 */
	@Override
	public Employee getEmployee(int id) {
		return employeeDao.findById(id);
	}

}