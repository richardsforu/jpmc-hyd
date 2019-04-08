package com.cts.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/s1")
	public void f1() {
		System.out.println("-- f1 method of MyController class");
	}

}
