package com.core.java.spring.service;

import java.util.Collection;

import com.core.java.spring.entity.Department;

/**
 * The Interface DepartmentService.</BR>
 *
 * @author kyiminhan </BR>
 * @version 1.0 </BR>
 * @since 2019/06/14 </BR>
 * spring-core-jpa-001 system </BR>
 * com.core.java.spring.service </BR>
 * DepartmentService.java </BR>
 */
public interface DepartmentService {

	/**
	 * Save.
	 *
	 * @param department the department
	 */
	void save(Department department);

	/**
	 * Update.
	 *
	 * @param department the department
	 */
	void update(Department department);

	/**
	 * Delete.
	 *
	 * @param department the department
	 */
	void delete(Department department);

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return Department
	 */
	Department findById(Integer id);

	/**
	 * Find all.
	 *
	 * @return Collection
	 */
	Collection<Department> findAll();

	/**
	 * Delete all.
	 */
	void deleteAll();

	/**
	 * Load init data.
	 */
	void loadInitData();
}