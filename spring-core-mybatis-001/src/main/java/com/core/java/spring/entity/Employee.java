package com.core.java.spring.entity;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class Employee.</BR>
 *
 * @author kyiminhan </BR>
 * @version 1.0 </BR>
 * @since 2019/06/14 </BR>
 * spring-core-mybatis-001 system </BR>
 * com.core.java.spring.entity </BR>
 * Employee.java </BR>
 */
@Getter
@Setter

/**
 * Instantiates a new employee.
 */
@NoArgsConstructor
@ToString
public class Employee implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	private Integer id;

	/** The name. */
	private String name;

	/** The email. */
	private String email;

	/** The address. */
	private String address;

	/** The phone. */
	private String phone;

}