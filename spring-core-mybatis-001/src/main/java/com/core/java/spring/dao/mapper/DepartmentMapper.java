package com.core.java.spring.dao.mapper;

import java.util.Collection;

import org.apache.ibatis.annotations.Mapper;

import com.core.java.spring.entity.Department;

/**
 * The Interface DepartmentMapper.</BR>
 *
 * @author kyiminhan </BR>
 * @version 1.0 </BR>
 * @since 2019/06/14 </BR>
 * spring-core-mybatis-001 system </BR>
 * com.core.java.spring.dao.mapper </BR>
 * DepartmentMapper.java </BR>
 */
@Mapper
public interface DepartmentMapper {

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
	 * @return int
	 */
	int delete(Department department);

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