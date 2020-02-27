package com.kmh.spring.dao.impl;

import com.kmh.spring.dao.EmployeeDao;
import com.kmh.spring.dto.Employee;
import com.kmh.spring.dto.LoadData;

/**
 * @author ECW-PC-103
 *
 */
public class EmployeeDaoImpl implements EmployeeDao {

	/**
	 * find employee same with the specify id.
	 * 
	 * @param id
	 * @return
	 * @return
	 */
	@Override
	public Employee findById(int id) {
		return LoadData.getEmployeeData().stream().filter(emp -> id == emp.getId()).findFirst().orElse(null);
	}
}