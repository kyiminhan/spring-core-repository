package com.kmh.spring.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.kmh.spring.dao.EmployeeDao;
import com.kmh.spring.dao.mapper.EmployeeMapper;
import com.kmh.spring.dto.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private NamedParameterJdbcTemplate jdbcTemplate;

	@Autowired
	public EmployeeDaoImpl(DataSource dataSource) {
		jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public Employee findById(int id) {
		StringBuilder sb = new StringBuilder();
		sb.append(" SELECT");
		sb.append(" *");
		sb.append(" FROM EMPLOYEE");
		sb.append(" WHERE ID = :id");

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", id);

		String sql = sb.toString();
		Employee employee = jdbcTemplate.queryForObject(sql, params, new EmployeeMapper());

		return employee;
	}

	@Override
	public Employee findByEmail(String email) {
		StringBuilder sb = new StringBuilder();
		sb.append(" SELECT");
		sb.append(" *");
		sb.append(" FROM EMPLOYEE");
		sb.append(" WHERE EMAIL = :email");

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("email", email);

		String sql = sb.toString();
		Employee employee = jdbcTemplate.queryForObject(sql, params, new EmployeeMapper());

		return employee;
	}

	@Override
	public List<Employee> findAll() {
		StringBuilder sb = new StringBuilder();
		sb.append(" SELECT");
		sb.append(" *");
		sb.append(" FROM EMPLOYEE");
		String sql = sb.toString();
		List<Employee> employees = jdbcTemplate.query(sql, new EmployeeMapper());
		return employees;
	}

	@Override
	public int insert(Employee e) {

		StringBuilder sb = new StringBuilder();
		sb.append(" INSERT");
		sb.append(" INTO EMPLOYEE");
		sb.append(" (");
		sb.append("   FIRST_NAME");
		sb.append("  ,LAST_NAME");
		sb.append("  ,EMAIL");
		sb.append("  ,ADDRESS");
		sb.append(" )");
		sb.append(" VALUE");
		sb.append(" (");
		sb.append("   :firstName");
		sb.append("  ,:lastName");
		sb.append("  ,:email");
		sb.append("  ,:address");
		sb.append(" )");
		String sql = sb.toString();

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("firstName", e.getFirstName());
		params.put("lastName", e.getLastName());
		params.put("email", e.getEmail());
		params.put("address", e.getAddress());

		SqlParameterSource paramSource = new MapSqlParameterSource(params);
		KeyHolder keyHolder = new GeneratedKeyHolder();

		jdbcTemplate.update(sql, paramSource, keyHolder);

		int key = keyHolder.getKey().intValue();

		return key;
	}

	@Override
	public void update(Employee e) {
		StringBuilder sb = new StringBuilder();
		sb.append(" UPDATE");
		sb.append(" EMPLOYEE");
		sb.append(" SET");
		sb.append("   FIRST_NAME = :firstName");
		sb.append("  ,LAST_NAME = :lastName");
		sb.append("  ,EMAIL = :email");
		sb.append("  ,ADDRESS = :address");
		sb.append(" WHERE");
		sb.append(" ID = :id");
		String sql = sb.toString();

		// @formatter:off
		SqlParameterSource paramSource = new MapSqlParameterSource()
				.addValue("id", e.getId())
				.addValue("firstName", e.getFirstName())
				.addValue("lastName", e.getLastName())
				.addValue("email", e.getEmail())
				.addValue("address", e.getAddress());
		// @formatter:on

		jdbcTemplate.update(sql, paramSource);

	}
}