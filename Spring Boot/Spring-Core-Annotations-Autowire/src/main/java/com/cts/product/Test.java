package com.cts.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.dao.ProductDaoImpl;
import com.cts.product.model.Employee;
import com.cts.product.model.Product;
import com.cts.product.service.ProductServiceImpl;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		Product prod = new Product();
		prod.setProdId("P001");
		prod.setProdName("Book");
		prod.setPrice(377);
		
		Employee emp=new  Employee();
		emp.setEmpId(122);
		emp.setEmpName("Praveen");
		emp.setSalary(457945);

	
		ProductServiceImpl service=ac.getBean(ProductServiceImpl.class);
		service.processProduct(prod);
		service.processEmployee(emp);
		
		System.out.println("Done");

	}

}
