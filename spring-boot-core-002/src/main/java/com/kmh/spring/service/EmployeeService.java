package com.kmh.spring.service;

import java.util.List;

import com.kmh.spring.dto.Employee;

public interface EmployeeService {

	Employee getEmployee(Integer id);

	void save(Employee employee);

	void edit(Employee employee);

	void delete(Employee employee);

	void deleteById(Integer id);

	List<Employee> getAll();
}