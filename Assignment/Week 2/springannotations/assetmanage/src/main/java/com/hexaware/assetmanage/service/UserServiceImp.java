package com.hexaware.assetmanage.service;

import com.hexaware.assetmanage.dao.IUserDao;
import com.hexaware.assetmanage.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements IUserServices{
    @Autowired
    IUserDao dao;
    @Override
    public boolean insertUser(User user) {

        return dao.insertUser(user) ;
    }

    @Override
    public List<User> selectAll() {
        return dao.selectAll();
    }

    @Override
    public User selectByName(String user) {

        return dao.selectByName(user);
    }
}
