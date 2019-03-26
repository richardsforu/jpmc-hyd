package com;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deser {

	public static void main(String[] args) {

		try {

			FileInputStream fis = new FileInputStream("src/emp.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Employee e = (Employee) ois.readObject();

			System.out.println(e.getEmpId());
			System.out.println(e.getEmpName());
			System.out.println(e.getSalary());
			System.out.println(e.age);
			System.out.println("--------------------");

		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}

	}

}
