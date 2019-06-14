package com.core.java.spring.dao;

import java.util.Collection;

import com.core.java.spring.entity.Employee;

/**
 * The Interface EmployeeDao.</BR>
 *
 * @author kyiminhan </BR>
 * @version 1.0 </BR>
 * @since 2019/06/14 </BR>
 * spring-core-mybatis-001 system </BR>
 * com.core.java.spring.dao </BR>
 * EmployeeDao.java </BR>
 */
public interface EmployeeDao {

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
	 * Gets the all.
	 *
	 * @return the all
	 */
	Collection<Employee> getAll();

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return Employee
	 */
	Employee findById(Integer id);

	/**
	 * Delete all.
	 */
	void deleteAll();
}