package com.deneme.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



import com.deneme.demo.model.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Long> {
	List<Employee> findByCompanyId(long id);
	public List<Employee> findByNameContaining(String name);
	 
   
}
