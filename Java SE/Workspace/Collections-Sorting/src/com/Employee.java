package com;

import java.util.Comparator;
import java.util.List;

public class Employee  implements Comparable<Employee>,Comparator<Employee>{

	private int id;
	private String name;
	private double salary;
	
	
	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		return id-emp.getId();
	}
	
	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return emp1.getName().compareTo(emp2.getName());
	}
	
	
	
	
	
	

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void display(List<Employee> emps) {

		System.out.println("ID\tNAME\tSALARY");
		System.out.println("------------------------------");
		for (Employee emp : emps) {
			System.out.println(emp.getId() + "\t" + emp.getName() + "\t" + emp.getSalary());
		}

		System.out.println("------------------------------");

	}

}
