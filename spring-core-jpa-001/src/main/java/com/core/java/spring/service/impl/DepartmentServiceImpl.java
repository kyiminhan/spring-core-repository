package com.core.java.spring.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.core.java.spring.entity.Department;
import com.core.java.spring.repo.DepartmentRepo;
import com.core.java.spring.service.DepartmentService;

/**
 * The Class DepartmentServiceImpl.</BR>
 *
 * @author kyiminhan </BR>
 * @version 1.0 </BR>
 * @since 2019/06/14 </BR>
 * spring-core-jpa-001 system </BR>
 * com.core.java.spring.service.impl </BR>
 * DepartmentServiceImpl.java </BR>
 */
@Service(value = "departmentServiceImpl")
public class DepartmentServiceImpl implements DepartmentService {

	/** The department repo. */
	private DepartmentRepo departmentRepo;

	@Autowired
	public void setDepartmentRepo(final DepartmentRepo departmentRepo) {
		this.departmentRepo = departmentRepo;
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public void save(final Department department) {
		this.departmentRepo.save(department);
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public void update(final Department department) {
		this.departmentRepo.save(department);
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public void delete(final Department department) {
		this.departmentRepo.delete(department);
	}

	@Transactional(readOnly = true)
	@Override
	public Department findById(final Integer id) {
		return this.departmentRepo.findById(id).orElse(null);
	}

	@Transactional(readOnly = true)
	@Override
	public Collection<Department> findAll() {
		return this.departmentRepo.findAll();
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public void deleteAll() {
		this.departmentRepo.deleteAll();
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public void loadInitData() {
		if (this.departmentRepo.count() < 1) {
			int count = 1;
			do {
				this.departmentRepo.save(Department.builder().departmentName("Software Department " + count).build());
				count++;

			} while (count < 100);
		}
	}
}