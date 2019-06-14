package com.core.java.spring.entity;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * The Class Department.</BR>
 *
 * @author kyiminhan </BR>
 * @version 1.0 </BR>
 * @since 2019/06/14 </BR>
 * spring-core-mybatis-001 system </BR>
 * com.core.java.spring.entity </BR>
 * Department.java </BR>
 */
@Getter
@Setter
@ToString

/**
 * Instantiates a new department.
 */
@NoArgsConstructor
public class Department implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	private Integer id;

	/** The department name. */
	private String departmentName;
}