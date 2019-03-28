package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return (int) (emp1.getSalary()-emp2.getSalary());
	}
	
	
	
}
public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee(765, "Xyz", 15000);
		Employee e2 = new Employee(328, "Kgf", 25000);
		Employee e3 = new Employee(176, "Dfg", 12000);
		Employee e4 = new Employee(276, "Ahg", 11000);
		Employee e5 = new Employee(100, "Ckj", 23000);

		List<Employee> emps = new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		
		System.out.println("Original Data");
		Employee.display(emps);
		
		System.out.println("Using ID");
		Collections.sort(emps);
		Employee.display(emps);
		
		System.out.println("Using Name");
		Collections.sort(emps,new Employee());
		Employee.display(emps);
		
		System.out.println("Using Salary");
		Collections.sort(emps,new SortBySalary());
		Employee.display(emps);
		
		
		
		
		
		

	}

}
