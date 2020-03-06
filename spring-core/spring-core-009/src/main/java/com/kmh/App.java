package com.kmh;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
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

		Employee employee = employeeController.getEmployee(27);
//		System.out.println();
//		System.out.println(employee);
//		System.out.println();

		EmployeeDao dao = (EmployeeDao) ctx.getBean("employeeDaoImpl");

//		int key = dao.insert(new App().loadEmp());
//		System.out.println(key);

		List<Employee> employees = dao.findAll();
		System.out.println();
		employees.forEach(e -> System.out.println(e));
		System.out.println();

		employee.setEmail(RandomStringUtils.random(5, "abcdef") + "@gamil.com");
		dao.update(employee);

		System.out.println();
		dao.findAll().forEach(e -> System.out.println(e));
		System.out.println();

		ctx.close();
	}

	public Employee loadEmp() {
		Employee emp = new Employee();
		emp.setFirstName("John");
		emp.setLastName("Smith");
		emp.setEmail(RandomStringUtils.random(5, "abcdef") + "@gamil.com");
		emp.setAddress("Tokyo, Japan");
		return emp;
	}
}