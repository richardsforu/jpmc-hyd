package com.cts.product.dao;

import java.util.List;

import com.cts.product.model.Product;

// Dependency class 
public class ProductDaoImpl {
	
	
	
	public ProductDaoImpl() {
		System.out.println("--- ProductDaoImpl Object crated with "+this.hashCode());
	}

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
