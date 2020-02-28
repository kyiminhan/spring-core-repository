package com.kmh.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kmh.spring.dao.EmployeeDao;
import com.kmh.spring.dto.Employee;
import com.kmh.spring.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee get(Integer id) {
		Employee employee = this.employeeDao.findById(id).orElse(null);
		return employee;
	}

	@Override
	public void save(Employee employee) {
		this.employeeDao.save(employee);
	}

	@Override
	public void edit(Employee employee) {
		this.employeeDao.save(employee);
	}

	@Override
	public void delete(Integer id) {
		this.employeeDao.deleteById(id);
	}

	@Override
	public List<Employee> getAll() {
		List<Employee> employees = this.employeeDao.findAll();
		return employees;
	}
}