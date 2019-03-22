package com;

public class Test {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.empId = 10;
		e1.empName = "James";
		e1.salary = 5000;

		Employee e2 = new Employee();
		e2.empId = 11;
		e2.empName = "Praveen";
		e2.salary = 8666;

		// e1.display_v1();
		// e2.display_v1();

		// ----------------

		// Employee.display_v2(e1);
		// Employee.display_v2(e2);

		// ---------------------

//	Employee.processSalary(e1);
//	Employee.processSalary(e2);
//	-------------------------------

//		Employee.processSalary_v1(e1); CTRL + SHIFT +C for Comment
//		Employee.processSalary_v1(e2);
		

//------------------------------
		
		e1.processSalary_v2(); // readability
		e2.processSalary_v2();
		
		
		
		
		
		
		
		
		

	}

}
