package com.cts.product.service;

import com.cts.product.dao.ProductDaoImpl;
import com.cts.product.model.Product;

public class ProductServiceImpl {

	private ProductDaoImpl prodDao;

	public void setProdDao(ProductDaoImpl prodDao) {
		this.prodDao = prodDao;
	}

	public void storeProduct(Product prod) {
		prodDao.saveProduct(prod);
	}

}
