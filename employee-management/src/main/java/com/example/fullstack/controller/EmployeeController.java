package com.example.fullstack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fullstack.model.Employee;
import com.example.fullstack.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")              //Class Level Mapping
public class EmployeeController {
	
	@Autowired
    private EmployeeService employeeService;

	@GetMapping("/List/Employee")
	public List<Employee> getAllEmployee(){
		
		return employeeService.getAllEmployee();
	}
	
}
