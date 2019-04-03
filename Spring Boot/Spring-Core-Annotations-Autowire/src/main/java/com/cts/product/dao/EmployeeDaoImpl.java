package com.cts.product.dao;

import org.springframework.stereotype.Repository;

import com.cts.product.model.Employee;

@Repository
public class EmployeeDaoImpl {

	public void saveEmployee(Employee emp) {
		System.out.println("Dao: " + emp.getEmpName() + " saved to DB");
	}

	
}
