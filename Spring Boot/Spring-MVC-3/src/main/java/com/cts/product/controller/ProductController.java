package com.cts.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	@RequestMapping(value = "/loadForm")
	public String loadproductForm() {
		return "productform";
	}

	@RequestMapping(value = "/saveProduct")
	public String f1(Model model, @RequestParam("id") String id, @RequestParam("name") String name,
			@RequestParam("price") double price, @RequestParam("description") String description) {

		Product prod = new Product();
		prod.setId(id);
		prod.setName(name);
		prod.setPrice(price);
		prod.setDescription(description);

		model.addAttribute("myProduct", prod);
		return "one";

	}

	@RequestMapping("saveProduct_v1")
	public ModelAndView f2(@ModelAttribute Product prod) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("one");
		mav.addObject("myProduct", prod);
		return mav;

	}
	
	
	@RequestMapping(value="/updateForm")
	public String loadUpdateForm(Model model) {
		
		Product prod=new Product();
		prod.setId("P001");
		prod.setName("Pen");
		prod.setPrice(87.45);
		prod.setDescription("Blue Ink");
		
		model.addAttribute("product",prod);
		
		return "updateproduct";
	}
	
	
	
	
	
	
	
	
	
	
	

}
