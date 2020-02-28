package com.kmh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kmh.spring.controller.EmployeeController;
import com.kmh.spring.dao.EmployeeDao;
import com.kmh.spring.dto.Employee;
import com.kmh.spring.dto.MockDB;
import com.kmh.spring.service.EmployeeService;

@SpringBootApplication
public class App001 implements CommandLineRunner {

	@Autowired
	private EmployeeController employeeController;
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private MockDB mockDB;

	public static void main(String[] args) {
		SpringApplication.run(App001.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Employee employee = employeeController.getEmployee(100);
		System.out.println();
		System.out.println(employee);
		System.out.println();

		Employee employee1 = employeeService.getEmployee(100);
		System.out.println();
		System.out.println(employee1);
		System.out.println();

		Employee employee2 = employeeDao.findById(111);
		System.out.println();
		System.out.println(employee2);
		System.out.println();

		List<Employee> employeeData = mockDB.getEmployeeData();
		employeeData.forEach(e -> System.out.println(e));
	}
}