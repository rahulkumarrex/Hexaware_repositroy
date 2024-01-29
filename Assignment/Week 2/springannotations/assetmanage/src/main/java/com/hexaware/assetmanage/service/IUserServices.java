package com.hexaware.assetmanage.service;

import com.hexaware.assetmanage.model.User;

import java.util.List;

public interface IUserServices {

    public boolean insertUser(User user);
    public List<User> selectAll();
    public User selectByName(String user);

}
