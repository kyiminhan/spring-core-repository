package com.core.java.spring.app;

import com.core.java.spring.config.Bean;
import com.core.java.spring.config.BeanUtils;
import com.core.java.spring.service.DepartmentService;
import com.core.java.spring.service.EmployeeService;

/**
 * The Class App.</BR>
 *
 * @author kyiminhan </BR>
 * @version 1.0 </BR>
 * @since 2019/06/14 </BR>
 * spring-core-jpa-001 system </BR>
 * com.core.java.spring.app </BR>
 * App.java </BR>
 */
public class App {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {

		final EmployeeService employeeService = ((EmployeeService) BeanUtils.getBean(Bean.EMPLOYEEMENT_SERVICE));
		final DepartmentService departmentService = ((DepartmentService) BeanUtils.getBean(Bean.DEPARTMENT_SERVICE));

		employeeService.loadInitData();
		departmentService.loadInitData();

		employeeService.findAll().forEach(emp -> System.out.println(emp));
		departmentService.findAll().forEach(dep -> System.out.println(dep));
	}
}