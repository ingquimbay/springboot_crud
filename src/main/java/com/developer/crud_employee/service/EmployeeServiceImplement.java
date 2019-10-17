package com.developer.crud_employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.developer.crud_employee.dao.EmployeeDAO;
import com.developer.crud_employee.entity.Employee;

@Service
public class EmployeeServiceImplement implements EmployeeService {

	private EmployeeDAO employeeDAO;

	@Autowired
	public EmployeeServiceImplement(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	@Transactional
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int empId) {
		return employeeDAO.findById(empId);
	}

	@Override
	@Transactional
	public void createEmployee(Employee emp) {
		employeeDAO.createEmployee(emp);
	}

	@Override
	@Transactional
	public void deleteEmployee(int empId) {
		employeeDAO.deleteEmployee(empId);
	}

}
