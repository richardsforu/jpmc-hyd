package com;

import java.io.Serializable;
import java.util.ArrayList;

public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5;
	private int empId;
	private String empName;
	private double salary;
	private String projName="Ford";
	private String addr;
	transient int age=100;
	
	

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		// validate user
		// calculations
		
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
