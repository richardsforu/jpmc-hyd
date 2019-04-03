package com.cts.product.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cts.product.model.Product;

@Repository
public class ProductDaoImpl {

	public void saveProduct(Product prod) {
		System.out.println("Dao: " + prod.getProdName() + " saved to DB");
	}

	public List<Product> findAll() {
		return null;
	}

	public Product findById(String prodId) {
		return null;
	}

	public void updateProduct(Product prod) {
		System.out.println("dao: Updating product");
	}

	public void removeProduct(String prodId) {
		System.out.println("Dao: Removing Product ");
	}

}
