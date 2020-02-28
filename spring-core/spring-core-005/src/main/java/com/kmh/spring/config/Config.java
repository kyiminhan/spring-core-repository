package com.kmh.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kmh.spring.controller.EmployeeController;
import com.kmh.spring.dao.EmployeeDao;
import com.kmh.spring.dao.impl.EmployeeDaoImpl;
import com.kmh.spring.dto.MockDB;
import com.kmh.spring.service.EmployeeService;
import com.kmh.spring.service.impl.EmployeeServiceImpl;

@Configuration
public class Config {

	@Bean("mockDB")
	public MockDB getMockDB() {
		return new MockDB();
	}

	@Bean("employeeDao")
	public EmployeeDao getEmployeeDao() {
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		employeeDaoImpl.setMockDB(getMockDB());
		return employeeDaoImpl;
	}

	@Bean("employeeService")
	public EmployeeService getEmployeeService() {
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
		employeeServiceImpl.setEmployeeDao(getEmployeeDao());
		return employeeServiceImpl;
	}

	@Bean("employeeController")
	public EmployeeController getEmployeeController() {
		EmployeeController employeeController = new EmployeeController();
		employeeController.setEmployeeService(getEmployeeService());
		return employeeController;
	}
}