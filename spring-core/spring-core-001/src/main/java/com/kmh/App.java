package com.kmh;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kmh.spring.controller.EmployeeController;
import com.kmh.spring.dto.Employee;

public class App {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
//		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

		EmployeeController service = (EmployeeController) ctx.getBean("employeeController");

		Employee employee = service.getEmployee(100);

		System.out.println("id" + employee.getId());
		System.out.println("firstName" + employee.getFirstName());
		System.out.println("lastName" + employee.getLastName());

		ctx.close();

	}
}
