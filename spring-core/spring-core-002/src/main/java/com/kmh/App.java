package com.kmh;

import com.kmh.spring.controller.EmployeeController;
import com.kmh.spring.dto.Employee;

public class App {

	public static void main(String[] args) {

		EmployeeController employeeController = new EmployeeController();

		Employee employee = employeeController.getEmployee(100);

		System.out.println();
		System.out.println(employee);
		System.out.println();

	}
}