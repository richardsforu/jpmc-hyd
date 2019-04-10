package com.cts.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.employee.dao.EmployeeDaoImpl;
import com.cts.employee.model.Employee;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeDaoImpl empDao;

	@RequestMapping("/")
	public String welcome() {
		return "index";
	}

	@RequestMapping("/listAll")
	public String listAll(Model model) {

		List<Employee> emps = empDao.listAll();

		model.addAttribute("employees", emps);
		return "employees";

	}

	// load Employee Form

	@RequestMapping("loadEmployeeForm")
	public String loadEmployeeForm() {
		return "employeeform";
	}

	@RequestMapping("saveEmployee")
	public ModelAndView saveEmployee(@ModelAttribute Employee emp) {

		ModelAndView mav = new ModelAndView();

		empDao.saveEmployee(emp);
		mav.setViewName("redirect:listAll");
		return mav;
	}

	// find EMployee

	// load Find employee page
	@RequestMapping("loadFindEmpoyeeForm")
	public String loadFindEmployeePage(@RequestParam("status")String status,Model model) {
		
		String url=null;
		// To Display Find form
		
		if(status.equals("find")) {
		url="findemployeeform"	;
		model.addAttribute("status",status);
		}
		

		if(status.equals("update")) {
		url="findemployeeform";
		model.addAttribute("status",status);
		}
		
		if(status.equals("remove")) {
			url="findemployeeform";
			model.addAttribute("status",status);
		}
		
		// To Display update form
		
		
		
		return "findemployeeform";
	}

	// load employee from db

	@RequestMapping("findEmployee")
	public ModelAndView findEmployee(@RequestParam("id") String id,@RequestParam("status")String status) {
		
		//System.out.println("----> Status: "+status);
		ModelAndView mav = new ModelAndView();

		String url = null;
		if(status.equals("remove")) {
			url="redirect:listAll";
			empDao.removeEmployee(id);
			mav.setViewName(url);
			return mav;
		}
		
		Employee emp = empDao.findById(id);
		
		
		
		if(status.equals("update")) {
			url="employeeupdateform";
			mav.addObject("employee",emp);
		}
		
		
		if (emp != null && !(status.equals("update"))) {
			url = "employee";
			mav.addObject("emp", emp);
		} else {
			//url = "findemployeeform?msg=Employee Id Does not exists";
		}

		mav.setViewName(url);
		return mav;

	}
	
	// Update EMployee to DB
	
	@RequestMapping("updateEmployee")
	public String something(@ModelAttribute Employee emp) {
		
		empDao.updateEmloyee(emp);
		
		return "redirect:listAll";
		
	}
	
	
	
	
	

}
