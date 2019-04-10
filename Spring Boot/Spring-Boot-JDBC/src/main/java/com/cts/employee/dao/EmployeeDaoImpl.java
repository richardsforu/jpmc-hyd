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

	public List<Employee> listAll() {

		return jt.queryForObject("select * from employee", new ListEmployees());
	}

}

class ListEmployees implements RowMapper<List<Employee>> {

	@Override
	public List<Employee> mapRow(ResultSet rs, int rowNum) throws SQLException {

		List<Employee> emps = new ArrayList<Employee>();
		do {
			Employee emp = new Employee();
			emp.setId(rs.getString(1));
			emp.setName(rs.getString(2));
			emp.setSalary(rs.getDouble(3));
			emps.add(emp);

		} while (rs.next());

		return emps;
	}

}
