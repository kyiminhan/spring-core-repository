package com.kmh.spring.controller;

import com.kmh.spring.dto.Employee;
import com.kmh.spring.service.EmployeeService;
import com.kmh.spring.service.impl.EmployeeServiceImpl;

public class EmployeeController {

	private EmployeeService employeeService = new EmployeeServiceImpl();

	public Employee getEmployee(int id) {
		Employee employee = employeeService.getEmployee(id);
		return employee;
	}
}