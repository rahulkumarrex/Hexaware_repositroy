package com.hexaware.assetmanage.dao;

import com.hexaware.assetmanage.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class UserDaoImp implements IUserDao{


    JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImp(DataSource datasource){
        jdbcTemplate = new JdbcTemplate(datasource);

    }
    @Override
    public boolean insertUser(User user) {
        String insertQuery = "insert into users(userid, username, password, name, gender, contactnumber, address) values(?, ?, ?, ?, ?, ?, ?)";
        int count = jdbcTemplate.update(insertQuery, user.getUserID(), user.getUsername(), user.getPassword(), user.getName(), user.getGender(), user.getNumber(), user.getAddress());

        return count > 0;
    }

    @Override
    public List<User> selectAll() {
        String selectQuery = "select userid, username, password, name, gender, contactnumber, address FROM users";
        return jdbcTemplate.query(selectQuery, new UserMapper());
    }


    @Override
    public User selectByName(String username) {
        String selectQueryById = "select userid, username, password, name, gender, contactnumber, address FROM users where username= ? ";

        try {
            return jdbcTemplate.queryForObject(selectQueryById, new UserMapper(), username);
        } catch (EmptyResultDataAccessException e) {
            // Handle the case where no user is found for the given username
            return null; // or throw a custom exception
        }
    }

}
