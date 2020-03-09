package com.kmh.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kmh.spring.dto.Employee;
import com.kmh.spring.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/")
	public String home() {
		return "redirect:/create";
	}

	@GetMapping("/create")
	public String create(Model model) {
		model.addAttribute("employee", new Employee());
		model.addAttribute("employees", this.employeeService.getAll());
		return "index";
	}

	@PostMapping("/create")
	public String create(@ModelAttribute("employee") Employee emp, Model model) {
		this.employeeService.save(emp);
		return home();
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") int id, Model model) {
		model.addAttribute("employee", this.employeeService.get(id));
		model.addAttribute("employees", this.employeeService.getAll());
		return "index";
	}

	@PostMapping("/edit/{id}")
	public String edit(@PathVariable("id") int id, @ModelAttribute("employee") Employee emp, Model model) {
		this.employeeService.edit(emp);
		return home();
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id, Model model) {
		this.employeeService.delete(id);
		return home();
	}
}