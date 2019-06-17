package com.core.java.spring.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.core.java.spring.config.BeanName;
import com.core.java.spring.dao.EmployeeDao;
import com.core.java.spring.entity.Employee;
import com.core.java.spring.service.EmployeeService;

/**
 * The Class EmployeeServiceImpl.</BR>
 *
 * @author kyiminhan </BR>
 * @version 1.0 </BR>
 * @since 2019/06/17 </BR>
 * spring-core-mybatis-001 system </BR>
 * com.core.java.spring.service.impl </BR>
 * EmployeeServiceImpl.java </BR>
 */
@Service(value = BeanName.EMPLOYEE_SERVICE_IMPL)
public class EmployeeServiceImpl implements EmployeeService {

	/** The employee dao. */
	private EmployeeDao employeeDao;

	/**
	 * Sets the employee dao.
	 *
	 * @param employeeDao the new employee dao
	 */
	@Autowired
	public void setEmployeeDao(final EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	/**
	 * Save.
	 *
	 * @param employee the employee
	 * @return int
	 */
	@Override
	public int save(final Employee employee) {
		return this.employeeDao.save(employee);
	}

	/**
	 * Update.
	 *
	 * @param employee the employee
	 * @return int
	 */
	@Override
	public int update(final Employee employee) {
		return this.employeeDao.update(employee);
	}

	/**
	 * Delete.
	 *
	 * @param employee the employee
	 */
	@Override
	public void delete(final Employee employee) {
		this.employeeDao.delete(employee);
	}

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@Override
	public Collection<Employee> getAll() {
		return this.employeeDao.getAll();
	}

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return Employee
	 */
	@Override
	public Employee findById(final Integer id) {
		return this.employeeDao.findById(id);
	}

	/**
	 * Delete all.
	 */
	@Override
	public void deleteAll() {
		this.employeeDao.deleteAll();
	}
}