package com.subbutech.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subbutech.employee.entity.Employee;
import com.subbutech.employee.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo repo;
	
	public List<Employee> getEmployees(){
		
		return repo.findAll();
		
	}
}
