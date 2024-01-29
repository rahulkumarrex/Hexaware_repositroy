package com.hexaware.hiibernate.dao;

import java.util.List;

import com.hexaware.usermanage.entity.Users;

public interface IUserDao {
	public List<Users> getAllUsers();
	public Users getUserById(int userId);
	void addUser(Users user);
	void deleteById(int userId);
	
	
}
