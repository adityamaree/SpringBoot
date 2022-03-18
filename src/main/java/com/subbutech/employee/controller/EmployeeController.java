package com.subbutech.employee.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subbutech.employee.entity.Employee;
import com.subbutech.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	
	@GetMapping
	public ResponseEntity<Map<String,Object>> getEmployee() {
		
		
		Map<String, Object> mapEmployee= new HashMap<>();
		
		List<Employee> employees = service.getEmployees();
		
		if(employees.isEmpty()) {
			mapEmployee.put("employees", new ArrayList<Employee>());
		}else {
			mapEmployee.put("employees", employees);
		}
		/*
		 * Map<String, Object> mapEmployee= new HashMap<>();
		 * mapEmployee.put("employees", Arrays.asList(new Employee(10, "Maree",
		 * "Sattur", Double.valueOf(40000)))); mapEmployee.put("status", HttpStatus.OK);
		 */
		
		return ResponseEntity.ok(mapEmployee);
		
	}
}
