package com.kmh.spring.dto;

import java.io.Serializable;

/**
 * @author ECW-PC-103
 *
 */
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	/** ID */
	private int id;
	/** First Name */
	private String firstName;

	/**
	 * Last Name
	 */
	private String lastName;

	/**
	 * construct Employee object.
	 */
	public Employee() {
	}

	/**
	 * This construct an employee with the specify properties.
	 * 
	 * @param id        The ID of the employee
	 * @param firstName The first name of the employee.
	 * @param lastName  The last name of the employee.
	 */
	public Employee(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}