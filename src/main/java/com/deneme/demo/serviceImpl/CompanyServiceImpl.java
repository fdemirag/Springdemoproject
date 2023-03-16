package com.deneme.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deneme.demo.exception.ResourceNotFoundException;
import com.deneme.demo.model.Company;
import com.deneme.demo.model.Employee;
import com.deneme.demo.repository.ICompanyRepository;
import com.deneme.demo.repository.IEmployeeRepository;
import com.deneme.demo.service.ICompanyService;
@Service
public class CompanyServiceImpl implements ICompanyService {
	@Autowired
	private ICompanyRepository companyRepository;


	@Override
	public List<Company> getAllCompany() {
		return companyRepository.findAll();
		
	}

	@Override
	public Company getCompanyById(long id) {
		return companyRepository.findById(id).orElseThrow(() ->
				new ResourceNotFoundException("Company Id:"+ id));
			
		
	}

	@Override
	public Company saveCompany(Company company) {
		return companyRepository.save(company);
	}

	@Override
	public Company updateCompany(Company company, long id) {
		Company updateCompany= companyRepository.findById(id).orElseThrow(() ->
		new ResourceNotFoundException("Company Id:"+ id));
		updateCompany.setIndustry(company.getIndustry());
		updateCompany.setLocation(company.getLocation());
		updateCompany.setName(company.getName());
		companyRepository.save(updateCompany);
		return updateCompany;
	}

	@Override
	public void deleteCompany(long id) {
		companyRepository.deleteById(id);
		
	}

}
