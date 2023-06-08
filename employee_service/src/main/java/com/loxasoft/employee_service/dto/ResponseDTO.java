package com.loxasoft.employee_service.dto;

import com.loxasoft.employee_service.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {
	private Employee employee;
	private DepartamentDTO departamentDTO;
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public DepartamentDTO getDepartamentDTO() {
		return departamentDTO;
	}
	public void setDepartamentDTO(DepartamentDTO departamentDTO) {
		this.departamentDTO = departamentDTO;
	}
}
