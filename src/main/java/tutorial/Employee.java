/**
 * 
 */
package com.git.web.tutorial;

import java.io.Serializable;

/**
 * @author Arunangsu
 *
 */
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8958558763922192936L;
	private String employeeId;
	private String employeeName;
	private String employeeDesignation;
	private String employeeDepartment;

	/**
	 * 
	 */
	public Employee() {
		// No Argument Constructor
	}

	/**
	 * @param employeeId
	 * @param employeeName
	 */
	public Employee(String employeeId, String employeeName, String employeeDesignation, String employeeDepartment) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.employeeDepartment = employeeDepartment;
	}

	/**
	 * @return the employeeId
	 */
	public String getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * @return the employeeDesignation
	 */
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	/**
	 * @param employeeDesignation the employeeDesignation to set
	 */
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	/**
	 * @return the employeeDepartment
	 */
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	/**
	 * @param employeeDepartment the employeeDepartment to set
	 */
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	
	
}
