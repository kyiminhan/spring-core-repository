package com.kmh.spring.dao;

import com.kmh.spring.dto.Employee;

public interface EmployeeDao {

	/**
	 * find employee same with the specify id.
	 * 
	 * @param id
	 * @return
	 */
	Employee findById(int id);
}
