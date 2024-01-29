package com.hexaware.mappings.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department {

	@Id
	private int deptId;
	private String deptName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "dno")
	private Set<Employee> employeeSet = new HashSet<Employee>();

	public Department() {
		super();
	}

	public Department(int deptId, String deptName, Set<Employee> employeeSet) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.employeeSet = employeeSet;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Set<Employee> getEmployeeSet() {
		return employeeSet;
	}

	public void setEmployeeSet(Set<Employee> employeeSet) {
		this.employeeSet = employeeSet;
	}
	
	
	public void addEmploye(Employee emp) {
		
		Set<Employee> set = getEmployeeSet();
		set.add(emp);
		
//		this.employeeSet.add(emp);
		
		
	}
	
	
	
}
