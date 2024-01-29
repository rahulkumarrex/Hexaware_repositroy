package com.hexaware.assetmanage.dao;

import com.hexaware.assetmanage.model.User;

import java.util.List;

public interface IUserDao {
    public boolean insertUser(User user);
    public List<User> selectAll();
    public User selectByName(String user);

}
