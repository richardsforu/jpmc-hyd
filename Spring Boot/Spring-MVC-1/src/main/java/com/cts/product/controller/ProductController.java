package com.cts.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping(value="/")
	public String loadPage(Model model) {
		
		String userName="Praveen";
		model.addAttribute("un", userName);
		
		return "index";
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
