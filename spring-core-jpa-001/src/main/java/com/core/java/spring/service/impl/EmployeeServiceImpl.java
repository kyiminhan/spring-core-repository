package com.core.java.spring.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.core.java.spring.entity.Employee;
import com.core.java.spring.repo.EmployeeRepo;
import com.core.java.spring.service.EmployeeService;

/**
 * The Class EmployeeServiceImpl.</BR>
 *
 * @author kyiminhan </BR>
 * @version 1.0 </BR>
 * @since 2019/06/14 </BR>
 * spring-core-jpa-001 system </BR>
 * com.core.java.spring.service.impl </BR>
 * EmployeeServiceImpl.java </BR>
 */
@Service(value = "employeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService {

	/** The employee repo. */
	private EmployeeRepo employeeRepo;

	@Transactional(rollbackFor = Exception.class)
	@Autowired
	public void setEmployeeRepo(final EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}

	/**
	 * Save.
	 *
	 * @param employee the employee
	 */
	@Transactional(rollbackFor = Exception.class)
	@Override
	public void save(final Employee employee) {
		this.employeeRepo.save(employee);
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public void update(final Employee employee) {
		this.employeeRepo.save(employee);
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public void delete(final Employee employee) {
		this.employeeRepo.delete(employee);
	}

	@Transactional(readOnly = true)
	@Override
	public Collection<Employee> findAll() {
		return this.employeeRepo.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Employee findById(final Integer id) {
		return this.employeeRepo.findById(id).orElse(null);
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public void deleteAll() {
		this.employeeRepo.deleteAll();
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public void loadInitData() {
		if (this.employeeRepo.count() < 1) {
			int count = 1;
			do {
				this.employeeRepo.save(Employee.builder().name("KYIMINHAN " + count)
						.email("kyiminhan" + count + "@gmail.com").address("Tokyo").phone("0987654321234").build());
				count++;

			} while (count < 100);
		}
	}
}