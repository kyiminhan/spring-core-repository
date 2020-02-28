package com.kmh.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kmh.spring.dto.Employee;
import com.kmh.spring.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	public Employee getEmployee(int id) {
		Employee employee = employeeService.get(id);
		return employee;
	}
}