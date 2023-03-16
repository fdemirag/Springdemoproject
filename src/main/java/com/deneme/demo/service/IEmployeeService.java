package com.deneme.demo.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.deneme.demo.model.Company;
import com.deneme.demo.model.Employee;

public interface IEmployeeService {
	
  List<Employee> getAllEmployees();
  Employee updateEmployee(Employee employee, long id);
  Employee getEmployeeById(long id);
  Employee saveEmployee(Employee employee);
  void deleteEmployee(long id);
  List<Employee> findByCompanyId(Long companyId);
 public List<Employee> findByNameContaining(String name);

}
