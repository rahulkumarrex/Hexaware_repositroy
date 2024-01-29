package com.hexaware.usermanage.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@Entity
@NamedQueries(
		{
			@NamedQuery(name="getAllUsers", query ="SELECT a FROM Users a"),
			 @NamedQuery(name = "getUserById", query = "SELECT u FROM Users u WHERE u.userid = :userId")
			
			
		})

public class Users {
	
	@Id
	private int userid;
	private String username;
	private String password;
	private String name;
	private String gender;
	private String contactNumber;
	private String address;
	
	
	
	
	
	public Users() {
		super();
	}
	public Users(int userid, String username, String password, String name, String gender, String contactNumber,
			String address) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Users [userid=" + userid + ", username=" + username + ", password=" + password + ", name=" + name
				+ ", gender=" + gender + ", contactNumber=" + contactNumber + ", address=" + address + "]";
	}
	
	

}
