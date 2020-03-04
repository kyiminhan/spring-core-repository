package com.kmh.spring.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kmh.spring.dao.EmployeeDao;
import com.kmh.spring.dto.Employee;
import com.kmh.spring.dto.MockDB;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private MockDB mockDB;

	@Override
	public Employee findById(int id) {

		List<Employee> employeeData = mockDB.getEmployeeData();
		Employee employee = employeeData.stream().filter(e -> id == e.getId()).findFirst().orElse(null);
		return employee;
	}

	@Override
	public Employee findByEmail(String email) {
		List<Employee> employeeData = mockDB.getEmployeeData();
		Employee employee = employeeData.stream().filter(e -> e.getEmail().equals(email)).findFirst().orElse(null);
		return employee;
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> employeeData = mockDB.getEmployeeData();
		return employeeData;
	}
}