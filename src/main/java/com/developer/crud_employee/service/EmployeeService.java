package com.developer.crud_employee.service;

import java.util.List;

import com.developer.crud_employee.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int empId);
	
	public void createEmployee(Employee emp);
	
	public void deleteEmployee(int empId);
}
