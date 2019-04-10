package com.cts.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.employee.dao.EmployeeDaoImpl;
import com.cts.employee.model.Employee;

@SpringBootApplication
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(SpringBootJdbcApplication.class, args);
	
		EmployeeDaoImpl dao=ac.getBean(EmployeeDaoImpl.class);
		
		
		for(Employee emp:dao.listAll()) {
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
			System.out.println("-----------------------");
		}
	}

}
