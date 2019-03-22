package com;

public class Employee {
	
	int empId;
	String empName;
	double salary;
	
	Department dept; // Has 'A'
	
	public void setDept(Department dept) {
		this.dept = dept;
	}

	void employeeInfo() {
		System.out.println("EMp Id: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("Salary: "+salary);
		
		System.out.println("Dept Id: "+dept.deptId);
		System.out.println("Name: "+dept.deptName);
		System.out.println("Loc: "+dept.loc);
		
		System.out.println("-----------------------");
		
		
	}

}
