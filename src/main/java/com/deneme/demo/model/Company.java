package com.deneme.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="company")

public class Company {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
	@Column(name="name")
private String name;
	@Column(name="industry")
private String industry;
	@Column(name="location")
private String location;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy="company")
	
	private List<Employee> employee;
	
	







public Company(long id, String name, String industry, String location , List<Employee> employee) {
	super();
	this.id = id;
	this.name = name;
	this.industry = industry;
	this.location = location;
	this.employee=employee;
}
public Company() {}

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getIndustry() {
	return industry;
}
public void setIndustry(String industry) {
	this.industry = industry;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public List<Employee> getEmployee() {
	return employee;
}


public void setEmployee(List<Employee> employee) {
	this.employee = employee;
}

}
