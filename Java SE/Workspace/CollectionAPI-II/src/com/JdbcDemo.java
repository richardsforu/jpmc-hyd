package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcDemo {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root1234");

			String q1 = "select * from employee";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(q1);

			List<Employee> emps = new ArrayList<>();

			while (rs.next()) {

				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getDouble(3));

				emps.add(emp);

			}
			
			
			for(Employee emp:emps) {
				System.out.println(emp.getId());
				System.out.println(emp.getName());
				System.out.println(emp.getSalary());
				System.out.println("---------------------");
			}

		} catch (Exception e) {
			System.out.println("-- failed due to " + e);
		}

	}

}
