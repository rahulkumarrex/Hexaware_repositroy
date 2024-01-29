package com.hexaware.hibernate;

import java.util.List;

import com.hexaware.hibernate.entity.User;

public class NamedQueryTest {

	public static void main(String[] args) {


		User dao = new User();
	List<User> list =	dao.geAllUser();
		
		System.out.println("Employees from Named Query");
		
		System.out.println(list);	
		
		
				User usrt =	dao.u();
				
				System.out.println(emp);

	}

}
