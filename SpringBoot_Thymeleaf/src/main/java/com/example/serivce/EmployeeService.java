package com.example.serivce;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeService {

	public List<Employee> findAll();

	public void save(Employee theEmployee);

	public void deleteById(Long theId);

}
