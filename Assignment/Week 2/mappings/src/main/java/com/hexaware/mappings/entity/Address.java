package com.hexaware.mappings.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Address {
	

	@OneToOne(mappedBy = "address",cascade = CascadeType.ALL)
	Student student;



	@Id
	private int addressId;
	private String city;
	public int getAddressId() {
		return addressId;
	}
	
	public Address(Student student, int addressId, String city) {
		super();
		this.student = student;
		this.addressId = addressId;
		this.city = city;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(int addressId, String city) {
		super();
		this.addressId = addressId;
		this.city = city;
	}
	
	public Address() {
		super();
	}
	
}
