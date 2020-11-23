package com.parth.org.coolapp.rest.service;

import java.util.List;

import com.parth.org.coolapp.rest.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}