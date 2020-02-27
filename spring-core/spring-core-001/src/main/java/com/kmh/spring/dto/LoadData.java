package com.kmh.spring.dto;

import java.util.ArrayList;
import java.util.List;

public class LoadData {

	public static List<Employee> getEmployeeData() {

		List<Employee> list = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			list.add(new Employee(i, "Kyi", "Min Han " + i));
		}
		return list;
	}
}
