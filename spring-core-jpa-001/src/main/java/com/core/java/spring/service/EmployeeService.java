package com.core.java.spring.service;

import java.util.Collection;

import com.core.java.spring.entity.Employee;

/**
 * The Interface EmployeeService.</BR>
 *
 * @author kyiminhan </BR>
 * @version 1.0 </BR>
 * @since 2019/06/14 </BR>
 * spring-core-jpa-001 system </BR>
 * com.core.java.spring.service </BR>
 * EmployeeService.java </BR>
 */
public interface EmployeeService {

	/**
	 * Save.
	 *
	 * @param employee the employee
	 */
	void save(Employee employee);

	/**
	 * Update.
	 *
	 * @param employee the employee
	 */
	void update(Employee employee);

	/**
	 * Delete.
	 *
	 * @param employee the employee
	 */
	void delete(Employee employee);

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return Employee
	 */
	Employee findById(Integer id);

	/**
	 * Find all.
	 *
	 * @return Collection
	 */
	Collection<Employee> findAll();

	/**
	 * Delete all.
	 */
	void deleteAll();

	/**
	 * Load init data.
	 */
	void loadInitData();
}