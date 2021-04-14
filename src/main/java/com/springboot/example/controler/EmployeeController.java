package com.springboot.example.controler;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.example.Model.Employee;
import com.springboot.example.Service.EmployeeService;

@Controller
public class EmployeeController 
{   
	@Autowired
	private EmployeeService service;
  // displaying list of employee
	
	@RequestMapping("/")
	 public String viewHomepage(Model model)
	 {
		 model.addAttribute("ListEMployee" ,service.getAllEmplo());
		 
		  return"EmployForm";
	 }
	@RequestMapping("/addData")
	public String empdata(@Valid Employee emp ,BindingResult result ,Model model)
	{
		System.out.println("Model data = "+model);
		System.out.println("Emp = "+emp.toString());
		if(result.hasErrors()) {
			return "EmployForm";
		}
		else
		{
			return "Success";
		}
	}
}
