package com.kmh.spring.service.impl;

import com.kmh.spring.dao.EmployeeDao;
import com.kmh.spring.dto.Employee;
import com.kmh.spring.service.EmployeeService;

/**
 * @author ECW-PC-103
 *
 */
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;

	public EmployeeServiceImpl() {
		super();
	}

	/**
	 * @param dao
	 */
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	/**
	 * @param id
	 * @return
	 */
	@Override
	public Employee getEmployee(int id) {
		return employeeDao.findById(id);
	}

	/**
	 * @param employeeDao the employeeDao to set
	 */
//	public void setEmployeeDao(EmployeeDao employeeDao) {
//		this.employeeDao = employeeDao;
//	}

}