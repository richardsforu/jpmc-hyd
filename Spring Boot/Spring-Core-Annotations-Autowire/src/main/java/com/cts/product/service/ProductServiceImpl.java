package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.EmployeeDaoImpl;
import com.cts.product.dao.ProductDaoImpl;
import com.cts.product.model.Employee;
import com.cts.product.model.Product;

@Service
public class ProductServiceImpl {

	@Autowired
	private ProductDaoImpl prodDao;

	@Autowired
	private EmployeeDaoImpl empDao;

	public void processProduct(Product prod) {

		prodDao.saveProduct(prod);

	}

	public void processEmployee(Employee emp) {
		empDao.saveEmployee(emp);
	}

}
