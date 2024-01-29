package com.hexaware.hiibernate.service;

import java.util.List;
import com.hexaware.hiibernate.dao.UserDao;
import com.hexaware.usermanage.entity.Users;

public class UserService{
    UserDao dao = new UserDao();

    public List<Users> getAllUsers() {
        return dao.getAllUsers();
    }
    
    public Users getUserById(int userId) {
    	return dao.getUserById(userId);
    }
    
   public void addUser(Users user ) {
	   dao.addUser(user);
   }
	public void deleteById(int userId) {
		dao.deleteById(userId);
	}
}
