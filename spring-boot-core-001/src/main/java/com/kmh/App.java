package com.kmh;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;

import com.kmh.spring.controller.EmployeeController;
import com.kmh.spring.dao.EmployeeDao;
import com.kmh.spring.dto.Employee;
import com.kmh.spring.dto.MockDB;
import com.kmh.spring.service.EmployeeService;

@SpringBootApplication
public class App {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = (AbstractApplicationContext) SpringApplication.run(App.class, args);

		EmployeeController employeeController = (EmployeeController) ctx.getBean("employeeController");

		Employee employee = employeeController.getEmployee(100);
		System.out.println();
		System.out.println(employee);
		System.out.println();

		EmployeeService employeeService = (EmployeeService) ctx.getBean("employeeService");

		Employee employee1 = employeeService.getEmployee(100);
		System.out.println();
		System.out.println(employee1);
		System.out.println();

		EmployeeDao employeeDao = (EmployeeDao) ctx.getBean("employeeDao");

		Employee employee2 = employeeDao.findById(111);
		System.out.println();
		System.out.println(employee2);
		System.out.println();

		MockDB mockDB = (MockDB) ctx.getBean("mockDB");

		List<Employee> employeeData = mockDB.getEmployeeData();
		employeeData.forEach(e -> System.out.println(e));

		ctx.close();
	}
}