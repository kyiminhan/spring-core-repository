package com.kmh.spring.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kmh.spring.dao.EmployeeDao;
import com.kmh.spring.dto.Employee;
import com.kmh.spring.dto.mapper.EmployeeMapper;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	private final String SQL_GET_ALL = "select * from employee";
	private final String SQL_FIND_BY_ID = "select * from employee where id = ?";
	private final String SQL_FIND_BY_EMAIL = "select * from employee where email = ?";
	// private final String SQL_DELETE_BY_ID = "delete from employee where id = ?";
	private final String SQL_UPDATE = "update employee set first_name = ?, last_name = ?, email = ?, address = ? where id = ?";
	private final String SQL_INSERT = "insert into employee(first_name, last_name, email, address) values(?,?,?,?)";

	@Autowired
	public EmployeeDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Employee findById(int id) {
		Employee employee = jdbcTemplate.queryForObject(SQL_FIND_BY_ID, new Object[] { id }, new EmployeeMapper());
		return employee;
	}

	@Override
	public Employee findByEmail(String email) {
		Employee employee = jdbcTemplate.queryForObject(SQL_FIND_BY_EMAIL, new Object[] { email },
				new EmployeeMapper());
		return employee;
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> employees = jdbcTemplate.query(SQL_GET_ALL, new EmployeeMapper());
		return employees;
	}

	@Override
	public void insert(Employee e) {
		jdbcTemplate.update(SQL_INSERT, e.getFirstName(), e.getLastName(), e.getEmail(), e.getAddress());
	}

	@Override
	public void update(Employee e) {
		jdbcTemplate.update(SQL_UPDATE, e.getFirstName(), e.getLastName(), e.getEmail(), e.getAddress(), e.getId());
	}
}