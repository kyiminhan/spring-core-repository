package com.kmh.spring.controller;

import com.kmh.spring.dto.Employee;
import com.kmh.spring.service.EmployeeService;

public class EmployeeController {

	private EmployeeService employeeService;

	public Employee getEmployee(int id) {
		Employee employee = employeeService.getEmployee(id);
		return employee;
	}
}