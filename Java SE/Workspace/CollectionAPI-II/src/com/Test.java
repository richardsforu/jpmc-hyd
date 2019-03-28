package com;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		Employee e1 = new Employee(10, "Abc", 94755);
		Employee e2 = new Employee(11, "Xyz", 64755);
		Employee e3 = new Employee(12, "Jhg", 24755);
		Employee e4 = new Employee(13, "Ljh", 64955);
		Employee e5 = new Employee(14, "Bgf", 25755);

		List<Employee> emps = new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		
		
		for(Employee emp:emps) {
			Employee.display(emp);
		}
		
		
		

	}

}
