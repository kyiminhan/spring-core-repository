package com.core.java.spring.service;

import java.util.Collection;

import com.core.java.spring.entity.Employee;

/**
 * The Interface EmployeeService.</BR>
 *
 * @author kyiminhan </BR>
 * @version 1.0 </BR>
 * @since 2019/06/14 </BR>
 * spring-core-mybatis-001 system </BR>
 * com.core.java.spring.service </BR>
 * EmployeeService.java </BR>
 */
public interface EmployeeService {

	/**
	 * Save.
	 *
	 * @param employee the employee
	 * @return int
	 */
	int save(Employee employee);

	/**
	 * Update.
	 *
	 * @param employee the employee
	 * @return int
	 */
	int update(Employee employee);

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
	 * Gets the all.
	 *
	 * @return the all
	 */
	Collection<Employee> getAll();

	/**
	 * Delete all.
	 */
	void deleteAll();
}