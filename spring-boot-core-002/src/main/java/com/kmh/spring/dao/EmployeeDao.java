package com.kmh.spring.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kmh.spring.dto.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	@Query("SELECT e FROM Employee e WHERE e.id=:id")
	Optional<Employee> findByCustom(@Param(value = "id") Integer id);
}