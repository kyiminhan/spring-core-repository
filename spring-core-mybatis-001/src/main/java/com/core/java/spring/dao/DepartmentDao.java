package com.core.java.spring.dao;

import java.util.Collection;

import com.core.java.spring.entity.Department;

/**
 * The Interface DepartmentDao.</BR>
 *
 * @author kyiminhan </BR>
 * @version 1.0 </BR>
 * @since 2019/06/14 </BR>
 * spring-core-mybatis-001 system </BR>
 * com.core.java.spring.dao </BR>
 * DepartmentDao.java </BR>
 */
public interface DepartmentDao {

	/**
	 * Save.
	 *
	 * @param department the department
	 * @return int
	 */
	int save(Department department);

	/**
	 * Update.
	 *
	 * @param department the department
	 * @return int
	 */
	int update(Department department);

	/**
	 * Delete.
	 *
	 * @param department the department
	 */
	void delete(Department department);

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	Collection<Department> getAll();

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return Department
	 */
	Department findById(Integer id);

	/**
	 * Delete all.
	 */
	void deleteAll();
}