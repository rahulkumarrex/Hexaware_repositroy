package com.hexaware.hibernate.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity

@NamedQueries(
		{
			@NamedQuery(name="geAllEmployees" , query="Select e from Employee e"),
			@NamedQuery(name="getEmployeeByName" , query = "select e from Employee e where e.ename = :name ")
		}
		)
public class User {
	
	@Id
	private int userID;
	private String username;
	private String password;
	private String name;
	private String gender;
	private String contactnumber;
	private String address;
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public User(int userID, String username, String password, String name, String gender, String contactnumber,
			String address) {
		super();
		this.userID = userID;
		this.username = username;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.contactnumber = contactnumber;
		this.address = address;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [userID=" + userID + ", username=" + username + ", password=" + password + ", name=" + name
				+ ", gender=" + gender + ", contactnumber=" + contactnumber + ", address=" + address + "]";
	}
	public List<User> geAllUser() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	

}
