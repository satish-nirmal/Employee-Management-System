package com.example.fullstack.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.fullstack.model.Employee;

@Service
public interface EmployeeService {

	
	public List<Employee> getAllEmployee() ;
}
