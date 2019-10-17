package com.developer.crud_employee.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.developer.crud_employee.entity.Employee;

@Repository
public class EmployeeDAOHibernateImplement implements EmployeeDAO{

	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOHibernateImplement(EntityManager entityManager) {
		this.entityManager = entityManager; 
	}
	@Override
	public List<Employee> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		
		// you should use the java class name and property name of the mapped @Entity instead of the actual table name and column name
		Query<Employee> q = currentSession.createQuery("from Employee", Employee.class);
		
		List<Employee> employees = q.getResultList();
		
		return employees;
	}
	
	@Override
	public Employee findById(int empId) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		Employee e = currentSession.get(Employee.class, empId);
		
		return e;
	}
	
	@Override
	public void createEmployee(Employee emp) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		currentSession.saveOrUpdate(emp);
		
	}
	
	@Override
	public void deleteEmployee(int empId) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query q = currentSession.createQuery("delete from Employee where id=:employeeId");
		q.setParameter("employeeId", empId);
		q.executeUpdate();
	}

}
