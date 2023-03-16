package com.deneme.demo.service;

import java.util.List;

import com.deneme.demo.model.Company;

public interface ICompanyService {
	List<Company>getAllCompany();
	Company getCompanyById(long id);
	Company saveCompany(Company company);
	Company updateCompany(Company company,long id);
	void deleteCompany(long id);

}
