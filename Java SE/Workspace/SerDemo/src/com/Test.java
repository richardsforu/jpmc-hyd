package com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setEmpId(10);
		emp.setEmpName("Praveen");
		emp.setSalary(45745);

		try {

			FileOutputStream fos = new FileOutputStream("src/emp.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);

			System.out.println("---- Writing is done ");

		} catch (Exception e) {
			System.out.println("-- Failed due to  " + e);
		}

	}

}
