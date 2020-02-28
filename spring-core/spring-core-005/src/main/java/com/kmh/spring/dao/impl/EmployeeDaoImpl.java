package com.kmh.spring.dao.impl;

import java.util.List;

import com.kmh.spring.dao.EmployeeDao;
import com.kmh.spring.dto.Employee;
import com.kmh.spring.dto.MockDB;

public class EmployeeDaoImpl implements EmployeeDao {

	private MockDB mockDB;

	public void setMockDB(MockDB mockDB) {
		this.mockDB = mockDB;
	}

	@Override
	public Employee findById(int id) {

		List<Employee> employeeData = mockDB.getEmployeeData();
		Employee employee = employeeData.stream().filter(e -> id == e.getId()).findFirst().orElse(null);
		return employee;
	}

	@Override
	public Employee findByEmail(int id) {
		List<Employee> employeeData = mockDB.getEmployeeData();
		Employee employee = employeeData.stream().filter(e -> id == e.getId()).findFirst().orElse(null);
		return employee;
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> employeeData = mockDB.getEmployeeData();
		return employeeData;
	}
}