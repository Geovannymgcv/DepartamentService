package com.loxasoft.employee_service.service;

import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.loxasoft.employee_service.dto.DepartamentDTO;
import com.loxasoft.employee_service.dto.ResponseDTO;
import com.loxasoft.employee_service.entity.Employee;
import com.loxasoft.employee_service.repository.EmployeeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeService {
	private final EmployeeRepository employeeRepository = null;
	private final RestTemplate restTemplate = new RestTemplate();
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public ResponseDTO getEmployeeById(Integer id) {
		ResponseDTO responseDTO = new ResponseDTO();
		Employee employee = new Employee();
		employee = employeeRepository.findById(id).get();
		
		ResponseEntity<DepartamentDTO> responseEntity = restTemplate.getForEntity("http://localhost:8080/api/departament" + employee.getDepartamentId(),
				DepartamentDTO.class);
		
		DepartamentDTO departamentDTO = responseEntity.getBody();
		responseDTO.setEmployee(employee);
		responseDTO.setDepartamentDTO(departamentDTO);
		
		return responseDTO;
	}
}
