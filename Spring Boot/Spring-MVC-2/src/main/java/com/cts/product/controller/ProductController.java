package com.cts.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.model.Product;

@Controller
public class ProductController {

	@RequestMapping(value = "/")
	public String loadPage(Model model) {

		String userName = "Praveen";
		model.addAttribute("un", userName);

		return "index";
	}

	@RequestMapping("/s3")
	public String f3(Model model) {

		Product prod = new Product();
		prod.setId("P001");
		prod.setName("Book");
		prod.setPrice(76.45);
		prod.setDescription("200 Pages");
		model.addAttribute("myProduct", prod);
		model.addAttribute("cityName", "Hydrabad");

		Product p1 = new Product("P002", "Prodduct1", 10000, "My Description 1");
		Product p2 = new Product("P003", "Prodduct2", 20000, "My Description 2");
		Product p3 = new Product("P004", "Prodduct3", 30000, "My Description 3");
		Product p4 = new Product("P005", "Prodduct4", 40000, "My Description 4");
		Product p5 = new Product("P006", "Prodduct5", 50000, "My Description 5");
		Product p6 = new Product("P007", "Prodduct6", 60000, "My Description 6");
		Product p7 = new Product("P008", "Prodduct7", 70000, "My Description 7");
		Product p8 = new Product("P009", "Prodduct8", 80000, "My Description 8");
		Product p9 = new Product("P010", "Prodduct9", 90000, "My Description 9");
		Product p10 = new Product("P011", "Prodduct10", 15000, "My Description 10");

		List<Product> prods = new ArrayList<Product>();
		prods.add(p1);
		prods.add(p2);
		prods.add(p3);
		prods.add(p4);
		prods.add(p5);
		prods.add(p6);
		prods.add(p7);
		prods.add(p8);
		prods.add(p9);
		prods.add(p10);

		model.addAttribute("products", prods);

		return "one";
	}

	@RequestMapping("/s4")
	public ModelAndView f4() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("two");

		Product prod = new Product();
		prod.setId("P001");
		prod.setName("Book");
		prod.setPrice(76.45);
		prod.setDescription("200 Pages");

		Product p1 = new Product("P002", "Prodduct1", 10000, "My Description 1");
		Product p2 = new Product("P003", "Prodduct2", 20000, "My Description 2");
		Product p3 = new Product("P004", "Prodduct3", 30000, "My Description 3");
		Product p4 = new Product("P005", "Prodduct4", 40000, "My Description 4");
		Product p5 = new Product("P006", "Prodduct5", 50000, "My Description 5");
		Product p6 = new Product("P007", "Prodduct6", 60000, "My Description 6");
		Product p7 = new Product("P008", "Prodduct7", 70000, "My Description 7");
		Product p8 = new Product("P009", "Prodduct8", 80000, "My Description 8");
		Product p9 = new Product("P010", "Prodduct9", 90000, "My Description 9");
		Product p10 = new Product("P011", "Prodduct10", 15000, "My Description 10");

		List<Product> prods = new ArrayList<Product>();
		prods.add(p1);
		prods.add(p2);
		prods.add(p3);
		prods.add(p4);
		prods.add(p5);
		prods.add(p6);
		prods.add(p7);
		prods.add(p8);
		prods.add(p9);
		prods.add(p10);

		mav.addObject("products", prods);
		mav.addObject("cityName", "Pune");
		mav.addObject("myProduct", prod);

		return mav;
	}

	@RequestMapping(value = "/s1")
	public void f1() {
		System.out.println("-- f1 method of ProductController...");
	}

	@RequestMapping(value = "/s2")
	public void f2() {
		System.out.println("-- f2 method of ProductController...");
	}

}
