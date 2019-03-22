package com;

public class Employee {

	int empId;
	String empName;
	double salary;

	void display_v1() {
		System.out.println("Id: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Salary: " + salary);
		System.out.println("_________________________");
	}
	
	static void display_v2(Employee emp) {
		System.out.println(emp.empId);
		System.out.println(emp.empName);
		System.out.println(emp.salary);
		System.out.println("--------------------");
	}
	
	// involes display_v2 static method
	 static void  processSalary(Employee emp) {
		emp.salary=emp.salary+5000;
		display_v2(emp);
	}
	 
	 
	 // invoke disolay_v1 non static method
	 static void  processSalary_v1(Employee emp) {
		emp.salary=emp.salary+5000;
		emp.display_v1();
	 }
	 
	 // invoke disolay_v1 non static method 
		 void  processSalary_v2() {
			this.salary=this.salary+5000;
			this.display_v1();
		 }
	
	
	
	
	
	
	
	

}
