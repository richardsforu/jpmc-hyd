package com.cts.employee.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cts.employee.model.Employee;

@Repository
public class EmployeeDaoImpl {

	@Autowired
	private JdbcTemplate jt;

	public void saveEmployee() {
		String qry = "insert into employee values(11,'Dennin',1213)";
		String qry1 = "update employee set name='prashi' where id=5";
		jt.update(qry1);
		System.out.println("---- Dao: Record Updated to DB");
	}

	public void updateEmloyee(int empId, String empName) {

		String qry = "update employee set name=? where id=?";
		jt.update(qry, empName, empId);

	}

	// fetching Operations

	/*
	 * 1. RowMapper -> mapRow(rs,id); 2. RowCallbackHandler -> processRow() 3.
	 * resultsetExtractor -> extractRow(rs)
	 */

	public Employee findById(int id) {

		String qry = "select * from employee where id=?";

		return jt.queryForObject(qry, new GetEmployeeObject(), id);
	}

	// Listing all records

	public List<Employee> listAll() {
		String qry = "select * from employee";
		return jt.queryForObject(qry, new ListAllEmployees());
	}

}

// resultsetExtractor

class GetEmployeeObject implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

		Employee emp = new Employee();
		emp.setId(rs.getInt("id"));
		emp.setName(rs.getString("name"));
		emp.setSalary(rs.getDouble("salary"));

		return emp;
	}

}

class ListAllEmployees implements RowMapper<List<Employee>> {

	List<Employee> emps = new ArrayList<Employee>();

	public List<Employee> mapRow(ResultSet rs, int rowNum) throws SQLException {

		do {
			Employee emp = new Employee();
			emp.setId(rs.getInt("id"));
			emp.setName(rs.getString("name"));
			emp.setSalary(rs.getDouble("salary"));

			emps.add(emp);

		} while ((rs.next()));

		return emps;
	}

}
