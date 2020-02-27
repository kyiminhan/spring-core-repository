package com.kmh.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kmh.spring.controller.EmployeeController;
import com.kmh.spring.dao.EmployeeDao;
import com.kmh.spring.dao.impl.EmployeeDaoImpl;
import com.kmh.spring.service.EmployeeService;
import com.kmh.spring.service.impl.EmployeeServiceImpl;

@Configuration
public class Config {

	@Bean("employeeController")
	public EmployeeController getEmployeeController() {
		return new EmployeeController(getEmployeeService());
	}

	@Bean("employeeService")
	public EmployeeService getEmployeeService() {
		return new EmployeeServiceImpl(getEmployeeDao());
	}

	@Bean("employeeDao")
	public EmployeeDao getEmployeeDao() {
		return new EmployeeDaoImpl();
	}
}