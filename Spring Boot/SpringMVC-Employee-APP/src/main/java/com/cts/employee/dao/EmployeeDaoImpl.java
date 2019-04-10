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

	public void saveEmployee(Employee emp) {
		String qry = "insert into employee values(?,?,?)";
		jt.update(qry, emp.getId(), emp.getName(), emp.getSalary());
		//System.out.println("---- Dao: Record Inserted to DB");
	}
	
	public void removeEmployee(String id) {
		String qry="delete from employee where id=?";
		jt.update(qry,id);
	}

	public void updateEmloyee(Employee emp) {

		String qry = "update employee set name=?,salary=? where id=?";
		jt.update(qry, emp.getName(),emp.getSalary(),emp.getId());

	}

	// fetching Operations

	/*
	 * 1. RowMapper -> mapRow(rs,id); 2. RowCallbackHandler -> processRow() 3.
	 * resultsetExtractor -> extractRow(rs)
	 */

	public Employee findById(String id) {

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
