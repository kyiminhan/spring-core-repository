package com.kmh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kmh.spring.dao.EmployeeDao;
import com.kmh.spring.dto.Employee;
import com.kmh.spring.service.EmployeeService;

@SpringBootApplication
public class App implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private EmployeeDao employeeDao;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Employee employee = new Employee(null, "Kyi", "Min Han", "kyiminhan@gmail.com", "Tokyo, Japan");
		employeeService.save(employee);

		Employee employee2 = employeeService.get(1);
		System.out.println(employee2);

		Employee employee3 = employeeDao.findByCustom(1).orElse(null);
		System.out.println(employee3);

	}

}