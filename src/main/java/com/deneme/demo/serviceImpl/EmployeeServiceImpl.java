package com.deneme.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deneme.demo.exception.ResourceNotFoundException;
import com.deneme.demo.model.Company;
import com.deneme.demo.model.Employee;
import com.deneme.demo.repository.ICompanyRepository;
import com.deneme.demo.repository.IEmployeeRepository;
import com.deneme.demo.service.IEmployeeService;
@Service
public class EmployeeServiceImpl  implements IEmployeeService{
	@Autowired
	private IEmployeeRepository employeeRepository;
	
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployee(Employee employee, long id) {
		Employee updateEmployee = employeeRepository.findById(id).orElseThrow(() ->
		new ResourceNotFoundException("Company Id:"+ id));
		updateEmployee.setName(employee.getName());
		updateEmployee.setRole(employee.getRole());
		updateEmployee.setSalary(employee.getSalary());
		return employeeRepository.save(updateEmployee);
		
	}

	@Override
	public Employee getEmployeeById(long id) {
		return employeeRepository.findById(id).orElseThrow(() ->
		new ResourceNotFoundException("Company Id:"+ id));
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(long id) {
		employeeRepository.deleteById(id);
	}

	

	

@Override
	public List<Employee> findByNameContaining(String name) {
		return employeeRepository.findByNameContaining(name);
	}

	@Override
	public List<Employee> findByCompanyId(Long companyId) {
		return employeeRepository.findByCompanyId(companyId); 
	}

	



	}

