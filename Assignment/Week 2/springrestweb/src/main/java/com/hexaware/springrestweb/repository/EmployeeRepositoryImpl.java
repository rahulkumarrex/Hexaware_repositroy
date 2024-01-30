package com.hexaware.springrestweb.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.springrestweb.entity.Employee;
import com.hexaware.springrestweb.service.IEmployeeService;


@Repository
public class EmployeeRepositoryImpl implements IEmployeeRepository {
	
	
	JdbcTemplate jdbcTemplate;

	public EmployeeRepositoryImpl() {
		
		

	}

	@Autowired
	public EmployeeRepositoryImpl(DataSource datasource) {

		jdbcTemplate = new JdbcTemplate(datasource);

		System.out.println(jdbcTemplate);

	}
	

	@Override
	public Employee addEmployee(Employee employee) {

		Employee emp = null;
		String insertEmp = "insert into employee values(?,?,?)";
		
		int count = jdbcTemplate.update(insertEmp,employee.getEid(),employee.getEname(),employee.getSalary());

		if(count>0) {
			emp = employee;
		}
		
		return emp;
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		String update = "update employee set ename = ? , salary = ? where eid = ?";
		Employee employee = null;
		int count =	jdbcTemplate.update(update,emp.getEname() , emp.getSalary() , emp.getEid());
		
		if(count>0) {
			employee = emp;
		}
	
	return employee;
		
	}



	@Override
	public String deleteEmployeeById(int eid) {

		String delete = "delete from employee where eid = ?";
		
		int count = jdbcTemplate.update(delete, eid);
		
		return count+ " record deleted";
	}

	@Override
	public List<Employee> getAllEmployees() {
		String select = "select eid,ename,salary from employee";

		List<Employee> list = jdbcTemplate.query(select, new EmployeeMapper());

		return list;
	}

	@Override
	public Employee getEmployeeById(int eid) {
		String select = "select eid,ename,salary from employee where eid = ?";
		
		Employee emp = jdbcTemplate.queryForObject(select,new EmployeeMapper(),eid);
		
		return emp;
		
	}

}
