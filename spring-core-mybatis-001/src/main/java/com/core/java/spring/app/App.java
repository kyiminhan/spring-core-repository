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
 * spring-core-mybatis-001 system </BR>
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

		((EmployeeService) BeanUtils.getBean(Bean.EMPLOYEEMENT_SERVICE)).getAll()
				.forEach(emp -> System.out.println(emp));

		((DepartmentService) BeanUtils.getBean(Bean.DEPARTMENT_SERVICE)).getAll()
				.forEach(dep -> System.out.println(dep));
	}
}