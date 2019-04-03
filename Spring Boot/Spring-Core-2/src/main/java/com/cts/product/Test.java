package com.cts.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.product.dao.ProductDaoImpl;
import com.cts.product.model.Product;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		Product prod = new Product();

		prod.setProdId("P001");
		prod.setProdName("Book");
		prod.setPrice(76.45);

		Product prod1 = new Product();
		prod1.setProdId("P002");
		prod1.setProdName("Pen");
		prod1.setPrice(344);

		ProductDaoImpl dao1 = ac.getBean("prodDao1",ProductDaoImpl.class);
		ProductDaoImpl dao2 = ac.getBean("prodDao1",ProductDaoImpl.class);

		dao1.saveProduct(prod);
		dao2.saveProduct(prod1);

		System.out.println("--- Done ---");

	}

}
