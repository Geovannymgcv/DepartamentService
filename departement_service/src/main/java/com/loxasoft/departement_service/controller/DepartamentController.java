package com.loxasoft.departement_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loxasoft.departement_service.entity.Departament;
import com.loxasoft.departement_service.service.DepartamentService;

@RestController
@RequestMapping("/api/departament")
public class DepartamentController {
	private final DepartamentService departamentService;
	
	public DepartamentController (DepartamentService departamentService) {
		this.departamentService = departamentService;
	}
	
	@PostMapping
	public Departament createDepartament(@RequestBody Departament departament) {
		return departamentService.createDepartament(departament);
	}
	
	@GetMapping("/{id}")
	public Departament getDepartamentbyId(@PathVariable Integer id) {
		return departamentService.getDepartamentbyId(id);
	}
	
	@GetMapping
	public List<Departament> findAll(){
		return departamentService.findAll();
	}
}
