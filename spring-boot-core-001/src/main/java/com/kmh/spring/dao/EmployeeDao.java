package com.kmh.spring.dao;

import java.util.List;

import com.kmh.spring.dto.Employee;

public interface EmployeeDao {

	Employee findById(int id);

	Employee findByEmail(int id);

	List<Employee> findAll();
}
