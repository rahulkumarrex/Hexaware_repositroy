package com.hexaware.springrestweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrestweb.entity.Employee;
import com.hexaware.springrestweb.repository.IEmployeeRepository;
import com.hexaware.springrestweb.service.IEmployeeService;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@Autowired
	IEmployeeService service;
	
	@PostMapping("/add")
	public Employee createEmployee(@RequestBody Employee emp) {
		
		return service.addEmployee(emp);
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee emp) {
		
		return service.updateEmployee(emp);
		
	}
	@GetMapping("/getall")
	public List<Employee> getAll(){
		return service.getAllEmployees();
	}

	@GetMapping("/get/{eid}")
	public Employee  getById(@PathVariable  int eid) {
		
		return service.getEmployeeById(eid);
		
	}
	

	@DeleteMapping("/delete/{eid}")
	public String deleteById(@PathVariable int eid) {
		
		return service.deleteEmployeeById(eid);
	}
	
	

}
