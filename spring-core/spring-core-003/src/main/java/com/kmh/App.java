package com.kmh;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kmh.spring.controller.EmployeeController;
import com.kmh.spring.dao.EmployeeDao;
import com.kmh.spring.dto.Employee;
import com.kmh.spring.service.EmployeeService;

public class App {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");

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

		ctx.close();
	}
}