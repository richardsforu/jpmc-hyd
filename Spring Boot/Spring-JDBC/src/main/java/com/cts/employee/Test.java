package com.cts.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.employee.config.AppConfig;
import com.cts.employee.dao.EmployeeDaoImpl;
import com.cts.employee.model.Employee;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		EmployeeDaoImpl empDao=ac.getBean(EmployeeDaoImpl.class);
		//empDao.saveEmployee();
		//empDao.updateEmloyee(3, "Lilly");
		
//		Employee emp=empDao.findById(8);
//		System.out.println(emp.getId());
//		System.out.println(emp.getName());
//		System.out.println(emp.getSalary());
//		System.out.println("--------------------");
		
		
		// Listing all employees
		
		for(Employee emp:empDao.listAll()) {
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
			System.out.println("--------------------");
		}
		
		
		
		System.out.println("--- Done");

	}

}
