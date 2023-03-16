package com.deneme.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deneme.demo.model.Company;
import com.deneme.demo.model.Employee;
import com.deneme.demo.serviceImpl.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee/")

public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl employeeService;

	public EmployeeController() {}
	public EmployeeController(EmployeeServiceImpl employeeService) {
		super();
		this.employeeService = employeeService;
	}
	@PostMapping("create")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);}

	@GetMapping("getAll")
	public List <Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	@DeleteMapping("delete/{id}")
	 public void deleteEmployee(@PathVariable long id) {
		employeeService.deleteEmployee(id);
		
	}
	@GetMapping("get/{id}")
	public Employee getById(@PathVariable long id){ 
		return employeeService.getEmployeeById(id);
	}
	@PutMapping("update/{id}")
	public Employee updateEmployee (@PathVariable long id,@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee,id);
	}
	@GetMapping("getName/{name}")
	public List <Employee> getByName(@PathVariable String name){
		return employeeService.findByNameContaining(name);
	}
	@GetMapping("getCompanyId/{id}")
	public List<Employee> fgetEmployeesForCompany(@PathVariable long id){
		return employeeService.findByCompanyId(id);
	}
	
		}

