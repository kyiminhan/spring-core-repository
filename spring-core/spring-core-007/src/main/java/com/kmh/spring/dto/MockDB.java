package com.kmh.spring.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MockDB {

	public List<Employee> getEmployeeData() {

		List<Employee> list = new ArrayList<>();
		for (int i = 1; i <= 200; i++) {
			Employee employee = new Employee();
			employee.setId(i);
			employee.setFirstName("Kyi");
			employee.setLastName("Min Han " + i);
			employee.setEmail("kyiminhan" + i + "@gmail.com");
			employee.setAddress("Tokyo, Japan");
			list.add(employee);
		}
		return list;
	}
}