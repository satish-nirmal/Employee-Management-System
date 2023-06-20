package com.example.fullstack.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fullstack.model.Employee;
import com.example.fullstack.repository.EmployeeRepository;
import com.example.fullstack.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployee() {
	
		return employeeRepository.findAll() ;
	}

}
