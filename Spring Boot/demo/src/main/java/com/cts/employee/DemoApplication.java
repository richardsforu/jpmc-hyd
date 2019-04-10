package com.cts.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.cts.Test;
import com.cts.employee.dao.EmpoyeeDapImpl;

@SpringBootApplication
//@ComponentScan("com.cts")
public class DemoApplication {

	public static void main(String[] args) {
	ApplicationContext ac=	SpringApplication.run(DemoApplication.class, args);
		
		Employee emp=ac.getBean(Employee.class);
		EmpoyeeDapImpl dao=ac.getBean(EmpoyeeDapImpl.class);
		Test t=ac.getBean(Test.class);
		emp.f1();
		dao.f2();
		t.f3();
	}

}
