package com.core.java.spring.dao.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.core.java.spring.dao.DepartmentDao;
import com.core.java.spring.dao.mapper.DepartmentMapper;
import com.core.java.spring.entity.Department;

/**
 * The Class DepartmentDaoImpl.</BR>
 *
 * @author kyiminhan </BR>
 * @version 1.0 </BR>
 * @since 2019/06/14 </BR>
 * spring-core-mybatis-001 system </BR>
 * com.core.java.spring.dao.impl </BR>
 * DepartmentDaoImpl.java </BR>
 */
@Repository
public class DepartmentDaoImpl implements DepartmentDao {

	/** The mapper. */
	private DepartmentMapper mapper;

	/**
	 * Sets the mapper.
	 *
	 * @param mapper the new mapper
	 */
	@Autowired
	public void setMapper(final DepartmentMapper mapper) {
		this.mapper = mapper;
	}

	/**
	 * Update.
	 *
	 * @param department the department
	 * @return int
	 */
	@Override
	public int update(final Department department) {
		return this.mapper.update(department);
	}

	/**
	 * Delete.
	 *
	 * @param department the department
	 */
	@Override
	public void delete(final Department department) {
		this.mapper.delete(department);
	}

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return Department
	 */
	@Override
	public Department findById(final Integer id) {
		return this.mapper.findById(id);
	}

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@Override
	public Collection<Department> getAll() {
		return this.mapper.getAll();
	}

	/**
	 * Save.
	 *
	 * @param department the department
	 * @return int
	 */
	@Override
	public int save(final Department department) {
		return this.mapper.save(department);
	}

	/**
	 * Delete all.
	 */
	@Override
	public void deleteAll() {
		this.mapper.deleteAll();
	}
}