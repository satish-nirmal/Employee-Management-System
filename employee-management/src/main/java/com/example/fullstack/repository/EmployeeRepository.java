package com.example.fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fullstack.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
