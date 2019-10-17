package com.developer.crud_employee.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.developer.crud_employee.entity.Employee;
import com.developer.crud_employee.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRESTController {

	private EmployeeService employeeService;

	@Autowired
	public EmployeeRESTController(EmployeeService empService) {
		employeeService = empService;
	}

	@GetMapping("/employees")
	public List<Employee> findAll() {
		return employeeService.findAll();
	}
	
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId) {
		Employee e = employeeService.findById(employeeId);
		if (e == null) {
			throw new RuntimeException("Employee not found");
		}
		return e;
	}
	
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		//employee.setId(0);
		employeeService.createEmployee(employee);
		return employee;
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		employeeService.createEmployee(employee);
		return employee;
	}
	
	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) {
		Employee employee = employeeService.findById(employeeId);
		
		if (employee == null) {
			throw new RuntimeException("Employee not found");
		}
		
		employeeService.deleteEmployee(employeeId);
		return "Deleted employee id - " + employeeId;
	}
}
