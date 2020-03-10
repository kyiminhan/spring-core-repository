package com.kmh.spring.dao;

import java.util.List;

import com.kmh.spring.dto.Employee;

public interface EmployeeDao {

	Employee findById(int id);

	Employee findByEmail(String email);

	List<Employee> findAll();

	int save(Employee employee);

	void update(Employee employee);

	void deleteById(Integer id);
}
