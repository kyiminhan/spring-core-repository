package com.kmh;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.kmh.spring.config.Config;
import com.kmh.spring.controller.EmployeeController;
import com.kmh.spring.dao.EmployeeDao;
import com.kmh.spring.dto.Employee;

public class App {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

		EmployeeController employeeController = (EmployeeController) ctx.getBean("employeeController");

		Employee employee = employeeController.getEmployee(23);
		System.out.println();
		System.out.println(employee);
		System.out.println();

		EmployeeDao dao = (EmployeeDao) ctx.getBean("employeeDaoImpl");

		List<Employee> employees = dao.findAll();
		System.out.println();
		employees.forEach(e -> System.out.println(e));
		System.out.println();

//		employee = dao.findByEmail("toyota@outlook.com");
//		System.out.println();
//		System.out.println(employee);

//		dao.insert(employee);
		employee.setAddress("Yangon, Myanmar");
		dao.update(employee);

		ctx.close();
	}
}