package com;

public class HR {
	
	public static void main(String[] args) {
		
		Department d1=new Department();
		d1.deptId=10;
		d1.deptName="HR";
		d1.loc="Hyderabad";
		
		Employee e1=new Employee();
		e1.empId=1024;
		e1.empName="James";
		e1.salary=8456855;
		e1.setDept(d1);
		
		
		e1.employeeInfo();
		
		
	}

}
