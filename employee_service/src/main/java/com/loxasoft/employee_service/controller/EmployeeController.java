package com.loxasoft.employee_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loxasoft.employee_service.dto.ResponseDTO;
import com.loxasoft.employee_service.entity.Employee;
import com.loxasoft.employee_service.service.EmployeeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/employes")
@AllArgsConstructor
public class EmployeeController {
	private final EmployeeService employeeService = new EmployeeService();
	
	@PostMapping
	public Employee savEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	@GetMapping
	public ResponseDTO getEmployeeById(@PathVariable Integer id) {
		return employeeService.getEmployeeById(id);
	}
}
