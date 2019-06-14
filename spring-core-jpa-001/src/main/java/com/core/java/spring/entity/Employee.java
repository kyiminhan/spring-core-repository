package com.core.java.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
 * spring-core-jpa-001 system </BR>
 * com.core.java.spring.entity </BR>
 * Employee.java </BR>
 */
@Getter
@Setter
@ToString
@Entity

/**
 * Builds the.
 *
 * @return Employee
 */
@Builder

/**
 * Instantiates a new employee.
 */
@NoArgsConstructor

/**
 * Instantiates a new employee.
 *
 * @param id the id
 * @param name the name
 * @param email the email
 * @param address the address
 * @param phone the phone
 */
@AllArgsConstructor
public class Employee implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/** The name. */
	@Column
	private String name;

	/** The email. */
	@Column
	private String email;

	/** The address. */
	@Column
	private String address;

	/** The phone. */
	private String phone;
}