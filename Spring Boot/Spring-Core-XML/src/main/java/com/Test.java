package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		Employee emp = ac.getBean("e3", Employee.class);
		Employee emp1 = (Employee) ac.getBean("e1");
		emp.test();
		System.out.println(emp.getEmpName());

		System.out.println("--- Done");

	}

}
