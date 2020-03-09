package com.kmh.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kmh.spring.dto.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
}