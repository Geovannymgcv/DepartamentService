package com.loxasoft.departement_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.loxasoft.departement_service.entity.Departament;
import com.loxasoft.departement_service.repository.DepartamentRepository;

@Service
public class DepartamentService {
	private final DepartamentRepository departamentRepository;

	public DepartamentService(DepartamentRepository departamentRepository) {
		this.departamentRepository = departamentRepository;
	}
	
	public Departament createDepartament (Departament departament) {
		return departamentRepository.save(departament);
	}
	
	public Departament getDepartamentbyId (Integer id) {
		return departamentRepository.findById(id).get();
	}
	
	public List<Departament> findAll(){
		return departamentRepository.findAll();
	}
}
