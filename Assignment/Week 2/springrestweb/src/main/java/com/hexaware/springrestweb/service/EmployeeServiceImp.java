package com.hexaware.springrestweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springrestweb.entity.Employee;
import com.hexaware.springrestweb.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImp implements IEmployeeService{

	@Autowired
	IEmployeeRepository repo;
	
	@Override
	public Employee addEmployee(Employee employee) {
		return repo.addEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		
		return repo.updateEmployee(emp);
	}

	

	@Override
	public String deleteEmployeeById(int eid) {
		return repo.deleteEmployeeById(eid);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repo.getAllEmployees();
	}

	@Override
	public Employee getEmployeeById(int eid) {

		return repo.getEmployeeById(eid);
	}
	
	

}
