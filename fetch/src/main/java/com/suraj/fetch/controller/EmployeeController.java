package com.suraj.fetch.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.suraj.fetch.entity.Employee;
import com.suraj.fetch.repository.EmployeeRepository;

import org.springframework.ui.Model;


@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository repository;
	
	@GetMapping("/")
	public String getEmployees(Model model)
	{
		model.addAttribute("employees",repository.findAll());
		
		return "employees";
		
	}
	@PostMapping("/saveEmployee")
//	@ResponseBody
	public String saveEmployee(@RequestParam String name, @RequestParam Double salary)
	{
		Employee employee = new Employee();
		employee.setName(name);
		employee.setSalary(salary);
		repository.save(employee);
		//return "";
		return "redirect:/";
		//return "Name :" + name +  " salary :" + salary;
	}
		
	public EmployeeController() { }

}
