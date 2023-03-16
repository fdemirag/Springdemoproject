package com.deneme.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deneme.demo.model.Company;
import com.deneme.demo.serviceImpl.CompanyServiceImpl;

@RestController
@RequestMapping("company/")

public class CompanyController {
	
	@Autowired
	private CompanyServiceImpl companyService;
	
	public CompanyController() {}

	public CompanyController(CompanyServiceImpl companyService) {
		super();
		this.companyService = companyService;
	}
	@GetMapping("getAll")
	public List<Company> getAllCompany(){
		return companyService.getAllCompany();
	}
	@GetMapping("get/{id}")
	public Company getById(@PathVariable long id) {	
	 return companyService.getCompanyById(id);}
	
	
	
	@PostMapping ("create")
	public Company saveCompany(@RequestBody Company company) {
		return companyService.saveCompany(company);
		
	}
	@DeleteMapping("delete/{id}")
	public void deleteCompany(@PathVariable long id) {
		companyService.deleteCompany(id);
	}
	@PutMapping ("update/{id}")
	public Company updateCompany(@PathVariable long id, @RequestBody Company company) {
		return companyService.updateCompany(company, id);
		
	}
	
	
}
