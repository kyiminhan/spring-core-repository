package com.kmh.spring.service;

import com.kmh.spring.dto.Employee;

public interface EmployeeService {

	/**
	 * @param id
	 * @return
	 */
	Employee getEmployee(int id);
}
