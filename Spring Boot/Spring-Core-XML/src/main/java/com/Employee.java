package com;

public class Employee {

	public Employee() {
		System.out.println("--- Employee Object created with "+this.hashCode());
	}

	private int empId;
	private String empName;
	private double salary;
	
	
	public void test() {
		System.out.println("--- Test method of Employee class");
	}

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
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
