package com.deneme.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deneme.demo.model.Company;

public interface ICompanyRepository extends JpaRepository<Company, Long>{

}
